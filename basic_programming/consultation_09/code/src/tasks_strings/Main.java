package tasks_strings;

public class Main {
    public static void main(String[] args) {
        String password = "  qwerty ";

        if (password.contains(" ")) {
            System.out.println("В пароле есть пробел");
        }

        if (password.startsWith(" ")) {
            System.out.println("В начале пароля есть пробел");
        }

        if (password.endsWith(" ")) {
            System.out.println("В конце пароля есть пробел");
        }

        String replaced = password.replaceAll(" ", "");
        String trimed = "   qwert ".trim();
        System.out.println(trimed);

        System.out.println(replaced);

        String value = String.valueOf(1.56);
        char[] chars = {'A', 'b', 'c'};
        String word = String.valueOf(chars);
        System.out.println(word);
//        String value1 = 1.56;
    }
}
