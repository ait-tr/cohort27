package example02;

public class Node { // класс, который описывает узел

    private int value;

    public Node next; // ссылка на такой же объект в памяти

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
