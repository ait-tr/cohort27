package example01;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);

        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }

        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double area() {
        return height * width;
    }
}
