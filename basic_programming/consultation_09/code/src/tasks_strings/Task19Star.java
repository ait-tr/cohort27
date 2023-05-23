package tasks_strings;

import java.util.Random;

public class Task19Star {
    public static String generateRandomPassword(int length) {
        Random random = new Random();
        String password = "";


        for (int i = 0; i < length; i++) {
            char c = (char) random.nextInt(33, 123);
            password = password + c;

        }
        return password;
    }

    public static boolean isCorrectPassword(String password) {
        int smallLetter = 0;
        int bigLetter = 0;
        int digitCount = 0;
        int signs = 0;

        boolean numbersNotAdjacent = true;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                smallLetter++;
            }

            if (ch == '*' || ch == '+' || ch == '-' || ch == '?' || ch == '_') {
                signs++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigLetter++;

            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }

            if (i > 0 && password.charAt(i) >= '0' && password.charAt(i) <= '9' && password.charAt(i + 1) >= '0' && password.charAt(i + 1) <= '9') {
                numbersNotAdjacent = false;
            }

        }

        return smallLetter > 0 && signs > 0 && bigLetter >= 2 && digitCount >= 2 && numbersNotAdjacent;
    }


    public static void main(String[] args) {


        boolean result = isCorrectPassword("AAbbttA99");
        System.out.println(result);


    }
}