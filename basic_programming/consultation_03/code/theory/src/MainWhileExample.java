public class MainWhileExample {
    public static void main(String[] args) {
        /* while (условие) {
            // что-то делаем
           }
         */

        int i = 0;

        while (i < 10) {

            if (i % 2 == 0) {
                System.out.println("Четное " + i);
            } else {
                System.out.println("Нечетное " + i);
            }

            i = i + 1;
        }

        System.out.println("Цикл закончен");
    }
}
