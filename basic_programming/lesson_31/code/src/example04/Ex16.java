package example04;

public class Ex16 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, 2, 10);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle();

        System.out.println("Информация о c1: " + c1.getX() + " " + c1.getY() + " " + c1.getColor() + " " + c1.getRadius());
        System.out.println("Информация о c2: " + c2.getX() + " " + c2.getY() + " " + c2.getColor() + " " + c2.getRadius());
        System.out.println("Информация о c3: " + c3.getX() + " " + c3.getY() + " " + c3.getColor() + " " + c3.getRadius());
    }
}
