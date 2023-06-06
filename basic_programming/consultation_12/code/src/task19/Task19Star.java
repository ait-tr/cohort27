package task19;

public class Task19Star {
    public static boolean minTwoUpperLetters(String password) {
        char[] characters = password.toCharArray();
        int count = 0;
        for (char character : characters) {
            if (character >= 'A' && character <= 'Z') {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean minTwoDigitsInDifferentPlaces(String password) {
       // characters[i] -> цифра и characters[i+1] -> не цифра, если ок - count++
        return true;
    }

    public static boolean notContainsBadCharacters(String password) {
        // character[i] -> буква, либо цифра, == +, -, *, ?, _, -
        return false;
    }
    public static boolean isValid(String password) {
        return notContainsBadCharacters(password) &&
                minTwoUpperLetters(password) &&
                minTwoDigitsInDifferentPlaces(password);
    }

    public static void main(String[] args) {

    }
}
