package our_application.services;

import our_application.domain.User;

import java.util.List;

public interface UserService {

    User addUser(String email, String password);

    List<User> getAllUsers();
}