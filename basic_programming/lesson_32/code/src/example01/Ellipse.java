package example01;

public class Ellipse extends Figure {
    protected int smallRadius;
    private int largeRadius;

    public Ellipse(int x, int y, int smallRadius, int largeRadius) {
        super(x, y);
        this.smallRadius = smallRadius;
        this.largeRadius = largeRadius;
    }

    public int getSmallRadius() {
        return smallRadius;
    }

    public int getLargeRadius() {
        return largeRadius;
    }
}
