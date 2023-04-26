package subprograms;

public class Main3 {


    public static void main(String[] args) {
        int[] a = {4, 6, 11, 5, 2};
        int[] b = {15, 12, 45, 3, 6};

        int c1 = getEvenNumbersCount(a);
        int c2 = getEvenNumbersCount(b);

        System.out.println(c1);
        System.out.println(c2);
    }

    // посчитать количество четных чисел в массиве
    public static int getEvenNumbersCount(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
