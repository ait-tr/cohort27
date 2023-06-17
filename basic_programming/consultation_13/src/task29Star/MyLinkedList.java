package task29Star;

public class MyLinkedList {
    private Node first; // null
    private Node last; // указатель на последний элемент
    private int count;

    public MyLinkedList() {
        this.count = 0;
    }

    /*
    public void add(int element) {
        Node newNode = new Node(); // создали новый узел
        newNode.value = element;

        Node current = first; // заводим указатель на первый элемент

        // идем до последнего элемента списка
        while (current.next != null) { // пока следующий после текущего не равен null
            current = current.next; // текущий равен следующему после текущего
        }

        current.next = newNode; // теперь current указывает на последний узел списка, следующй после последнего - новый узел
        count++;
    }
     */

    public void add(int element) {
        Node newNode = new Node(element); // создали новый узел

        if (count == 0) { // если элементов нет
            first = newNode; // первый узел и есть новый
        } else {
            last.next = newNode; // если элементы были, то следующий после последнего - новый узел
        }

        last = newNode; // новый узел теперь последний
        count++;
    }

    public void addFirst(int element) {
        Node newNode = new Node(element); // создали новый узел

        if (first != null) { // если в списке уже есть элементы
            newNode.next = first; // делаем следующий после нового - первый
        } else {
            last = newNode; // если список пустой, то новый элемент - также последний
        }

        first = newNode; // новый узел стал первым в списке
        count++;
    }

    public int getCount() {
        return count;
    }

    // получение элемента по индексу
    public int get(int index) {
        return -1;
    }

    public class Iterator {

        private Node current;

        public Iterator() {
            this.current = first;
        }

        public int next() {
            int value = current.value; // запоминаете текущее значение узла
            current = current.next; // переводите курсор дальше
            return value; // возвращаете значение
        }

        public boolean hasNext() {
            return current != null;
        }
    }
}
