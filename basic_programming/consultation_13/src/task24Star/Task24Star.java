package task24Star;

/**
 * 6/17/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Task24Star {
    public static void main(String[] args) {
        MyArray a = new MyArray();
        a.add(37);
        a.add(29);
        a.add(15);
        a.add(16);
        a.add(13);

        MyArray b = new MyArray();
        b.add(13);
        b.add(777);
        b.add(37);

        boolean containsResult = a.containsAll(b); // true
        System.out.println(containsResult);

    }
}
