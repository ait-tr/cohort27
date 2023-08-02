package example02;

import java.util.Scanner;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {

        Integer[] a = {45, 10, -4, 29, 100, -10, 11, 16, -2, 1000, -15};

        Human a1 = new Human(29, 185, 11);
        Human a2 = new Human(25, 190, 5);
        Human a3 = new Human(30, 160, 15);
        Human a4 = new Human(33, 170, 20);
        Human a5 = new Human(15, 180, 21);
        Human a6 = new Human(20, 200, 10);

        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(1, 7);
        Rectangle r4 = new Rectangle(2, 8);

        Rectangle[] rectangles = {r1, r2, r3, r4};

        Human[] humans = {a1, a2, a3, a4, a5, a6};

        Scanner[] scanners = {new Scanner(System.in), new Scanner(System.in)};

        Human minHuman = MinMaxGetter.minElement(humans);
        Rectangle minRectangle = MinMaxGetter.minElement(rectangles);
        int minNumber = MinMaxGetter.minElement(a);
//        Scanner minScanner = MinMaxGetter.minElement(scanners);

        System.out.println(minHuman);
        System.out.println(minRectangle);
        System.out.println(minNumber);
        System.out.println();
    }
}
