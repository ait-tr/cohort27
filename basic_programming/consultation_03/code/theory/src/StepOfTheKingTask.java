import java.util.Scanner;

public class StepOfTheKingTask {
    public static void main(String[] args) {
        /*
        Даны две различные клетки шахматной доски. Напишите программу, которая определяет,
        может ли король попасть с первой клетки на вторую одним ходом.
        Программа получает на вход четыре числа от 1 до 8 каждое, задающие номер столбца
        и номер строки сначала для первой клетки, потом для второй клетки.
        Программа должна вывести «YES», если из первой клетки ходом короля можно попасть во вторую,
        или «NO» в противном случае.

        Формат входных данных
        На вход программе подаётся четыре числа от 1 до 8.

        Формат выходных данных
        Программа должна вывести текст в соответствии с условием задачи.

        Примечание
        Шахматный король ходит по горизонтали, вертикали и диагонали, но только на 1 клетку.
        */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // x = a + 1, a - 1, a
        // y = b + 1, b - 1, b
        if ((x == a + 1 || x == a - 1 || x == a) && (y == b + 1 || y == b - 1 || y == b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}