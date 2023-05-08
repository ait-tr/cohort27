package ex;

public class Ex15 {
    // Пусть есть набор точек x,y
    // Необходимо вывести точку с минимальной разницей между x,y

    // создать класс Point с двумя координаты x,y
    // создать массив Point-ов (минимум 5 штук)
    // написать процедуру, которая вернет Point с минимальной разницей между x,y

    public static Point findMinPoint(Point[] array) {
        Point min = array[0];
        //8 -> 1, 2 ,3 ,4 ,5 ,6 ,7
        for (int i = 1; i < array.length; i++) {
            // i-ую точку сравниваем с предыдущей минимальный
            // критерий сравнения - разница между x и y определенной точки
            double difference = array[i].x - array[i].y;
            // разница между x-ом и y-ом у предыдущей минимальной точки
            double differenceForMin = min.x - min.y;
            if (difference < differenceForMin) {
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Point a = new Point(10, 5);
        Point a1 = new Point(5, 2);
        Point a2 = new Point(8, 3);
        Point a3 = new Point(15,  10);
        Point a4 = new Point(25,  24);
        Point a5 = new Point(14, 7);

        Point[] points = {a, a1, a2, a3, a4, a5};

        Point minPoint = findMinPoint(points);
        System.out.println("Точка с минимальной разницей между x и y - (" + minPoint.x + "," + minPoint.y + ")");
    }
}
