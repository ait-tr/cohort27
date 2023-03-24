package characters;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // считать два символа-буквы и вывести букву, которая
        // находится между ними
        Scanner scanner = new Scanner(System.in);
        char from = scanner.next().charAt(0);
        char to = scanner.next().charAt(0);

        // 50, 70 -> 50 + 70 = 120, 120 / 2 = 60
        // 50, 90 -> 50 + 90 = 140, 140 / 2 = 70

        // A = 65, F = 70, middle = (65 + 70) / 2 = 135 / 2 = 67, ост - 1, 67 * 2 + 1 = 135, middle = 67
        int middle = (from + to) / 2;
        // получаем символ из середины
        char charAtMiddle = (char)middle;
        System.out.println(charAtMiddle);

        // ввел:
        // A
        // G
        // вывел: D
        // или
        // A
        // F
        // вывел: C
    }
}
