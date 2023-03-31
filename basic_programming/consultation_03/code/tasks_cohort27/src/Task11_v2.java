import java.util.Scanner;

public class Task11_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            System.out.println("Большая буква английского алфавита");
        } else {
            System.out.println("Что-то другое");
        }
    }
}
