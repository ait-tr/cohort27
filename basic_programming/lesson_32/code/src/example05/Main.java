package example05;

public class Main {

    public static void printAll(Figure3D[] figures) {
        for (int i = 0; i < figures.length; i++) {
            figures[i].print();
        }
    }

    public static void main(String[] args) {
        Figure3D figure3D = new Figure3D(2, 3, 5);
        figure3D.move(5, 2, 1);
//        figure3D.print();
        System.out.println(figure3D.volume());

        Parallelepiped parallelepiped =
                new Parallelepiped(2, 3, 4, 10, 5, 7);
        parallelepiped.move(1, 1, 1);
//        parallelepiped.print();
        System.out.println(parallelepiped.volume());

        Cylinder cylinder =
                new Cylinder(10, 12, 30, 15, 10);
        cylinder.move(0, 0,0);
//        cylinder.print();
        System.out.println(cylinder.volume());

        Figure3D[] array = {figure3D, parallelepiped, cylinder};

        printAll(array);
    }
}
