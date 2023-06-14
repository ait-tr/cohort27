package example01;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Ellipse extends Figure {
    private int smallRadius;
    private int largeRadius;

    public Ellipse(int x, int y, int smallRadius, int largeRadius) {
        super(x, y);
        this.smallRadius = smallRadius;
        this.largeRadius = largeRadius;
    }

    public double area() {
        return Math.PI * smallRadius * largeRadius;
    }
}
