package example03;

public class PrinterRed extends Printer {
    public void print(String message) {
        System.err.println(prefix + " " + message);
    }
}
