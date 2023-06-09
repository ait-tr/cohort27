package example05;

public class Main2 {
    public static void main(String[] args) {
        Parallelepiped p1 =
                new Parallelepiped(1, 2, 3, 5, 10, 15);
        Cylinder c1 =
                new Cylinder(3, 4, 5, 15, 10);
        Parallelepiped p2 =
                new Parallelepiped(6, 7, 8, 15, 20, 25);
        Cylinder c2 =
                new Cylinder(9, 10, 11, 5, 10);

        Box box = new Box();
        box.add(p1);
        box.add(p2);
        box.add(c1);
        box.add(c2);

        System.out.println(box.volume());
    }
}
