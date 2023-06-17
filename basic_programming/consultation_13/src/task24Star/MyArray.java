package task24Star;

public class MyArray {

    private int[] elements; // хранилище элементов
    private int count; // количество элементов, которое мы положили

    public MyArray() {
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

    public void clear() {
        count = 0;
    }

    public void set(int index, int element) {
        if (index < 0 || index > count) {
            System.err.println("Неверный индекс - " + index);
            return; // останавливаем выполнение
        }

        elements[index] = element;
    }
    // 0 1 2 3 4 5 6 7 0 0 0 0
    // count = 8
    // removeRange(2, 5)
    // 0 1 6 7 .....
    public void removeRange(int fromIndex, int toIndex) {
        int k = 1;
        for (int i = fromIndex; i < toIndex; i++) {

            if (toIndex + k == elements.length) { // если выходим за границы
                break; // останавливаем цикл
            }

            // elements[2] <- elements[5 + 1] = elements[6]
            // elements[3] <- elements[5 + 2] = elements[7]
            // elements[4] <- elements[5 + 3] = elements[8]
            elements[i] = elements[toIndex + k];
            k++;
        }
        // count = 8 - (5 - 2 + 1) = 8 - 4 = 4
        count = count - (toIndex - fromIndex + 1);
    }

    public boolean containsAll(MyArray other) {

        for (int i = 0; i < other.count; i++) {
            int number = other.elements[i];
            boolean isExist = false; // предполагаем, что число не содержится в вашем списке
            for (int j = 0; j < this.count; j++) {
                if (number == this.elements[j]) {
                    // нашли число из второго массива в первом
                    isExist = true;
                    break; // останавливаем цикл
                }
            }
            if (isExist == false) { // если хотя бы одно число не нашли, возвращаем false
                return false;
            }
        }
        return true; // если ни разу не вернули false, то все отлично, все числа есть
    }
}