public class Main6 {

    // проверим, корректность пароля
    // - длина
    // - наличие цифр
    public static boolean isCorrectPassword(String password, int minLength) {
        if (password.length() < minLength) {
            return false;
        }

        // `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`
        for (int i = '0'; i <= '9'; i++) {
            // проверяем, есть ли символ-цифра в строке
            // если такой символ есть - indexOf вернет положительное число
            // если символа такого нет - вернет отрицательное -1
            if (password.indexOf(i) != -1) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        boolean result = isCorrectPassword("He5llo", 3);
        System.out.println(result);
    }
}
