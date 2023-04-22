package beginner.task;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {-10, 7, 2, 6, 11, -3, 8};

        /*
         int i = 0;
         while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
         */

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("-----------");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * 2);
        }



    }
}
