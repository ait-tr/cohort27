package our_application.repositories;

import our_application.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryMap implements UserRepository {

    private Map<Long, User> database = new HashMap<>();
    private long idCounter;

    @Override
    public User getById(long id) {
        return database.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void save(User user) {
        user.setId(++idCounter);
        database.put(user.getId(), user);
    }

    @Override
    public void deleteById(long id) {
        database.remove(id);
    }

    @Override
    public void update(User user) {
        database.put(user.getId(), user);
    }

    @Override
    public User getByEmail(String email) {
        // 1 вариант - через цикл
//        for (User user : database.values()) {
//            if (email.equals(user.getEmail())) {
//                return user;
//            }
//        }
//        return null;

        return database.values().stream()
                .filter(x -> x.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}