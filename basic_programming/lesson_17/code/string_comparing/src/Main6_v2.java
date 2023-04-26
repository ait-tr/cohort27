package string_comparing;

import java.util.Scanner;

public class Main6_v2 {
    // Для строк разной длины

    // Пусть у нас есть две строки
    // выводим 0, если строки одинаковые s1 = s2
    // выводим -1, если правая строка стоит в словаре позже (т.е. левая меньше) s1 < s2
    // выводим 1, если левая строка стоит в словаре позже (т.е. левая больше) s1 > s2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        char[] left = s1.toCharArray();
        char[] right = s2.toCharArray();

        int minLength = Math.min(s1.length(), s2.length());

        int result = 0;

        for (int i = 0; i < minLength; i++) {
            if (left[i] < right[i]) {
                result = -1;
                break;
            } else if (left[i] > right[i]) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (s1.length() < s2.length()) {
                result = -1;
            } else if (s1.length() > s2.length()) {
                result = 1;
            }
        }

        System.out.println(result);
    }
}
