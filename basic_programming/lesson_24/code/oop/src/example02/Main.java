package example02;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        Node n4 = new Node(77);

        n1.next = n2; // положили в качестве следующего элемента для n1 ссылку на n2
        n2.next = n3;
        n3.next = n4;

    }
}
