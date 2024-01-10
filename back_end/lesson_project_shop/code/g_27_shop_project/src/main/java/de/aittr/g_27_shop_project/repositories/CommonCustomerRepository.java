package de.aittr.g_27_shop_project.repositories;

import de.aittr.g_27_shop_project.domain.CommonCart;
import de.aittr.g_27_shop_project.domain.interfaces.Cart;
import de.aittr.g_27_shop_project.domain.interfaces.Customer;
import de.aittr.g_27_shop_project.repositories.interfaces.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import static de.aittr.g_27_shop_project.repositories.DBConnector.getConnection;

@Repository
public class CommonCustomerRepository implements CustomerRepository {

    private final String ID = "id";

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