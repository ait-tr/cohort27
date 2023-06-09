package example05;

public class Cylinder extends Figure3D {
    private int height;
    private int radius;

    public Cylinder(int x, int y, int z, int height,
                    int radius) {
        super(x, y, z);
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public void print() {
        System.out.println("Цилиндр(" +
                x + "," + y + "," + z + ", высота - " + height +
                ", радиус - " + radius + ")");
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
