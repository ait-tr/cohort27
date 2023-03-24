package characters;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считать символ с консоли - это точно будет заглавная буква АНГЛ алфавита
        // вывести соответствующую ей маленькую букву английского алфавита
        // ввел: B
        // выводит: b
        char bigLetter = scanner.next().charAt(0);

        // A - 65
        // a - 97
        // B - 66
        // b - 98

        // b - B = a - A = 98 - 66 = 97 - 65 = 32

        int smallLetterCode = bigLetter + 32;
        // получаем символ из кода символа
        char smallLetter = (char)smallLetterCode;
        System.out.println(smallLetter);

    }
}
