package example02;

import java.time.LocalDate;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MessagePrinter {

    private Out out;

    public MessagePrinter(Out out) {
        this.out = out;
    }

    public void print(String message) {
        out.out(LocalDate.now() + " " + message);
    }
}
