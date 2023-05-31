package static_members;

public class A {
    public int value;

    public static int anotherValue;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printAnotherValue(A a) {
        int result = sum(10, 15);
        System.out.println(anotherValue);
        System.out.println(a.value);
//        System.out.println(value);
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
