package beginner.task;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {-10, 7, 2, 6, 11, -3, 8};

        // i = 0, 1, 2, 3, 4, 5
        // i <= 5 ~ i < 6
        // i <= n-1 ~ i < n
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i = i + 1; // i++
        }

        i = 0;
        // напечатать удвоенные числа массива
        while (i < array.length) {
            System.out.println(array[i] * 2);
            i++;
        }

    }
}
