package example03;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello!");

        RedPrinter redPrinter = new RedPrinter();
        redPrinter.print("Hello!");
        redPrinter.print();
    }
}
