package example05;

public class Figure3D {
    // координаты центра
    protected int x;
    protected int y;
    protected int z;

    public Figure3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println("Фигура(" + x + "," + y + "," + z + ")");
    }

    public double volume() {
        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
