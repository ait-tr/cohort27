package example04;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        myList.add(77);
        myList.add(89);
        myList.addFirst(60);
        myList.addFirst(10);

        // нарушение инкапсуляции, я не хочу, чтобы кто-то знал, что у меня есть внутри итератор
//        Iterator iterator = myList.new MyArrayListIterator();

        MyIterator iterator = myList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
