/**
 * 7/6/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main01 {

    public static void workWithArray(int[] a) {
        a[10] = 10;
    }

    public static void doSomething(int[] a) {
        workWithArray(a);
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        doSomething(a);

    }
}
