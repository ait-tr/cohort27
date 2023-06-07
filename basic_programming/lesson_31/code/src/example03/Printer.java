package example03;

public class Printer {
    protected String prefix;

    public Printer() {
        this.prefix = "07/06/2023";
    }

    public void print(String message) {
        System.out.println(prefix + " " + message);
    }
}
