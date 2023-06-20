package example01;

import java.util.Scanner;

/**
 * 6/20/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Human h1 = new Human(29, true, "Marsel");
        Human h2 = new Human(29, true, "Marsel");

        Scanner scanner = new Scanner(System.in);

        System.out.println(h1 == h2); // false
        System.out.println(h1.equals(h1)); // true
        System.out.println(h1.equals(scanner)); // false
        System.out.println(h1.equals(h2)); // true

    }
}
