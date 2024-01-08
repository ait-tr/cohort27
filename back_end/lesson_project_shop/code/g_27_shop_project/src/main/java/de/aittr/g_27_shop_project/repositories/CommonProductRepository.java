package de.aittr.g_27_shop_project.repositories;

import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.repositories.interfaces.ProductRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Locale;

import static de.aittr.g_27_shop_project.repositories.DBConnector.getConnection;

@Repository
public class CommonProductRepository implements ProductRepository {

    private final String ID = "id";

    @Override
    public Product save(Product product) {
        try (Connection connection = getConnection()) {

            String query = String.format(Locale.US, "INSERT INTO `product` (`name`, `price`, `is_active`) " +
                    "VALUES ('%s', '%.2f', '1');", product.getName(), product.getPrice());
            connection.createStatement().execute(query);

            query = "select id from product order by id desc limit 1;";
            ResultSet resultSet = connection.createStatement().executeQuery(query);

            resultSet.next();
            int id = resultSet.getInt(ID);
            product.setId(id);
            return product;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}