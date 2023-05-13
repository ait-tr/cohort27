package example_04;

public class Main3 {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(-5, 10, 2, 3);
        Rectangle a2 = new Rectangle(-10, 1, 3, 5);
        Rectangle a3 = new Rectangle(7, -15, 2, 11);
        Rectangle a4 = new Rectangle(2, 20, 6, 2);
        Rectangle a5 = new Rectangle(2, 20, 10, 30);

        // создать массив прямоугольников
//        int[] numbers = {4, 3, 2, 1};

        Rectangle[] rectangles = {a1, a2, a3, a4, a5};
        // предполагаем, что самый большой прямоугольник - это первый
        Rectangle max = rectangles[0];
        // пробегаемся по всем прямоугольникам, начиная с позиции 1
        for (int i  = 1; i < rectangles.length; i++) {
            // сравниваем максимальный прямоугольник новым из массива
            if (max.getArea() < rectangles[i].getArea()) {
                // запоминаем этот прямоугольник как самый большой
                max = rectangles[i];
            }
        }
        // как только цикл завершит свою работу
        // в max будет содержаться самый большой прямоугольник
        System.out.println(max.getX() + " " + max.getY());
    }
}
