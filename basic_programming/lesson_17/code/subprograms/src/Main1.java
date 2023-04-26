package subprograms;

public class Main1 {

    // функция для нахождения минимума среди двух чисел
    public static int min(int a, int b) {
        int minValue;
        if (a < b) {
            minValue = a;
        } else if (a > b) {
            minValue = b;
        } else {
            minValue = a;
        }

        return minValue;
    }

    public static void main(String[] args) {

        int x = 22;
        int y = 15;

        int x1 = 58;
        int y1 = 100;

        int m1 = min(x, y);
        int m2 = min(x1, y1);
        int m3 = min(99, 15);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
