package booleans;

import java.util.Random;
import java.util.Scanner;

public class Main3Boolean {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // генерируется случайное число от 0 до 4
        int randomNumber = random.nextInt(5); // 0 .. 99
        // пользователь вводит число
        int userNumber = scanner.nextInt();

        System.out.println(randomNumber);

        // if(true), if (false)
        if (userNumber < randomNumber) {
            System.out.println("Число меньше");
        } else if (userNumber > randomNumber) {
            System.out.println("Число больше");
        } else {
            System.out.println("Число равно");
        }

        /*

            if (e) {
                s1;
            } else if (e1) {
                s2;
            } else {
                s3;
            }

            e, e1 - true, false
            Если e == true, то выполняется s1
            Если e == false, а e1 == true, то выполняется s2
            Если e == false, e1 == false, то выполняется s3

            if (e) {
                s1;
            }

            if (e1) {
                s2;
            }

            if (e2) {
                s3;
            } else {
                s4;
            }

            Если e == true, выполняем s1
            Если e1 == true (независимо от e), выполняем s2
            s4 - выполняется только тогда, когда e2 - false

         */
    }
}
