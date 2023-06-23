package example01;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point2D) {
            Point2D that = (Point2D) obj; // чтобы получить доступ к координатам, мне нужно преобразовать обратно в Point
            return this.x == that.x && this.y == that.y;
        } else return false;
    }
}
