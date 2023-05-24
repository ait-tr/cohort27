package example02;

public class Main {
    public static void main(String[] args) {
        Node a = new Node();
        a.value = 5;


        Node b = new Node();
        b.value = 7;

        Node c = new Node();
        c.value = 9;

        Node d = new Node();
        d.value = 15;

        a.next = b;
        b.next = c;
        c.next = d;
        
        int i = 0;
    }
}
