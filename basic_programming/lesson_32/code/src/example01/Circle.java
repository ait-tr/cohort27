package example01;

public class Circle extends Ellipse {

    public Circle(int x, int y, int radius) {
        super(x, y, radius, radius);
    }

    public Circle(int radius) {
        super(1, 1, radius, radius);
    }

    public Circle() {
        super(1, 1, 1, 1);
    }

    public int getRadius() {
        return smallRadius;
    }
}
