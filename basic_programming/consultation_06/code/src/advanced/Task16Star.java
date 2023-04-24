package advanced;

import java.util.Scanner;

public class Task16Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[count];

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < words.length; i++) {
            String min = words[i];
            int minIndex = i;
            for (int j = i + 1; j < words.length; j++) {
                // научиться сравнивать два слова и понимать, какое меньше, а какое больше
                if (false) { // words[j] < min
                    min = words[j];
                    minIndex = j;
                }
            }

            String temp = words[i];
            words[i] = words[minIndex];
            words[minIndex] = temp;
        }
    }
}
