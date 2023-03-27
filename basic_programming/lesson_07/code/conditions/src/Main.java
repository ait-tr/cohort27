import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    // если число четное - делим на два, если нечетное - прибавляем 1
    // выводим число
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считываем число
        int number = scanner.nextInt();
        // берем остаток от деления на 2
        int mod = number % 2;
        // применим операцию ==, результат которой будет true, если операнд слева и справа эквивалентны
        boolean numberIsEven = mod == 0; // numberIsEven - true, если число четное, false - если нечетное

        if (numberIsEven == true) {
            number = number / 2;
        } else {
            number = number + 1;
        }
        // выводим число
        System.out.println(number);
    }
}
