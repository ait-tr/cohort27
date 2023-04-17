import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {88, 58, 73, 53, 31, 68, 1, 52, 31, 73, 54, 86, 5, 8, 31};

        Scanner scanner = new Scanner(System.in);

        int numberForSearch = scanner.nextInt();
        // индекс искомого числа
        int index = -1;
        // 0 ... 14
        for (int i = 0; i < a.length; i++) {

            if (a[i] == numberForSearch) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
