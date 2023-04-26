package subprograms;

public class Main {
    public static void main(String[] args) {

        int x = 22;
        int y = 15;

        int x1 = 58;
        int y1 = 100;

        int min;

        if (x < y) {
            min = x;
        } else if (x > y) {
            min = y;
        } else {
            min = x;
        }

        System.out.println(min);

        int min1;

        if (x1 < y1) {
            min1 = x1;
        } else if (x1 > y1) {
            min1 = y1;
        } else {
            min1 = x1;
        }

        System.out.println(min1);
    }
}
