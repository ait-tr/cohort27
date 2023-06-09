package example02;

public class Main {
    public static void main(String[] args) {
        Summator summator = new Summator();
        double c = summator.sum(10.0, 15);
        int d = summator.sum(10, 15, 5);
        System.out.println(c);
        System.out.println(d);
    }
}
