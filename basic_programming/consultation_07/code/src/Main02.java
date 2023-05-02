import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main02 {
//     написать функцию, которая находит минимум в массиве
    public static int getMin(int[] array) {
        // предполагаем, что самый первый элемент минимальный
        int min = array[0];
        // бежим по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            // если нашли элемент, который оказался меньше текущего минимального
            if (array[i] < min) {
                // делаем минимальным его
                min = array[i];
            }
        }

        return min;
    }

    // функция, которая генерирует случайный массив
    public static int[] generateArray(int length, int bound) {
        // объявили генератор случайных чисел
        Random random = new Random();
        // создаем массив нужного размера
        int[] result = new int[length];
        // каждому элементу массива присваиваем случайное число с верхней границей
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(bound);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считать размер первого массива, который мы хотим создать
        int l1 = scanner.nextInt();
        // считываем верхний диапазон значений элементов первого массива - какие числа будем генерировать
        int b1 = scanner.nextInt();
        // вызываем функции и получаем результат
        int[] a = generateArray(l1, b1);
        int[] b = generateArray(50, 150);

        // распечатаем массив
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        // вызываем функции и получаем результат для разных элементов массива
        int min1 = getMin(a);
        int min2 = getMin(b);

        System.out.println(min1);
        System.out.println(min2);
    }
}
