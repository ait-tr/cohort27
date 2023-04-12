public class Main4 {
    public static void main(String[] args) {
        // явная инициализация с явным указанием элементов массива
        // но! с неявным указанием размера
        // 45 - 0
        // 6 - 1
        // 7 - 2
        // 5 - 3
        // 6 - 4
        int[] a = {45, 6, 7, 5, 6};
        System.out.println(a.length);
        System.out.println(a[3]);
        a[3] = 777;

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
