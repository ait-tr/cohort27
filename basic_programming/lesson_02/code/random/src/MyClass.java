import java.util.Random; // подключаем библиотеку для работы со случайными числами

public class MyClass {
    public static void main(String args[]) {
       // создаем генератор случайных чисел
       Random r = new Random();
       // получаем случайное число в диапазоне [0, 99]
       int i = r.nextInt(100);
       // выводим на экран
       System.out.println(i);
    }
}
