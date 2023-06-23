package example03;

import java.util.Random;
import java.util.Scanner;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 5);
        Point2DColored point2DColored = new Point2DColored(4,5, "Black");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Object obj1 = point2D;
        Object obj2 = point2DColored;
        Object obj3 = scanner;
        Object obj4 = random;

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
        System.out.println(obj3.getClass());
        System.out.println(obj4.getClass());
    }
}
