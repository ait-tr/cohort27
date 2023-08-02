package example01;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Human a1 = new Human(29, 185, 11);
        Human a2 = new Human(25, 190, 5);
        Human a3 = new Human(30, 160, 15);
        Human a4 = new Human(33, 170, 20);
        Human a5 = new Human(15, 180, 2);
        Human a6 = new Human(20, 200, 10);

        Human[] humans = {a1, a2, a3, a4, a5, a6};

        Human minAge = MinMaxGetter.minAgeHuman(humans);

        System.out.println(minAge);
    }
}
