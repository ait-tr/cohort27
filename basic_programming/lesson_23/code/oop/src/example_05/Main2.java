package example_05;

import java.util.Scanner;

public class Main2 {
    //        registry.temperatures[2] = -10000;
//        registry.count = -10;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TemperatureRegistry registryFebruary = new TemperatureRegistry(4);
        TemperatureRegistry registryDecember = new TemperatureRegistry(5);

        while (true) {
            System.out.println("1. Добавить запись в февраль");
            System.out.println("2. Добавить запись в декабрь");
            System.out.println("0. Остановить ввод и показать результат");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Добавляем запись в февраль");
                double value = scanner.nextDouble();
                registryFebruary.addTemperature(value);
            } else if (command == 2) {
                System.out.println("Добавляем запись в декабрь");
                double value = scanner.nextDouble();
                registryDecember.addTemperature(value);
            } else if (command == 0) {
                registryFebruary.print();
                registryDecember.print();
                break;
            }
        }
    }
}
