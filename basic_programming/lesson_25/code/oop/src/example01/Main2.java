package example01;

public class Main2 {
    public static void main(String[] args) {
        int x = 10;

        int y = x;
        y = 15;
        System.out.println(x); // 10

        Line a = new Line();

        a.color = "Black";

        Line b;
        b = a;
        b.color = "White";

        b = new Line();
        b.color = "Grey";

        System.out.println(a.color);

        System.out.println(b.color);
    }
}
