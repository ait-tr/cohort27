package booleans;

import java.util.Random;
import java.util.Scanner;

public class Main2Boolean {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // генерируется случайное число от 0 до 4
        int randomNumber = random.nextInt(5); // 0 .. 99
        // пользователь вводит число
        int userNumber = scanner.nextInt();

        System.out.println(randomNumber);

        // присваиваем true либо false всем трем вариантам
        boolean lessThan = userNumber < randomNumber; // {false, true}
        // больше
        boolean greaterThan = userNumber > randomNumber;
        // равно
        boolean equals = userNumber == randomNumber;

        if (lessThan == true) {
            System.out.println("Число меньше");
        } else if (greaterThan == true) {
            System.out.println("Число больше");
        } else if (equals == true) {
            System.out.println("Число равно");
        }

    }
}
