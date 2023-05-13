package example_05;

import java.util.Scanner;

public class Main {
    // реализовать программу, которая будет собирать данные по погоде
    // вывести среднюю погоду за определенный промежуток времени

    // 1 этап - научиться собирать данные по погоде
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // массив чисел, куда мы будем складывать температуру по дням
        // 01-го числа - 32 градус
        // 02-го числа - не записал
        // 03-го числа - 31 градус
        // 5-числа - 20 градусов
        // [32, 31, 20]
        double[] temperatures = new double[10];
        int count = 0; // сколько раз мы в массив что-то записали

        int k = 0;
        while (k < 5) {
            System.out.println("Введите температуру:");

            double temperature = scanner.nextDouble(); // // считали температуру
            temperatures[count] = temperature; // записали новую температуру в массив
            count++; // увеличили количество сделанных записей

            k++;
        }

        int i = 0;


    }
}
