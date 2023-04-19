import java.util.Scanner;

public class Main4_no_comment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordsCount = 0;
        String[] dictionary = new String[10];

        while (true) {
            String word = scanner.nextLine();

            boolean isContains = false;

            for (int i = 0; i < wordsCount; i++) {
                if (dictionary[i].startsWith(word)) {
                    System.out.println("->" + dictionary[i]);
                    isContains = true;
                }
            }

            if (!isContains) {
                dictionary[wordsCount] = word;
                wordsCount++;
            }
        }
    }
}
