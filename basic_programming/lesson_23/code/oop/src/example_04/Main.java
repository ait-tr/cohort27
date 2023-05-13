package example_04;

public class Main {
    // вывести координаты центра самого большого прямоугольника
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(-5, 10, 15, 10); // создаем объекты
        Rectangle a2 = new Rectangle(-1, -5, 3, 4);

        int area1 = a1.getArea();
        int area2 = a2.getArea();
        int perimeter1 = a1.getPerimeter();
        int perimeter2 = a2.getPerimeter();

        System.out.println(area1 + " " + area2);
        System.out.println(perimeter1 + " " + perimeter2);
        int i = 0;

//        a1.x = -5; // у каждого объекта один и тот же тип характеристик, но они разные
//        a1.y = 10;
//        a1.height = -15;
//        a1.width = 10;

//        a2.x = -1;
//        a2.y = -5;
//        a2.height = 3;
//        a2.width = 4;

    }
}
