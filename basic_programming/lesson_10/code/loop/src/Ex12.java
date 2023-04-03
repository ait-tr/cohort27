import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for (int currentA = 1; currentA <= a; currentA++) {
            for (int currentB = 1; currentB <= b; currentB++) {
                for (int currentC = 1; currentC <= c; currentC++) {
                    System.out.println(currentA + ", " + currentB + ", " + currentC);
                }
            }
        }
    }
}
