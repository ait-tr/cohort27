package de.aittr.g_27_rest_demo.repositories;

import de.aittr.g_27_rest_demo.domain.Dog;
import de.aittr.g_27_rest_demo.domain.SimpleDog;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class DogRepository implements CrudRepository<Dog> {

    private final String DB_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    private final String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    private final String DB_NAME = "animals";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "77777";

    private final String ID = "dog_id";
    private final String AGE = "age";
    private final String COLOR = "color";
    private final String WEIGHT = "weight";

    private Connection getConnection() {
        try {
            Class.forName(DB_DRIVER_PATH);
            // jdbc:mysql://localhost:3306/animals?user=root&password=77777
            String dbUrl = String.format("%s%s?user=%s&password=%s",
                    DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD);
            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Dog save(Dog obj) {
        return null;
    }

    @Override
    public Dog getById(int id) {
        try (Connection connection = getConnection()) {

            Statement statement = connection.createStatement();
            String query = String.format("select * from dog where dog_id = %d;", id);
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int age = resultSet.getInt(AGE);
                String color = resultSet.getString(COLOR);
                double weight = resultSet.getDouble(WEIGHT);

                Dog dog = new SimpleDog(id, age, color, weight);
                return dog;
            }

            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Dog> getAll() {
        try (Connection connection = getConnection()) {

            String query = "select * from dog;";
            ResultSet resultSet = connection.createStatement().executeQuery(query);

            List<Dog> result = new ArrayList<>();

            while (resultSet.next()) {

                int id = resultSet.getInt(ID);
                int age = resultSet.getInt(AGE);
                String color = resultSet.getString(COLOR);
                double weight = resultSet.getDouble(WEIGHT);
                result.add(new SimpleDog(id, age, color, weight));
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(int id) {
        try (Connection connection = getConnection()) {

            String query = String.format("DELETE FROM `dog` WHERE (`dog_id` = '%d');", id);
            connection.createStatement().execute(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        double weight = 12.34;
        String query = String.format(Locale.US, "%.2f", weight);
        System.out.println(query);
    }
}