package example_04;

public class Rectangle {
    // fields

    // координаты центра прямоугольника относительно центра координатной плоскости
    private double x;
    private double y;

    private int width; // ширина
    private int height; // высота

    // конструктор - чтобы можно было положить значения в поля при создании объекта
    public Rectangle(double x, double y, int width, int height) {
        // кладем переданные в конструктор параметры внутрь полей
        this.x = x;
        this.y = y;

        if (width < 0) {
            System.err.println("Ширина не может быть отрицательной");
            this.width = 1;
        } else {
            this.width = width;
        }

        if (height < 0) {
            System.err.println("Высота не может быть отрицательной");
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    // метод, который возвращает значение площади данного прямоугольника
//    public int getArea() {
//        // перемножили ширину на длину
//        int area = width * height;
//        // вернули в качестве результата
//        return area;
//    }
//
//    public int getPerimeter() {
//        // складываем четыре стороны
//        int perimeter = width * 2 + height * 2;
//        // вернули в качестве результата
//        return perimeter;
//    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
