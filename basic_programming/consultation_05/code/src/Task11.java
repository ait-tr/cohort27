import java.util.Scanner;

public class Task11 {

    /*
    Task 11
    Считать с консоли символ.

    Вывести 'English Letter', если символ - большая или маленькая буква английского алфавита

    Вывести 'Cyrillic Letter', если символ - большая или маленькая буква кириллицы

    Вывести Digit, если символ - цифра
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            System.out.println("English letter");
        } else if (c >= 'А' && c <= 'Я' || c >= 'а' && c <= 'я') {
            System.out.println("Russian letter");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit");
        }
    }
}
