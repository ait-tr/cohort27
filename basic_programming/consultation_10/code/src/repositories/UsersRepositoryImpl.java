package repositories;

import exceptions.ProblemWithFileException;
import model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UsersRepositoryImpl implements UsersRepository {

    private String fileName;

    public UsersRepositoryImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line = reader.readLine();
            while (line != null) {
                User user = new User(line);
                line = reader.readLine();
                users.add(user);
            }
        } catch (IOException e) {
            // выбросить непроверяемое исключение
//            throw new IllegalStateException("Произошла ошибка");
            throw new ProblemWithFileException();
        }
        return users;
    }

    @Override
    public void save(User user) {

    }
}
