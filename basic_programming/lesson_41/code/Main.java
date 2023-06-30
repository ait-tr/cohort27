/**
 * 6/30/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {

    public static <T> void print(MyList<T> list) {
        for (int i = 0; i < list.getCount(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        // список строк - на основе связного списка
        MyLinkedList<String> strings = new MyLinkedList<>();
        strings.add("Marsel");
        strings.add("Hello");
        strings.add("Bye");
        strings.add("Java");
        strings.add("Berlin");
//        strings.add(14);
        // список чисел - на основе списка-массива
        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.add(40);
        integers.add(55);
        integers.add(70);
        integers.add(90);
//        integers.add("Hello");

        print(strings);
        print(integers);
    }
}
