package ex;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[10000];
        Random random = new Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(random.nextDouble(), random.nextDouble());
        }

        int i = 0;
    }
}
