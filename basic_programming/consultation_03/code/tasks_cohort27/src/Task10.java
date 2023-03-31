import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println(max);

    }
}
