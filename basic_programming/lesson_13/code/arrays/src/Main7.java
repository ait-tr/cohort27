import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        int[] array = {-5, 1, 8, 30, 41, 45, 52, 53, 54, 58, 68, 73, 80, 86, 88};

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int left = 0;
        int right = array.length - 1;
        // вычисляем центр между двумя числами
        // для примера left = 25 right = 78
        // middle = 25 + (78 - 25) / 2 = 51
        int middle = left + (right - left) / 2;
        // если искомое число по своему значению меньше, чем центральный элемент массива
        if (number < array[middle]) {
            System.out.println("Число слева от центра - " + array[middle]);
            right = middle - 1;
            System.out.println("Новая правая граница - " + array[right]);
            System.out.println("Старая левая - " + array[left]);
        } else if (number > array[middle]) {
            System.out.println("Число справа от центра " + array[middle]);
            left = middle + 1;
            System.out.println("Новая левая граница - " + array[left]);
            System.out.println("Старая правая граница - " + array[right]);
        } else {
            System.out.println("Число по центру");
        }

    }
}
