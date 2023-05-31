package services;

import model.User;
import repositories.UsersRepository;

import java.util.List;

public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public void addUser(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Имя слишком короткое");
        }
        User user = new User(name);
        usersRepository.save(user);
    }
}
