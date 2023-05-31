package static_members;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        a1.value = 10;
        a1.anotherValue = 50;

        A a2 = new A();
        a2.value = 20;
        a2.anotherValue = 100;

        A.anotherValue = 200;

        System.out.println(a1.value);
        System.out.println(a2.value);
        System.out.println(a1.anotherValue);
        System.out.println(a2.anotherValue);
        System.out.println(A.anotherValue);
    }
}
