package string_comparing;

public class Main2 {
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

//        System.out.print(s1.charAt(0) + ",");
//        System.out.print(s1.charAt(1) + ",");
//        System.out.print(s1.charAt(2) + ",");
//        System.out.print(s1.charAt(3) + ",");
//        System.out.print(s1.charAt(4) + ",");
//        System.out.print(s1.charAt(5));

        for (int i = 0; i < 6; i++) {
            System.out.print(s1.charAt(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.print(s2.charAt(i) + " ");
        }

    }
}
