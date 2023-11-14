package our_application.repositories;

import our_application.domain.User;

import java.util.List;

// CRUD - Create, read, update, delete
public interface CrudRepository {

    User getById(long id);

    List<User> getAll();

    void save(User user);

    void deleteById(long id);

    void update(User user);
}