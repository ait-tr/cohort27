public class Main01 {
    // как написать функцию, которая подсчитывает количество элементов массива, которые удовлетворяют условию

    // написать функцию, которая возвращает количество положительных элементов массива
    public static int countOfPositiveNumbers(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            // проверка условия для каждого (i-го) элемента
            if (array[i] > 0) {
                result++;
            }
        }

        return result;
    }

    // написать функцию, которая возвращает количество четных элементов массива
    public static int countOfEvenNumbers(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            // проверка условия для каждого (i-го) элемента
            if (array[i] % 2 == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {45, -10, 4, -5, 11, 4, -6};
        int[] b = {-9, 11, -15, -8, 13, 6};

        int c1 = countOfPositiveNumbers(a);
        int c2 = countOfPositiveNumbers(b);
        int c3 = countOfEvenNumbers(a); // 4

        System.out.println(c1); // 4
        System.out.println(c2); // 3
        System.out.println(c3);


    }
}