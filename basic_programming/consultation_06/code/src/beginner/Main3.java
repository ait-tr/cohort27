package beginner;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // M = K * N + T
        // 28 = 2 * 10 + 8
        // 28 / 10 = 2
        // 28 % 10 = 8
        // 23 = 2 * 10 + 3
        // 23 % 10 = 3

        // если number четное нужно вывести его половину, 20 -> 10,
        // если нечетное - вывести его же, увеличенное в два раза
        // если число оканчивается на 8, то вывести его же, деленное на 4
        // 3 -> 6
        // 10 -> 5
        // 20 - 10
        // 7 -> 14
        // number / 2
        while (number != -1) {
            if (number % 2 == 0) {
                // если число четное - вывести его половину
                System.out.println(number / 2);

                if (number % 10 == 8) {
                    // проверить, оканчивается оно на 8)
                    System.out.println(number / 4);
                    number = scanner.nextInt();
                }
            } else {
                System.out.println(number * 2);
            }

            System.out.println("Закончили");
        }
    }
}
