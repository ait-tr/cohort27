import java.util.Scanner;

public class Task11_v1 {
    public static void main(String[] args) {
        int englishUpperLetterFirst = 'A';
        int englishUpperLetterLast = 'Z';

        int englishLowerLetterFirst = 'a';
        int englishLowerLetterLast = 'z';

        System.out.println(englishUpperLetterFirst);
        System.out.println(englishUpperLetterLast);
        System.out.println(englishLowerLetterFirst);
        System.out.println(englishLowerLetterLast);

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        int code = c;

        if (c >= 65 && c <= 90) {
            System.out.println("Большая буква английского алфавита");
        } else {
            System.out.println("Что-то другое");
        }
    }
}