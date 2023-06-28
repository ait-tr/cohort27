package example01;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] elements; // хранилище элементов
    private int count; // количество элементов, которое мы положили

    public MyArrayList() { // конструктор
        this.elements = (T[])new Object[10]; // создаем массив элементов (изначально 10)
        this.count = 0;
    }

    public void add(T element) { // процедура добавления элемента в конец списка
        if (count == elements.length) { // если у нас количество элементов равно длине массива
            resize(); // "увеличиваем" размер массива
        }
        this.elements[count] = element; // кладем элемент в массив
        this.count++; // увеличиваем количество элементов
    }

    public void addFirst(T element) { // процедура добавление элемента в начало списка
        if (count == elements.length) { // если количество элементов равно длине масива
            resize(); // "увеличиваем" размер массива
        }
        // сдвигаем все элементы вправо, начиная с последнего
        for (int i = count; i > 0; i--) {
            // каждый правый элемент равен левому
            elements[i] = elements[i - 1];
        }
        this.elements[0] = element;
        count++;
    }

    private void resize() { // создаем новый массив, который в полтора раза больше предыдущего
        // переполнение массива - нет места
        T[] newArray = (T[])new Object[elements.length + elements.length / 2];
        // копируем все старые элементы в него
        for (int i = 0; i < count; i++) {
            newArray[i] = elements[i];
        }
        // теперь он используется как новый массив
        this.elements = newArray;
    }

    public void remove(int index) { // процедура удаление элемента из массива по индексу

        if (index <= 0 || index > count) {
            System.err.println("Неверный индекс - " + index);
            return;
        }

        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1]; // сдвигаем все элементы влево
        }

        count--;
    }

    public T get(int index) { // получение элемента по индексу
        if (index < 0 || index >= count) {
            System.err.println("Неверный индекс - " + index);
            return null;
        }

        return elements[index];
    }

    public int count() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList["); // начинаем строку
        for (int i = 0; i < count - 1; i++) {
                result.append(elements[i]).append(", "); // result = result + elements[i], через запятую прибавляем все остальные элементы, кроме последнего
        }
        result.append(elements[count - 1]).append("]"); // прибавляем к строке последний элемент и закрывающую скобку
        return result.toString();
    }

}