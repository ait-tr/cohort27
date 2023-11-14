package client;

import our_application.controllers.UserController;
import our_application.repositories.UserRepository;
import our_application.repositories.UserRepositoryMap;
import our_application.services.UserService;
import our_application.services.UserServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserRepository repository = new UserRepositoryMap();
        UserService service = new UserServiceImpl(repository);
        UserController controller = new UserController(service, scanner);

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Регистрация нового пользователя.");
            System.out.println("2. Получение всех пользователей.");
            System.out.println("0. Выход.");

            String input = scanner.nextLine();

            switch (input) {
                case "0":
                    System.out.println("Завершение работы.");
                    return;
                case "1":
                    try {
                        controller.addUser();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    controller.getAllUsers();
                    break;
                default:
                    System.out.println("Некорректный ввод!");
                    break;
            }
        }
    }
}