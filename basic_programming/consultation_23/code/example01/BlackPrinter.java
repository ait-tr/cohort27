package example01;

/**
 * 8/3/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class BlackPrinter implements Printer {

    protected final String header;

    public BlackPrinter(String header) {
        this.header = header;
    }

    public void print(String message) {
        System.out.println(header + " : " + message);
    }
}
