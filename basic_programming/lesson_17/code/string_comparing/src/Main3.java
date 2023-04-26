package string_comparing;

public class Main3 {
    // Для строк одинаковой длины

    // Пусть у нас есть две строки
    // выводим 0, если строки одинаковые s1 = s2
    // выводим -1, если правая строка стоит в словаре позже (т.е. левая меньше) s1 < s2
    // выводим 1, если левая строка стоит в словаре позже (т.е. левая больше) s1 > s2
    public static void main(String[] args) {
        String s1 = "AABBDC";
        String s2 = "AABADC";
        // AABADC < AABBDC
        // s1 > s2

        int length = 6;
        // печатаем соответствующие символы обоих слов
        for (int i = 0; i < 6; i++) {
            // берем i-ый символ левого слова
            char leftChar = s1.charAt(i);
            // берем i-ый символ правого слова
            char rightChar = s2.charAt(i);
            // печатаем эту пару символов
            System.out.println(leftChar + " - " + rightChar);
        }

    }
}
