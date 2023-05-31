package repositories;

import model.User;

import java.util.List;

// CRUD - Create, Read, update, delete
public interface UsersRepository {
    List<User> findAll();

    void save(User user);
}
