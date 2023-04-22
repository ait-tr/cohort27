package beginner.task;

public class Main4 {
    public static void main(String[] args) {
        int[] array = {-10, 7, 2, 6, 11, -3, 8};
        // посчитать сумму элементов массива
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(sum);
            break;
        }


    }
}
