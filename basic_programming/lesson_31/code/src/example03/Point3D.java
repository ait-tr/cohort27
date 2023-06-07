package example03;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) { //x = 5, y = 7, z = 10
        super(x, y); // Point2D(5, 7)
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
