package our_application.services;

import our_application.domain.User;
import our_application.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User addUser(String email, String password) {

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Почта не может быть пустой!");
        }

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Пароль не может быть пустым!");
        }

        if (password.length() < 5) {
            throw new IllegalArgumentException("Пароль слишком простой!");
        }

        User existedUser = repository.getByEmail(email);

        if (existedUser != null) {
            throw new IllegalArgumentException("Пользователь с такой почтой уже существует!");
        }

        User user = new User(email, password);
        repository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.getAll();
    }
}