package beginner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = a; // присваивание = копирование значения справа в переменную слева

        int c = a + b; // c = 20
        a = 15;
        b = 15;
        System.out.println(b);
    }
}