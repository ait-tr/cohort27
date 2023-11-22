package lesson_04.task_1;

import java.util.Scanner;

public class UserInputTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите возраст:");

        int age;

        try {
            // Программа пробует выполнить код,
            // написанный в данном блоке
            age = Integer.parseInt(scanner.nextLine());

        } catch (Exception e) {
            // Если при выполнении блока try возникает ошибка,
            // мы попадаем в этот блок catch.
            // Если ошибка не возникает, блок catch не выполняется
            System.out.println("Некорректные данные! Значение возраста по умолчанию принято 0.");
            age = 0;
            e.printStackTrace();
            System.out.println("Причина ошибки - " + e.getCause());
            System.out.println("Сообщение об ошибке - " + e.getMessage());
            System.out.println("Пользователем введены следующие некорректные данные: " + e.getMessage().split(" ")[3]);
        }

        // Cat cat = new Cat();

        System.out.printf("Имя - %s, возраст - %d.\n", name, age);
        System.out.println("Работа программы завершена успешно!");
    }
}