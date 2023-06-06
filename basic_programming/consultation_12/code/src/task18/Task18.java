package task18;

public class Task18 {

    public static void main(String[] args) {
        // TODO: написать самостоятельно main
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
