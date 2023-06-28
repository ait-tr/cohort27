package example01;

/**
 * 6/28/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        // создали два массива - чисел и строк
        Integer[] a = {4, 6, 8, 11, 15, 18, 20};
        String[] b = {"Hello", "Bye", "Marsel", "Java", "Berlin", "Germany", "C#", "Photo"};
        // на основе нашего массива чисел/строк создали список чисел/строк;
        // вызвали статический метод toMyArrayList у класса ListAlgorithms
        MyArrayList<Integer> integers = ListAlgorithms.toMyArrayList(a);
        MyArrayList<String> strings = ListAlgorithms.toMyArrayList(b);

        // на основе нашего списка чисел/строк формируем новый список, который
        // содержит элементы подпоследовательности исходного массива
        MyArrayList<Integer> integerSubSequence = ListAlgorithms.subsequence(integers, 2, 5);
        MyArrayList<String> stringSubSequence = ListAlgorithms.subsequence(strings, 2, 5);

        System.out.println(integers);
        System.out.println(integerSubSequence);
        System.out.println(strings);
        System.out.println(stringSubSequence);

    }
}
