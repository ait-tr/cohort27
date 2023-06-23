package example02;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Point2D a = new Point2D(3, 4);
        Point2DColored b = new Point2DColored(3, 4, "Red");

        System.out.println(a.equals(b)); // a ~ b -> true
        System.out.println(b.equals(a)); // b ~ a -> false
    }
}
