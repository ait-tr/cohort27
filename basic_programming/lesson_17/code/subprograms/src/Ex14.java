package subprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ex14 {
    // написать функцию, которая возвращает количество нечетных элементов в массиве
    // в каком-то заданном промежутке

    // from - от
    // to - до
    public static int countOfOddNumberInArray(int[] array, int from, int to) {
        int count = 0;

        for (int i = from; i <= to; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static int rectangleArea(int a, int b) {
        return a * b;
    }

    // Хотим количество нечетных элементов в массиве [4, 10, 5, 13, 21, 45, 8, 17] в промежутке
    // от 3 до 6:
    // промежуток: 13, 21, 45, 8
    // здесь нечетных чисел - 3
    // то есть функция должна вернуть 3
    // в Main проверить работоспособность
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {4, 10, 5, 13, 21, 45, 8, 17};

        int start = scanner.nextInt();
        int finish = scanner.nextInt();

//        BufferedReader reader = new FileReader("input.txt");
        // int start1 = считали из файла

        int count1 = countOfOddNumberInArray(a, start, finish); // получаю количество в [2, 6] из консоли
        int count3 = countOfOddNumberInArray(a, 3, 5); // получается в [3, 5] из кода
//        int count2 = countOfOddNumberInArray(a, start1, finish1); // получается в [1, 4] из файла
    }
}
