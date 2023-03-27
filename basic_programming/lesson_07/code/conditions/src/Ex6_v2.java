import java.util.Scanner;

public class Ex6_v2 {
    // считать два числа <a> и <b>
    // вывести максимальное из них
    // гарантируется, что они не равны

    // 10, 20
    // вывести - 20

    // 5, 7
    // вывести - 7

    // 10 минут максимум
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // если (а больше b)
        if (a > b) {
            //  то выводим а
            System.out.println(a);
            // иначе
        } else {
            //  выводим b
            System.out.println(b);
        }

    }
}
