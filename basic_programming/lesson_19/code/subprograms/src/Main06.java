import java.util.Arrays;

public class Main06 {

    // поменять в массиве максимум и минимум
    public static void swapMinMax(int[] array) {
        int max = array[0]; // предполагаем, что максимум - первый элемент
        int min = array[0]; // предполагаем, что минимум - первый элемент

        int minIndex = 0, maxIndex = 0; // переменные для хранения индексов максимума и минимума

        for (int i = 1; i < array.length; i++) { // пробегаем все элементы массива
            if (array[i] < min) { // если текущий элемент меньше минимума
                min = array[i]; // то он новый минимум
                minIndex = i; // запоминаем его индекс
            }

            if (array[i] > max) { // если текущий элемент больше максимума
                max = array[i]; // то он новый максимум
                maxIndex = i; // запоминаем его индекс
            }
        }
        // меняем местами максимум и минимум
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }

    // обнулить все четные элементы
    public static void makeEvenAsZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }

    // развернуть массив зеркально
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            // a[i] <-> a[array.length - 1 - i]
            // 7 элементов
            // a[0] <-> a[6]
            // a[1] <-> a[5]
            // a[2] <-> a[4]
            // a[3] <-> a[3]
            // при n = 7
            // a[0] <-> a[7 - 1 - 0]
            // a[1] <-> a[7 - 1 - 1]
            // a[2] <-> a[7 - 1 - 2]
            // a[3] <-> a[7 - 1  -3]
            // a[i] <-> a[n - 1 - i]
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    // Hello Marsel How Are You
    // You Are How Marsel Hello
    public static String reverseSentence(String sentence) {
        // разбить текст по пробелам
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        return String.join(" ", words);
    }

    // перевернуть предложение
    public static String reverseString(String word) {
        char[] characters = word.toCharArray(); // преобразуем слово в массив символов
        for (int i = 0; i < characters.length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[characters.length - 1 - i];
            characters[characters.length - 1 - i] = temp;
        }
        characters[0] = (char) (characters[0] - 32);
        characters[characters.length - 1] = (char) (characters[characters.length - 1] + 32);
        return new String(characters);
    }

    public static void selectionSort(int[] array) {
        int min, indexOfMin;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            indexOfMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }
            }

            if (indexOfMin != i) {
                int temp = array[i];
                array[i] = array[indexOfMin];
                array[indexOfMin] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {72, 11, 45, 21, 39, 192, 11, 9, 322, 120, 943, 2203, 1};
        int[] b = {20, 112, 43, 11, 455, 912, 933, 1020, 1100, 11};

        reverse(a);
        reverse(b);
//        swapMinMax(a);
//        swapMinMax(b);
//        makeEvenAsZero(a);
//        makeEvenAsZero(b);

        selectionSort(a);
        selectionSort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        String s1 = "Marsel";
        String s2 = reverseString(s1);
        System.out.println(s2);

        String sentence = "Hello Marsel How Are You";
        String s3 = reverseSentence(sentence);
        System.out.println(s3);
    }
}
