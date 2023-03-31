import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // распечатать все четные числа от from к to

        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        int currentNumber = from;

        if (currentNumber % 2 == 1) {
            currentNumber = currentNumber + 1;
        }

        while (currentNumber <= to) {
            System.out.println(currentNumber);
            currentNumber = currentNumber + 2;
        }
    }
}
