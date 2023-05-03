public class Main {

    // напечатать определенную область массива
    public static void printArrayInBounds(int[] array, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {72, 11, 45, 21, 39, 192, 11, 9, 322, 120, 943, 2203, 1};
        int[] b = {20, 112, 43, 11, 455, 912, 933, 1020, 1100, 11};

        printArrayInBounds(a, 2, 6);
        printArrayInBounds(b, 4, 7);
    }
}