import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int from = scanner.nextInt(); // 10
        int to = scanner.nextInt(); // 15

       // надеюсь, что у меня всего 5 чисел
        int currentNumber = from; // currentNumber = 10
//        System.out.println(currentNumber); // -> 10
//        currentNumber = currentNumber + 1; // 11
//        System.out.println(currentNumber); // -> 11
//        currentNumber = currentNumber + 1; // 12
//        System.out.println(currentNumber); // -> 12
//        currentNumber = currentNumber + 1; // 13
//        System.out.println(currentNumber); // -> 13

        // a <= b
        // a < b + 1
        // 14 <= 14
        // 14 < 15

        // 16 <= 15 - false
        while (currentNumber <= to) {
            currentNumber = currentNumber + 10; // 16
            System.out.println(currentNumber);
        }

        System.out.println("В итоге в currentNumber = " + currentNumber);

        System.out.println("Цикл закончен");
    }
}
