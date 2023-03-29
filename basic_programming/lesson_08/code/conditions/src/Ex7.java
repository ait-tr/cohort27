import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // считать два числа A и B
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // A больше B
        boolean o1 = a > b;
        // A оканчивается на 5
        boolean o2 = a % 10 == 5;
        // (A больше B или A оканчивается на 5)
        boolean o1o2Result = o1 | o2;

        //  (B оканчивается на 6 или A - четное)

        // B оканчивается на 6
        boolean o3 = b % 10 == 6;
        //  A - четное
        boolean o4 = a % 2 == 0;
        //  (B оканчивается на 6 или A - четное)
        boolean o3o4Result = o3 | o4;

        // вывести значение выражение
        // (A больше B или A оканчивается на 5) и
        // (B оканчивается на 6 или A - четное)

//        boolean result = o1o2Result & o3o4Result;
//        System.out.println((a > b | a % 10 == 5) & (b % 10 == 6 | a % 2 == 0));
        System.out.println((o1 | o2) & (o3 | o4));


        // A = 42
        // B = 16
        // A больше B - true
        // A оканчивается на 5 - false
        // B оканчивается на 6 - true
        // A четное - true
        // (true или false) и (true или true)
        // true и true -> true

        // A = 3
        // B = 10
        // A больше B - false
        // A оканчивается на 5 - false
        // B оканчивается на 6 - false
        // A четное - false
        // (false или false) и (false или false)
        // false и false -> false

        char camelCase;

    }
}