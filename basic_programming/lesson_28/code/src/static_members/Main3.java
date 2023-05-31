package static_members;

public class Main3 {
    public static void main(String[] args) {
        A a = new A();
        a.sum(10, 15, 10);

        A.sum(10, 10);
    }
}
