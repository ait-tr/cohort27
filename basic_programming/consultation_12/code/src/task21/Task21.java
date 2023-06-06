package task21;

public class Task21 {

    // найти круг с минимальным радиусом
    public static Circle getMinRadiusCircle(Circle[] circles) {
        Circle minRadiusCircle = circles[0]; // предполагаем, что круг с минимальным радиусом - 0-й
        for (int i = 1; i < circles.length; i++) { // пробегаем все круги
            if (circles[i].radius < minRadiusCircle.radius) { // сравниваем радиусы текущего круга и круга с мин. радиусом
                minRadiusCircle = circles[i]; // если радиус меньше, то кругом с мин. радиусом становится текущий круг
            }
        }

        return minRadiusCircle;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5, 2, 10);
        Circle c2 = new Circle(2, 2, 5);
        Circle[] array = {c1, c2};
        Circle min = getMinRadiusCircle(array);
        System.out.println(min.x + " " + min.y);
    }
}
