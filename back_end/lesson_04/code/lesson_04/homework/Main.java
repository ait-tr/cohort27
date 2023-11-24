package lesson_04.homework;

public class Main {

    public static void main(String[] args) {

// Запросить значение n у пользователя.
        // Вызвать метод и передать туда значение, полученное от пользователя.
        // Посмотреть, какие ошибки возможны в данном коде и для каждой
        // ошибки создать пользовательское исключение.
        // Выбросить эти исключения в нужное время и обработать их в main.
    }

    public static void testingExceptions(int n) {

        int x = 10 / n;
        System.out.println(x);
        int[] array = new int[n];
        System.out.println(array.length);
        System.out.println(array[n]);
    }
}