import java.util.Scanner;

// считать три числа A, B, C
// распечатать числа тройками от 1 до A, от 1 до B, от 1 до С

// 4, 7, 5

// пример для двух
// 4, 7 A = [1, 2, 3, 4], B = [1, 2, 3, 4, 5, 6, 7]

// 1, 1
// 1, 2
// 1, 3
// 1, 4
// 1, 5
// 1, 6
// 1, 7
// 2, 1
// 2, 2
// ....
// 2, 7
// 3, 1
// 3, 2
// ...
// 4, 1
// 4, 2
// 4, 3
// 4, 4
// 4, 5
// 4, 6
// 4, 7

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int currentA = 1;
        int currentB = 1;
        int currentC = 1;

        while (currentA <= a) {
            while (currentB <= b) {
                while (currentC <= c) {
                    System.out.println(currentA + ", " + currentB + ", " + currentC);
                    currentC++;
                }
                currentC = 1;
                currentB++;
            }
            currentB = 1;
            currentA++;
        }
    }
}

