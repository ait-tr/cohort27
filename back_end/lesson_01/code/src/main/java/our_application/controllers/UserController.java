package our_application.controllers;

import our_application.domain.User;
import our_application.services.UserService;

import java.util.List;
import java.util.Scanner;

public class UserController {

    private UserService service;
    private Scanner scanner;

    public UserController(UserService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void addUser() {

        System.out.println("Введите email:");
        String email = scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User user = service.addUser(email, password);
        System.out.println("Пользователь успешно сохранён!");
        System.out.println(user);
    }

    public void getAllUsers() {
        List<User> users = service.getAllUsers();
        System.out.println("Список всех пользователей:");
//        for (User user : users) {
//            System.out.println(user);
//        }

//        users.forEach(System.out::println);
        users.forEach(x -> System.out.println(x));
    }
}