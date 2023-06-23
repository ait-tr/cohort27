package example01;

import java.util.Random;
import java.util.Scanner;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Point2D point2D = new Point2D(3, 4);

        Object obj1 = random;
        Object obj2 = scanner;
        Object obj3 = point2D;

//        System.out.println(obj1 instanceof Random);
//        System.out.println(obj2 instanceof Scanner);
//        System.out.println(obj3 instanceof Point2D);

        System.out.println(obj1 instanceof Point2D);
        System.out.println(obj2 instanceof Point2D);
        System.out.println(obj3 instanceof Point2D);
    }
}
