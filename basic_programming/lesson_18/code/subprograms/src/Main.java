import java.util.Scanner;

public class Main {

    // задачи на массивы
    // массив передаем в формальный параметр
    // никаких System.out.println
    // никаких Scanner-ов внутри функций, только внутри main
    public static int getPositiveNumbersCount(int[] array) {
        return 0;
    }

    // специальная функция, которая умеет считывать массив
    public static int[] readArrayFromConsole(int length, Scanner scanner) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {4, -1, 10, 11};

        int count = scanner.nextInt();
        int[] b = new int[count];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = readArrayFromConsole(5, scanner);

        int c1 = getPositiveNumbersCount(a);
        int c2 = getPositiveNumbersCount(b);
        int c3 = getPositiveNumbersCount(c);
    }
}