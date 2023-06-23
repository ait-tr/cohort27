package example02;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
//        Point2D a = new Point2D(3, 4);
        Point2DColored b = new Point2DColored(3, 4, "Red");
        Point2DColored c = new Point2DColored(3, 4, "Black");
        Point2DColored d = new Point2DColored(3, 4, "Black");
        Point2DColored e = new Point2DColored(3, 5, "Black");

//        System.out.println(a.equals(b)); // a ~ b, true
//        System.out.println(b.equals(a)); // b ~ a, true
        System.out.println(b.equals(c)); // false
        System.out.println(c.equals(d)); // true
        System.out.println(d.equals(e)); // false;
    }
}
