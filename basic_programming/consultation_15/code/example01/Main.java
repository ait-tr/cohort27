package example01;

import java.util.Random;
import java.util.Scanner;

/**
 * 6/20/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Object object;
        Scanner scanner = new Scanner(System.in);
        Human human = new Human(29, true, "Marsel");

        object = scanner;
        object = human;

//        String humanAsString = human.toString();
//
//        System.out.println(humanAsString);

        Human h = null;

        System.out.println(human);
    }
}
