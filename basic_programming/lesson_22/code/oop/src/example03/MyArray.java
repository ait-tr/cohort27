package example03;

// класс, который будет описывать "Особый массив"
// для которого мы определим операции добавления и изменения размера
public class MyArray {
    // поля

    private int count; // фактическое количество элементов массива
    private int[] array; // ссылка на массив с которым мы работаем

    // конструктор
    public MyArray() {
        this.count = 0;
        // при создании объекта MyArray мы создаем пустой массив на 10 элементов
        this.array = new int[10];
    }

    // метод добавления элемента в массив
    public void add(int element) {
        // проверим, а не переполнен ли уже массив, который мы держим?
        if (count == array.length) {
            System.out.println("Массив переполнен... увеличиваем");
            resize();
        }
        // array[-10] = 55 не может быть! потому что индексы строго положительные
        this.array[this.count] = element;
        this.count++;
    }

    private void resize() {
        // создаем массив, который больше предыдущего в полтора раза
        int[] newArray = new int[array.length + array.length / 2];
        // копируем в него все элементы
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // в наше поле запомнили новый массив, а на старый забили
        array = newArray;
    }

    // удаление элемента из массива
    // [10, 15, 16, 17, 8, 0, 0, 0], count = 5
    // remove(16)
    // [10, 15, 17, 8, 8, 0, 0, 0], count = 4
    // add(77)
    // [10, 15, 17, 8, 77, 0, 0]
    public void remove(int element) {

    }

    // удаление последнего элемента
    // 10, 15, 17
    // removeLast()
    // 10, 15, 17
    // add(99)
    // 10, 15, 99

    public void removeLast() {
        count--;
    }

    // метод-геттер
    // позволяет прочитать поле (только прочитать!!!)
    public int getCount() {
        return count;
    }
}
