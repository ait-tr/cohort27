package homeworks;

public class Task14 {
    public static void main(String[] args) {
        int[] a = {4, 2, 1, 8, 7, -6, 0, 5};

        /*
         * НУЖНО!
         * Написать код, который "найдет" минимум и максимум
         * запомнит их индексы
         * а потом уже поменяет местами
         */

        int indexOfMin = 5;
        int indexOfMax = 3;

        int temp = a[indexOfMax];
        a[indexOfMax] = a[indexOfMin];
        a[indexOfMin] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
