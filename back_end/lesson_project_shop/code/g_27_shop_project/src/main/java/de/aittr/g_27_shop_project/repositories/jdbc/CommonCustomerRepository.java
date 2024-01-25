package de.aittr.g_27_shop_project.repositories.jdbc;

import de.aittr.g_27_shop_project.domain.jdbc.CommonCart;
import de.aittr.g_27_shop_project.domain.jdbc.CommonCustomer;
import de.aittr.g_27_shop_project.domain.jdbc.CommonProduct;
import de.aittr.g_27_shop_project.domain.interfaces.Cart;
import de.aittr.g_27_shop_project.domain.interfaces.Customer;
import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.repositories.interfaces.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.aittr.g_27_shop_project.repositories.jdbc.DBConnector.getConnection;

@Repository
public class CommonCustomerRepository implements CustomerRepository {

    private final String ID = "id";
    private final String CUSTOMER_ID = "cu.id";
    private final String CART_ID = "ca.id";
    private final String CUSTOMER_NAME = "cu.name";
    private final String PRODUCT_ID = "product_id";
    private final String PRODUCT_NAME = "p.name";
    private final String PRICE = "price";
    private final String IS_ACTIVE = "is_active";

    @Override
    public Customer save(Customer customer) {
        try (Connection connection = getConnection()) {

            String query = String.format("INSERT INTO `customer` (`name`, `is_active`) " +
                    "VALUES ('%s', '1');", customer.getName());
            connection.createStatement().execute(query);

            query = "select id from customer order by id desc limit 1;";
            ResultSet resultSet = connection.createStatement().executeQuery(query);

            resultSet.next();
            int id = resultSet.getInt(ID);
            customer.setId(id);

            query = String.format("INSERT INTO `cart` (`customer_id`) VALUES ('%d');", id);
            connection.createStatement().execute(query);

            query = "select id from cart order by id desc limit 1;";
            resultSet = connection.createStatement().executeQuery(query);

            resultSet.next();
            id = resultSet.getInt(ID);

            Cart cart = new CommonCart(id);
            customer.setCart(cart);

            return customer;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> getAll() {
        try (Connection connection = getConnection()) {

            String query = "select cu.id, cu.name, ca.id, cp.product_id, p.name, p.price, p.is_active " +
                    "from customer as cu " +
                    "left join cart as ca on cu.id = ca.customer_id " +
                    "left join cart_product as cp on ca.id = cp.cart_id " +
                    "left join product as p on cp.product_id = p.id " +
                    "where cu.is_active = 1;";

            ResultSet resultSet = connection.createStatement().executeQuery(query);
            Map<Integer, Customer> customers = new HashMap<>();

            // "id"   "cu.id"
            while (resultSet.next()) {

                int customerId = resultSet.getInt(CUSTOMER_ID);
                Customer customer;

                // Создаём объект покупателя либо получаем его из мапы, если он уже был ранее создан
                if (customers.containsKey(customerId)) {
                    customer = customers.get(customerId);
                } else {
                    // Создаём объект корзины
                    int cartId = resultSet.getInt(CART_ID);
                    Cart cart = new CommonCart(cartId);

                    String customerName = resultSet.getString(CUSTOMER_NAME);
                    customer = new CommonCustomer(customerId, true, customerName, cart);
                    customers.put(customerId, customer);
                }

                // Создаём объект продукта и помещаем его в корзину
                // (если продукт активен)
                boolean isProductActive = resultSet.getBoolean(IS_ACTIVE);
                if (isProductActive) {
                    int productId = resultSet.getInt(PRODUCT_ID);
                    String productName = resultSet.getString(PRODUCT_NAME);
                    double price = resultSet.getDouble(PRICE);
                    Product product = new CommonProduct(productId, productName, price);
                    customer.getCart().addProduct(product);
                }
            }

            return new ArrayList<>(customers.values());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}