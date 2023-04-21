import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // создали массив на 10 элементов
        int[] a = new int[10];
        // число элементов, которое мы в массив положили
        int count = 0;

        while (true) {
            // считываем новый элемент
            int number = scanner.nextInt();
            // кладем в массив под индексом count
            a[count] = number;
            // увеличиваем count
            count++;

            // массив заполнен
            // количество элементов равно длине массива
            if (count == a.length) {
                // создаем переменную, значение которой равно длине массива, увеличенное на полтора
                // было 10, станет - 15, было 20, станет - 30
                // 10 + 10/2 = 15
                // 100 + 100/2 = 150
                int newLength = a.length + a.length / 2;
                // создаем новый пустой массив, длина которого в полтора раза больше предыдущей
                int[] newArray = new int[newLength];
                // нужно все старые элементы перенести в новый массив
                for (int i = 0; i < a.length; i++) {
                    newArray[i] = a[i];
                }
                // во всей программе, мы работаем с массивом a, теперь нам просто нужно
                // чтобы переменная a (ссылочный тип) указывала на новый массив
                a = newArray;
                System.out.println("Массив увеличен");
            }
            // пока i меньше чем count
            for (int i = 0; i < count; i++) {
                // выводим элемент
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}