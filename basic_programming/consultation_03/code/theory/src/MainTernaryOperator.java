import java.util.Scanner;

public class MainTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // result - "Четное", если number - четное
        // result - "Нечетное", если number - нечетное

//        String result;
//
//        if (number % 2 == 0) {
//            result = "Четное";
//        } else {
//            result = "Нечетное";
//        }

        String result = (number % 2 == 0) ? "Четное" : "Нечетное";



        System.out.println(result);

    }
}
