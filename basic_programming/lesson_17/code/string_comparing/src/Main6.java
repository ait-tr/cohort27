package string_comparing;

public class Main6 {
    // Для строк разной длины

    // Пусть у нас есть две строки
    // выводим 0, если строки одинаковые s1 = s2
    // выводим -1, если правая строка стоит в словаре позже (т.е. левая меньше) s1 < s2
    // выводим 1, если левая строка стоит в словаре позже (т.е. левая больше) s1 > s2
    public static void main(String[] args) {
        String s1 = "AAB";
        String s2 = "AA";
        // s1 > s2

        // найдем минимальную длину
        int minLength;

        int leftLength = s1.length();
        int rightLength = s2.length();

        if (leftLength < rightLength) {
            minLength = leftLength;
        } else {
            minLength = rightLength;
        }

        int result = 0;

        for (int i = 0; i < minLength; i++) {
            char leftChar = s1.charAt(i);
            char rightChar = s2.charAt(i);
            if (leftChar < rightChar) {
                result = -1;
                break;
            } else if (leftChar > rightChar) {
                result = 1;
                break;
            }
        }

        // если result = 0, то значит строки либо одинаковые полностью,
        // либо одно слово полностью входит в другое (AA -> AAB, AAB -> AABB), но тогда у них разная длина
        // и меньше та строка, которая короче

        // если строки одинаковые или входят друг в друга
        if (result == 0) {
            // проверяем, левая короче, чем правая?
            if (leftLength < rightLength) {
                // значит s1 < s2
                result = -1;
            } else if (leftLength > rightLength) {
                // проверяем, левая длиннее, чем правая?
                // значит s1 > s2
                result = 1;
            }
        }

        // если все символы были одинаковые, мы ни разу не изменили значение result
        System.out.println(result);

    }
}
