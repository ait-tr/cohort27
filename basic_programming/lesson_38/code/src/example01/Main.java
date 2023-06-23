package example01;

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
        Point2D a = new Point2D(3, 4);
        Point2D b = new Point2D(3, 4);
        Point2D c = new Point2D(3, 5);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(null)); // false
        System.out.println(a.equals(scanner)); // false
        System.out.println(a.equals(random)); // false
        System.out.println(a.equals(c)); // false

    }
}
