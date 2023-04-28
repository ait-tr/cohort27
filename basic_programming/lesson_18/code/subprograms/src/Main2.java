import java.util.Arrays;
import java.util.Random;

public class Main2 {

    // из функции можно возвращать массив

    // функция генерации случайного массива
    public static int[] generateRandomArray(int length, int bound, Random random) {
        // создаем массив
        int[] array = new int[length];
        // заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
        // возвращаем массив как результат
        return array;
    }

    public static void main(String[] args) {
        // создаем генератор случайных чисел (объект, который умеет генерировать случайные числа)
        Random r = new Random(); // int[] a = new int[5];
        // создаем переменную для массива
        // вызываем функцию generateRandomArray (написана выше)
        // этой функции передали три аргумента:
        // необходимую длину массива - 5
        // верхнюю границу чисел массива - 1000
        // объект - генератор случайных чисел
        // функция возвращает результат - сгенерированный массив
        // указатель на массив мы кладем в переменную `a`
        int[] a = generateRandomArray(5, 1000, r);
        int[] b = generateRandomArray(10, 500, r);

        // найти минимальное число в сгенерированном массиве

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
