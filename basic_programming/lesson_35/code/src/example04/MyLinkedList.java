package example04;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyLinkedList implements MyList {

    @Override
    public MyIterator iterator() {
        return null;
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; // null
    private Node last; // указатель на последний элемент
    private int count;

    public MyLinkedList() {
        this.count = 0;
    }


    @Override
    public void add(int element) {
        Node newNode = new Node(element);

        if (count == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        count++;
    }

    @Override
    public void addFirst(int element) {
        Node newNode = new Node(element);

        if (first != null) {
            newNode.next = first;
        } else {
            last = newNode;
        }

        first = newNode;
        count++;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void remove(int index) {
        // TODO: сделать
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            System.err.println("Неверный индекс - " + index);
            return -1;
        }

        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next; // переходим к следующему узлу
        }
        return current.value;
    }

    @Override
    public int[] toArray() {
        // TODO: сделать
        return new int[0];
    }
}
