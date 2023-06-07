package example04;

public class Circle extends Figure {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(int radius) {
        super(1, 1);
        this.radius = radius;
    }

    public Circle() {
        super(1, 1);
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }
}
