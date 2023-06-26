package example04;

import java.util.Scanner;

/**
 * 6/26/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Human marsel = new Human("Марсель", "Сидиков");
        Human kenan = new Human("Kenan", "Yusubov");
        Pair<String, Human> pair1 = new Pair<>("marselka007", marsel);
        Pair<String, Human> pair2 = new Pair<>("эфиоп", kenan);
        Pair<String, Scanner> pair3 = new Pair<>("Сканнер", new Scanner(System.in));

        // сделал массив пар
        Pair<String, Human>[] pairs = new Pair[3];
        // положил каждую пару в массив
        pairs[0] = pair1;
        pairs[1] = pair2;
//        pairs[2] = pair3;

        Pair<String, Scanner>[] pairs2 = new Pair[2];
        pairs2[0] = pair3;
//        pairs2[1] = pair1;

    }
}
