package example05;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Human h1 = new Human(29, true); // уникальный
        Human h2 = new Human(31, false); // уникальный
        Human h3 = new Human(29, false); // уникальный
        Human h4 = new Human(29, true); // повторяется

        MySet mySet = new MySet();
        mySet.put(h1);
        mySet.put(h2);
        mySet.put(h3);
        mySet.put(h4);

        int i = 1;

        // Сколько человек в итоге должно быть в mySet?
        // 3
    }
}
