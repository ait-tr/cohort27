import java.util.Arrays;

public class Main05 {

    public static void swapVariables(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapInArray(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        swapInArray(array, 1, 3);
        System.out.println(Arrays.toString(array));

        int x = 10;
        int y = 15;

        int temp = x;
        x = y;
        y = temp;

//        swapVariables(x, y);
        System.out.println(x + " " + y);
    }
}
