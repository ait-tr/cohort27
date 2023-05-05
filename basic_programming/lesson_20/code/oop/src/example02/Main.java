package example02;

public class Main {
    // https://www.wolframalpha.com/
    public static void main(String[] args) {
        // прямоугольники
        // длина, ширина, координаты центра
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 15;
        r1.x = 0;
        r1.y = 0;

        Rectangle r2 = new Rectangle();
        r2.length = 5;
        r2.width = 7;
        r2.x = 4;
        r2.y = 2;

        Rectangle r3 = new Rectangle();
        r3.length = 5;
        r3.width = 2;
        r3.x = 5;
        r3.y = 10;

        System.out.println(r1.length * r1.width);
        System.out.println(r2.length * r2.width);
        System.out.println(r3.length * r3.width);
        System.out.println("----------");
        Rectangle[] rectangles = {r1, r2, r3};

        for (int i = 0; i < rectangles.length; i++) {
//            Rectangle current = rectangles[i]; // rectangles[0] -> r1, rectangles[1] -> r2, rectangles[2] -> r3
//            System.out.println(current.length * current.width);

            System.out.println(rectangles[i].length * rectangles[i].width);
        }

    }
}
