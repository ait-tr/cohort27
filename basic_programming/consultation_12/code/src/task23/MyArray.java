package task23;

public class MyArray {
    // поля

    private int count;
    private int[] array;

    // конструктор
    public MyArray() {
        this.count = 0;
        this.array = new int[10];
    }

    public void add(int element) {
        if (count == array.length) {
            System.out.println("Массив переполнен... увеличиваем");
            resize();
        }
        this.array[this.count] = element;
        this.count++;
    }

    private void resize() {
        int[] newArray = new int[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // удаление элемента из массива
    // [10, 15, 16, 17, 8, 0, 0, 0], count = 5
    // remove(16)
    // [10, 15, 17, 8, 8, 0, 0, 0], count = 4
    // add(77)
    // [10, 15, 17, 8, 77, 0, 0]
    public void remove(int element) { // нужно удалить первый встречный элемент
        for (int i = 0; i < count; i++) {
            if (array[i] == element) {
                for (int j = i; j < count; j++) {
                    array[j] = array[j + 1]; // сдвигаем все элементы влево
                }
                count--;
                break; // останавливаем работу метода
            }
        }
    }

    public void removeLast() {
        count--;
    }

    // метод-геттер
    // позволяет прочитать поле (только прочитать!!!)
    public int getCount() {
        return count;
    }
}