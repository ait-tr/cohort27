package example03;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class ErrorOutImpl implements Out {
    public void out(String message) {
        System.err.println(message);
    }
}
