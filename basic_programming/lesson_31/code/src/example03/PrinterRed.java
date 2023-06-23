package example02;

public class PrinterRed extends Printer {
    public void print(String message) {
        System.err.println(prefix + " " + message);
    }
}
