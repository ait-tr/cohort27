public class Main3 {
    public static void main(String[] args) {

        if (sayHello() && sayBye()) {
            System.out.println("Marsel");
        }
    }

    public static boolean sayHello() {
        System.out.println("Hello!");
        return false;
    }

    public static boolean sayBye() {
        System.out.println("Bye");
        return true;
    }
}
