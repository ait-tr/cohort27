package example03;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Point2D a = new Point2D(3, 4);
        Point2D c = a;
        Point2D d = null;

        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

    }
}
