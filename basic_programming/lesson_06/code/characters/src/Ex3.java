package characters;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // нужно считать с консоли код символа
        Scanner scanner = new Scanner(System.in);
        // считали код символа
        int code = scanner.nextInt();
        // получили символ, который лежит под этим кодом
        char character = (char)code;
        // выводим символ в консоль
        System.out.println(character);
        // например:

        // ввел: 70
        // программа вывела: F
    }
}
