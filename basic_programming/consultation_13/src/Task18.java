import java.util.Random;

public class Task18 {

    public static void main(String[] args) {
        Random random = new Random(); // генератор случайных чисел
        int[] array = new int[100]; // создаем массив
        // пробегаем по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            // для каждого элемента массива создаем случайное число 0 .. 499
            array[i] = random.nextInt(500);
        }

        int minResult = min(array);
        System.out.println("Минимум в массиве - " + minResult);

        double averageResult = average(array);
        System.out.println("Среднее значение массива - " + averageResult);

        double digitsSumResult = digitsSum(723);
        System.out.println("Сумма цифр числа 723 - " + digitsSumResult);

        double zeroCountResult = zeroCount(array);
        System.out.println("Количество нулей в массиве - " + zeroCountResult);

        boolean containsResult = contains(array, 77);
        System.out.println("Число 77 есть в массиве? - " + containsResult);
    }

    public static int min(int[] array) {
        int min = array[0]; // предполагаем, что первый элемент минимальный
        for (int i = 1; i < array.length; i++) { // проходим все элементы
            if (array[i] < min) { // если текущий меньше минимального
                min = array[i]; // делаем его минимальным
            }
        }

        return min; // возвращаем результат
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int number : array) { // for (int i = 0; i < array.length; i++) { int number = array[i]; ...}
            sum = sum + number; // sum += array[i];
        }

        return sum / array.length;
    }

    public static int digitsSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // кладем последнюю цифру числа в сумму
            number /= 10; // отбрасываем последнюю цифру
        }

        return sum;
    }

    public static boolean contains(int[] array, int number) {
        for (int arrayNumber : array) {
            if (arrayNumber == number) {
                return true;
            }
        }
        return false;
    }

    public static int zeroCount(int[] array) {
        int count = 0;
        for (int arrayNumber : array) {
            if (arrayNumber == 0) {
                count++;
            }
        }
        return count;
    }
}
