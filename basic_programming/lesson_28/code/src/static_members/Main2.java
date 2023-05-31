package static_members;

import java.util.Arrays;

public class Main2 {

    public static void print() {

    }

    public static void main(String[] args) {
        A.anotherValue = 500;
        System.out.println(A.anotherValue);
        A a2 = new A();
        A.printAnotherValue(a2);

        int result = A.sum(10, 15);
        System.out.println(result);

        System.out.println(Math.max(10, 15));
        System.out.println(Math.abs(-100));

        int[] a = {3, 5, 2, 1};
        System.out.println(Arrays.toString(a));
        A a1 = new A();
        result = a1.sum(1, 3, 4);
        print();
    }
}
