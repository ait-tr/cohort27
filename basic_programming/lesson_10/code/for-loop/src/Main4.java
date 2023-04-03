import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // вывести числа в обратном порядке от a до b
        // только те, которые делятся на 3
        for (int i = b; i >= a; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // вывести числа в обратном порядке от a до b
        // только те, которые делятся на 3
        // первые 4 числа
        for (int i = b, count = 0; i >= a; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                count++;
            }
            // если count дошел до 4-х
            if (count == 4) {
                // останавливаем цикл
                break;
            }
        }

        // вывести числа в обратном порядке от a до b
        // только те, которые делятся на 3
        // пропустить фрагмент от 75 до 48
        for (int i = b; i >= a; i--) {
            if (i <= 75 & i >= 48) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Выходим из цикла");
    }
}
