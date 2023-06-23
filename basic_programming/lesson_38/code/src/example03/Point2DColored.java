package example03;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Point2DColored extends Point2D {
    private String color;

    public Point2DColored(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            Point2DColored that = (Point2DColored) obj;
            return this.color.equals(that.color) && this.getX() == that.getX() && this.getY() == that.getY();
        } return false;
    }
}
