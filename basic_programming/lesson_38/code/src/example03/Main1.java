package example03;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main1 {
    public static void main(String[] args) {
        Point2D a = new Point2D(3, 4);
        Point2D c = new Point2D(3, 4);
        Point2DColored b = new Point2DColored(3, 4, "Red");
        Point2DColored e = new Point2DColored(3, 4, "Red");

        System.out.println(a.equals(b)); // a ~ b -> false
        System.out.println(b.equals(a)); // b ~ a -> false
        System.out.println(a.equals(c)); // true
        System.out.println(e.equals(b)); // true
    }
}
