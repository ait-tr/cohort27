package example_04;

public class Main2 {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(-5, 10, 2, 3);
        Rectangle a2 = new Rectangle(-10, 1, 3, 5);
        Rectangle a3 = new Rectangle(7, -15, 2, 11);
        Rectangle a4 = new Rectangle(2, 20, 6, 2);

        Rectangle max;

        if (a1.getArea() > a2.getArea()) {
            max = a1;
        } else {
            max = a2;
        }

        if (a3.getArea() > max.getArea()) {
            max = a3;
        }

        if (a4.getArea() > max.getArea()) {
            max = a4;
        }

        System.out.println(max.getX() + " " + max.getY());

    }
}
