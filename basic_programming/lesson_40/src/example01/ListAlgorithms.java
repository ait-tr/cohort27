package example01;

/**
 * 6/28/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class ListAlgorithms {
    public static <T> MyArrayList<T> subsequence(MyArrayList<T> list, int from , int to) {
        MyArrayList<T> newArrayList = new MyArrayList<>(); // создаем новый список такого же типа, как и исходный
        for (int i = from; i <= to; i++) { // проходим по всем элементам исходного списка от from до to
            T element = list.get(i);
            newArrayList.add(element); // в новый список кладем все элементы от from до to из старого списка
        }

        return newArrayList; // возвращаем результат
    }

    public static <T> MyArrayList<T> toMyArrayList(T[] array) {
        MyArrayList<T> list = new MyArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        return list;
    }

    public static <T> MyLinkedList<T> toMyLinkedList(T[] array) {
        return null;
    }

    public static <T> MyLinkedList<T> subsequence(MyLinkedList<T> list) {
        return null;
    }

    public static <T> MyLinkedList<T> from(MyArrayList<T> list) {
        return null;
    }

    public static <T> MyArrayList<T> from(MyLinkedList<T> list) {
        return null;
    }
}
