package string_comparing;

public class Main5 {
    // Для строк одинаковой длины

    // Пусть у нас есть две строки
    // выводим 0, если строки одинаковые s1 = s2
    // выводим -1, если правая строка стоит в словаре позже (т.е. левая меньше) s1 < s2
    // выводим 1, если левая строка стоит в словаре позже (т.е. левая больше) s1 > s2
    public static void main(String[] args) {
        String s1 = "AABADC";
        String s2 = "AABADC";
        // AABADC < AABBDC
        // s1 > s2
        //
        int length = 6;
        // результат = -1, 0, 1

        // полагаем, что строки равны
        int result = 0;

        for (int i = 0; i < 6; i++) {
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
        // если все символы были одинаковые, мы ни разу не изменили значение result
        System.out.println(result);

    }
}
