package homeworks;

import java.util.Scanner;

public class Task13_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // флаг - он true, пока программа запущена
        // если хотим завершить программу - ставим false
        boolean isRun = true;
        // цикл работает до тех пор, пока isRun - true
        // то есть он может работать бесконечно
        while (isRun) {
            // постоянно выводим меню
            System.out.println("1. Получить степень числа");
            System.out.println("2. Получить среднее арифметическое");
            System.out.println("0. Завершить работу");
            // ждем команду, как только пользователь введет номер команды - идем дальше
            int command = scanner.nextInt();
            // если команда - 1
            if (command == 1) {
                // считываем число
                int number = scanner.nextInt();
                // считываем степень
                int pow = scanner.nextInt();
                // number возвести в степень pow
                System.out.println("Результат работы");
            } else if (command == 2) {
                // если команда - 2
                /*
                       (3 + 8 + 9 + 10) / 4 = 7.5
                       numbersSum = 3 + 8 + 9 + 10
                       numbersCount = 4
                       average = 7.5
                 */

                // считываем - сколько всего чисел у нас с вами будет?
                int numbersCount = scanner.nextInt();
                // заводим переменную, в которой храним сумму всех чисел
                double numbersSum = 0;
                // заводим цикл, который сработает numbersCount-раз
                for (int i = 0; i < numbersCount; i++) {
                    // считываем очередное число
                    int currentNumber = scanner.nextInt();
                    // кидаем число в общую сумму всех чисел
                    numbersSum = numbersSum + currentNumber;
                }
                // рассчитываем
                double average = numbersSum / numbersCount;
                System.out.println(average);
            } else if (command == 0) {
                // если пользователь захотел завершить работу и ввел 0
                // делаешь флаг false
                isRun = false;
            }
        }
    }
}
