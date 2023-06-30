public class MyArrayList<T> implements MyList<T> {

    private T[] elements; // хранилище элементов
    private int count; // количество элементов, которое мы положили

    public MyArrayList() { // конструктор
        this.elements = (T[])new Object[10]; // создаем массив элементов (изначально 10)
        this.count = 0;
    }

    @Override
    public void add(T element) { // процедура добавления элемента в конец списка
        if (count == elements.length) { // если у нас количество элементов равно длине массива
            resize(); // "увеличиваем" размер массива
        }
        this.elements[count] = element; // кладем элемент в массив
        this.count++; // увеличиваем количество элементов
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

    @Override
    public T get(int index) { // получение элемента по индексу
        if (index < 0 || index >= count) {
            System.err.println("Неверный индекс - " + index);
            return null;
        }

        return elements[index];
    }

    @Override
    public int getCount() {
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

    @Override
    public MyIterator<T> iterator() {
        return null;
    }
}