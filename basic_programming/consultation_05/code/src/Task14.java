public class Task14 {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 2, -1, 3, 5};

        int temp = array[4];
        array[4] = array[2];
        array[2] = temp;

    }
}
