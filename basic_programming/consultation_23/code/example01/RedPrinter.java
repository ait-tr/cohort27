package example01;

/**
 * 8/3/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class RedPrinter extends BlackPrinter implements Printer {

    public RedPrinter(String header) {
        super(header);
    }

    @Override
    public void print(String message) {
        System.err.println(header + " : " + message);
    }
}
