package consultation;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // считать пять цифр и вывести число, на основе этих пяти цифр, которое больше в два раза того, что ввели
        // 5
        // 7
        // 3
        // 4
        // 1
        // 57341 * 2 = 114 682
        Scanner scanner = new Scanner(System.in);
        char digit1 = scanner.next().charAt(0);
        char digit2 = scanner.next().charAt(0);
        char digit3 = scanner.next().charAt(0);
        char digit4 = scanner.next().charAt(0);
        char digit5 = scanner.next().charAt(0);

        int code1 = digit1;
        int code2 = digit2;
        int code3 = digit3;
        int code4 = digit4;
        int code5 = digit5;

        int digit1AsNumber = code1 - '0';
        int digit2AsNumber = code2 - '0';
        int digit3AsNumber = code3 - '0';
        int digit4AsNumber = code4 - '0';
        int digit5AsNumber = code5 - '0';

        // abcdf = a * 10000 + b * 1000 + c * 100 + d * 10 + f * 1
        // 12345 = 1 * 10000 + 2 * 1000 + 3 * 100 + 4 * 10 + 5 * 1 = 12345
        int number = digit1AsNumber * 10000 + digit2AsNumber * 1000 + digit3AsNumber * 100
                + digit4AsNumber * 10 + digit5AsNumber;

        System.out.println(number * 2);
    }
}
