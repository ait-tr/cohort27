package strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = "Marsel";
        String s2 = "Marsel";

        System.out.println(s1 == s2);

        String s3 = scanner.nextLine();
        String s4 = scanner.nextLine();

        System.out.println(s3 == s4);
    }
}
