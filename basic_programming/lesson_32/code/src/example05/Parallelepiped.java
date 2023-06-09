package example05;

public class Parallelepiped extends Figure3D {
    private int height; // высота
    private int length; // ширина
    private int width; // длина

    public Parallelepiped(int x, int y, int z,
                          int height, int length, int width) {
        super(x, y, z);
        // TODO: сделать проверки
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void print() {
        System.out.println("Параллелепипед(" +
                x + "," + y + "," + z + ", высота - " + height +
                ", длина - " + length + ", ширина - " + width + ")");
    }

    public double volume() {
        return height * length * width;
    }
}
