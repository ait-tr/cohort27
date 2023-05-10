package example01;

import java.util.Arrays;

public class Main {

    // функция, принимает на вход массив array
    // в котором всего count элементов
    // и в этот массив она добавляет новый элемент element
    // в первую пустую позицию
    // функция возвращает новое значение count, если элемент был успешно добавлен
    // [10, 5, 6, 8, 6], count = 5, то добавления будет - мы просто 5
    // [10, 5, 6, 8, 0], count = 4, то добавим элемент -7 -> [10, 5, 6, 8, -7], count = 5, вернем 5
    public static int add(int[] array, int count, int element) {
        // если количество элементов в массиве равно размеру массива
        if (count == array.length) {
            System.err.println("Массив переполнен");
            return count;
        }
        // добавили элемент под нужным индексом
        array[count] = element;
        // увеличили количество
        count++;
        // вернули как результат
        return count;
    }

    public static int[] resize(int[] array) {
        // создали новый массив, большей длины (в 2 раза)
        int[] newArray = new int[array.length * 2];
        // из старого массива все данные копирую в новый массив
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            // newArray[0] = a[0]
            // newArray[1] = a[1]
            // ...
        }
        // возвращаем ссылку на созданный новый массив, чтобы в main ее присвоить
        return newArray;
    }

    public static void main(String[] args) {
        // сам массив, который хранит элементы
        int[] a = new int[5];
        // количество элементов в массиве, которые нас интересуют
        int count = 0;

        int[] b = new int[5];
        int count1 = 0;

        count1 = add(b, count1, 155);
        count = add(a, count, 10);
        count = add(a, count, 15);
        count = add(a, count, 16);
        count = add(a, count, 17);
        count = add(a, count, 20);


        System.out.println(Arrays.toString(a));

        if (count == a.length) {
            a = resize(a);
        }
        count = add(a, count, 21);
        count = add(a, count, 33);
        count = add(a, count, 35);
        count = add(a, count, 40);
        count = add(a, count, 28);

        if (count == a.length) {
            a = resize(a);
        }

        System.out.println(Arrays.toString(a));

        count = add(a, count, 15);

        // добавили элемент в увеличенный массив
        System.out.println(Arrays.toString(a));
        System.out.println(count);


    }
}
