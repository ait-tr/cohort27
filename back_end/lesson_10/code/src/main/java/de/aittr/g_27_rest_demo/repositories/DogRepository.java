package de.aittr.g_27_rest_demo.repositories;

import de.aittr.g_27_rest_demo.domain.Dog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class DogRepository implements CrudRepository<Dog> {

    private final String DB_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    private final String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    private final String DB_NAME = "animals";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "77777";

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
        return null;
    }

    @Override
    public List<Dog> getAll() {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}