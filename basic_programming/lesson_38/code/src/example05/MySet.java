package example05;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
// класс, в котором будут лежать только уникальные значения
public class MySet {
    private Object[] elements;
    private int count;

    public MySet() {
        this.elements = new Object[10];
        this.count = 0;
    }

    /**
     * Кладем элемент в наше множество
     * @param element новый элемент, если он уже есть в множестве, мы его не добавляем
     */
    public void put(Object element) {
        for (int i = 0; i < count; i++) { // проверяем, есть ли такой элемент в массиве
            if (elements[i].equals(element)) { // проверяем i-ый элемент с добавляемым
                return; // если нашли такой же элемент, то просто останавливаем метод put
            }
        }
        // если мы до этого не нашли такой же элемент - то добавляем его в массив
        elements[count] = element;
        count++;
    }
}
