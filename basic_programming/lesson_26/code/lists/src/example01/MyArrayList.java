package example01;

public class MyArrayList {

    private int[] elements; // хранилище элементов
    private int count; // количество элементов, которое мы положили

    public MyArrayList() {
        this.elements = new int[10];
        this.count = 0;
    }

    public void add(int element) {
        if (count == elements.length) {
            resize();
        }
        this.elements[count] = element;
        this.count++;
    }

    public void addFirst(int element) {
        if (count == elements.length) {
            resize();
        }
        // сдвигаем все элементы вправо, начиная с последнего
        for (int i = count; i > 0; i--) {
            // каждый правый элемент равен левому
            elements[i] = elements[i - 1];
        }
        this.elements[0] = element;
        count++;
    }


    public void resize() {
        // переполнение массива - нет места
        int[] newArray = new int[elements.length + elements.length / 2];

        for (int i = 0; i < count; i++) {
            newArray[i] = elements[i];
        }

        this.elements = newArray;
    }

    public void remove(int index) {

        if (index <= 0 || index > count) {
            System.err.println("Неверный индекс - " + index);
            return;
        }

        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }

        count--;
    }

    public int get(int index) {
        if (index <= 0 || index > count) {
            System.err.println("Неверный индекс - " + index);
            return -1;
        }

        return elements[index];
    }

    public int getCount() {
        return count;
    }

    public int[] toArray() {
        // создаю копию массива, но только с нужными элементы
        int[] copy = new int[count];
        // скопирую все элементы из оригинального массива
        for (int i = 0; i < count; i++) {
            copy[i] = elements[i];
        }
        // возвращаем ссылку на копию, а не оригинал
        return copy;
    }
}
