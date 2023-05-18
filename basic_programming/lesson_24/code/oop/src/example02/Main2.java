package example02;

public class Main2 {
    // написать метод, который, зная только первый узел, распечаетет информацию обо всех других узлах

/*
    public static void print(Node first) {
        // сделаем переменую, которая будет гулять по узлам до самого конца начиная с первого
        Node current = first;
        System.out.println(current.getValue()); // распечатаю значение
        current = current.next; // взяли следующий после текущего и положили его в качестве текущего
        System.out.println(current.getValue());
        current = current.next;
        System.out.println(current.getValue());
        current = current.next;
        System.out.println(current.getValue());
    }
*/

    public static void print(Node first) {
        Node current = first; // указываем на самый первый узел
        while (current != null) { // пока не прошли весь набор узлов
            System.out.println(current.getValue()); // печатаем
            current = current.next; // идем дальше
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        Node n4 = new Node(77);
        Node n5 = new Node(88);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        print(n1);
    }
}
