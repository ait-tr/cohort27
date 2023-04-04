import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // распечатать все простые числа от 0 до N

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        while (i <= n) {

            int k = 2;

            boolean isPrime = true;

            while (k <= i - 1) {
                if (i % k == 0) {
                    isPrime = false;
                }
                k++;
            }

            if (isPrime == true) {
                System.out.println(i);
            }

            i++;
        }
    }
}
