/**
 * 6/30/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first;
    private Node<T> last;

    private int count;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public MyIterator<T> iterator() {
        return null;
    }

    public static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    /**
     * Добавление элемента в конец списка
     *
     * @param element добавляемый элемент
     */
    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element); // создали узел с конкретным элементом

        if (first != null) { // если первый элемент - не null, то значит там есть элемент
            this.last.next = newNode; // теперь последний узел указывает на новый
        } else { // если first - null, то просто первый элемент - и есть новый
            this.first = newNode;
        }

        this.last = newNode; // новый узел - он всегда последний
        count++;
    }

    @Override
    public T get(int index) {
        Node<T> current = first; // начинаем с самого первого узла
        for (int i = 0; i < index; i++) { // цикл последовательно проходит каждый узел пока не дойдет до нужного
            current = current.next; // переходим на следующий узел
        }

        return current.value;
    }



}
