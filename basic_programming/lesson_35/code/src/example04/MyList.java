package example04;

public interface MyList extends MyIterable {
    /**
     * Положить элемент в конец списка
     * @param element добавляемый элемент
     */
    void add(int element);

    /**
     * Положить элемент в начало списка
     * @param element добавляемый элемент
     */
    void addFirst(int element);

    /**
     * Получить количество элементов в списке
     * @return количество элементов
     */
    int count();

    /**
     * Удаление по индексу
     * @param index индекс удаляемого элемента
     */
    void remove(int index);

    /**
     * Получение элемента по индексу
     * @param index индекс элемента
     * @return элемент, стоящий под <code>index</code>
     */
    int get(int index);

    /**
     * Преобразование списка в массив
     * @return созданный на основе списка массив
     */
    int[] toArray();
}
