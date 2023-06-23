package example02;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        ErrorOutImpl errorOut = new ErrorOutImpl();
        StandardOutImpl standardOut = new StandardOutImpl();

        MessagePrinter printer = new MessagePrinter(errorOut);
        printer.print("Marsel");
    }
}
