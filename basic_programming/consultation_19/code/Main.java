/**
 * 7/11/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Marsel", 29);
        map.put("Vika", 18); // ok
        map.put("Vadim", 17); // ok
        map.put("Kenan", 27); // ok
        map.put("Наталья", 18); // ok
        map.put("Вадос", 27); // ok
        map.put("Дмитрий", 47); // ok
        map.put("Marsel", 30); // ok

        int i = 0;

//        System.out.println(map.get("Marsel"));
//        System.out.println(map.get("Vika"));
//        System.out.println(map.get("Vadim"));
//        System.out.println(map.get("Kenan"));

    }
}
