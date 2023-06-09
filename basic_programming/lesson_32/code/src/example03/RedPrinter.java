package example03;

public class RedPrinter extends Printer {

    // переопределенный
//    public void print(String message) {
//        System.err.println(message);
//    }

    // перегруженный
    public void print() {
        System.err.println("Marsel!");
    }
}
