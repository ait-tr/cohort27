package example04;

public class MyArrayList implements MyList {

    private int[] elements; // хранилище элементов
    private int count; // количество элементов, которое мы положили

    public MyArrayList() {
        this.elements = new int[10];
        this.count = 0;
    }

    @Override
    public void add(int element) {
        if (count == elements.length) {
            resize();
        }
        this.elements[count] = element;
        this.count++;
    }

    @Override
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


    private void resize() {
        // переполнение массива - нет места
        int[] newArray = new int[elements.length + elements.length / 2];

        for (int i = 0; i < count; i++) {
            newArray[i] = elements[i];
        }

        this.elements = newArray;
    }

    @Override
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

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            System.err.println("Неверный индекс - " + index);
            return -1;
        }

        return elements[index];
    }

    @Override
    public int count() {
        return count;
    }

    @Override
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

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator {
        private int next;

        public MyArrayListIterator() {
            next = 0;
        }

        @Override
        public int next() {
            int element = elements[next]; // кладем элемент массива
            next++; // двигаем next на одну позицию вправо
            return element; // возвращаем результат
        }

        @Override
        public boolean hasNext() {
            return next < count;
        }
    }
}
