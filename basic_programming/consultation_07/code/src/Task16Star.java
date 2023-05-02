import java.util.Arrays;
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

                char[] left = words[j].toCharArray();
                char[] right = min.toCharArray();

                int minLength = Math.min(words[j].length(), min.length());

                int result = 0;

                for (int k = 0; k < minLength; k++) {
                    if (left[k] < right[k]) {
                        result = -1;
                        break;
                    } else if (left[k] > right[k]) {
                        result = 1;
                        break;
                    }
                }

                if (result == 0) {
                    if (words[j].length() < min.length()) {
                        result = -1;
                    } else if (words[j].length() > min.length()) {
                        result = 1;
                    }
                }


                // научиться сравнивать два слова и понимать, какое меньше, а какое больше
                if (result == -1) { // words[j] < min
                    min = words[j];
                    minIndex = j;
                }
            }

            String temp = words[i];
            words[i] = words[minIndex];
            words[minIndex] = temp;
        }

        System.out.println(Arrays.toString(words));
    }
}
