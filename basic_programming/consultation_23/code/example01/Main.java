package example01;

/**
 * 8/3/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        BlackPrinter b = new BlackPrinter("MESSAGE");
        RedPrinter r = new RedPrinter("ALERT");

        WordsPrinter printer = new WordsPrinter();
        printer.printAll(new String[]{"Hello", "Bye", "Marsel"}, r);

        BlackPrinter x = r; // восходящее преобразование

        Printer p1 = b;
        Printer p2 = r;

    }
}
