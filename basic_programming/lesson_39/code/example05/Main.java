package example05;

import java.util.Arrays;

/**
 * 6/26/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {

    // обобщенный метод
    // он не знает, с какими типами будет работать
    // но он знает, что тип MyArrayList будет такой же, как и у array
    public static <T> MyArrayList<T> from(T[] array) {
        MyArrayList<T> arrayList = new MyArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Marsel");
//        list.add(10);

        String word = list.get(2);
        System.out.println(word);

        String[] words = {"marsel", "sidikov", "rafaelevich"};
        Integer[] numbers = {10, 20, 40};

        MyArrayList<String> myArrayList = from(words);
        MyArrayList<Integer> integers = from(numbers);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
    }
}
