package example01;

/**
 * 8/3/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class WordsPrinter {
    public void printAll(String[] words, Printer printer) {
        for (String word : words) {
            printer.print(word);
        }
    }
}
