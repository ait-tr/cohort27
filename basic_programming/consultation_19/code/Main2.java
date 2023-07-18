/**
 * 7/18/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Human marsel = new Human(29, "Marsel");
        Human vadim = new Human(17, "Vadim");
        Human kenan = new Human(27, "Kenan");
        Human kenan2 = new Human(28, "Kenan");

        MyHashMap<Human, String> map = new MyHashMap<>();
        System.out.println(kenan2.hashCode());
        System.out.println(kenan.hashCode());
        System.out.println(kenan2.equals(kenan));

        map.put(marsel, "Учитель");
        map.put(vadim, "Ученик");
        map.put(kenan, "Ученик");
        map.put(kenan2, "Учитель");

    }
}
