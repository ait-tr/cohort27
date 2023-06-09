package example01;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 5, 10);
        circle.setColor("Red");
        System.out.println(circle.getRadius());
        System.out.println(circle.getSmallRadius());
        System.out.println(circle.getLargeRadius());
    }
}
