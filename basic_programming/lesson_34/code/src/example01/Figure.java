package example01;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public abstract class Figure {
    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract double area();

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
