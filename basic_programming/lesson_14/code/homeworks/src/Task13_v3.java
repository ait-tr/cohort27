package homeworks;

import java.util.Scanner;

public class Task13_v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        while (isRun) {
            System.out.println("1. Получить степень числа");
            System.out.println("2. Получить среднее арифметическое");
            System.out.println("0. Завершить работу");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    int number = scanner.nextInt();
                    int pow = scanner.nextInt();
                    System.out.println("Результат работы");
                    break;
                case 2:
                    int numbersCount = scanner.nextInt();
                    double numbersSum = 0;
                    for (int i = 0; i < numbersCount; i++) {
                        int currentNumber = scanner.nextInt();
                        numbersSum = numbersSum + currentNumber;
                    }
                    double average = numbersSum / numbersCount;
                    System.out.println(average);
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Команда не распознана");
            }
        }
    }
}
