package example02;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Rectangle implements Comparable<Rectangle> {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
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
    public int compareTo(Rectangle that) {
        int area1 = this.x * this.y;
        int area2 = that.x * that.y;

        return area1 - area2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
