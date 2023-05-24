package example02;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addFirst(11);
        linkedList.addFirst(15);
        linkedList.addFirst(16);
        linkedList.addFirst(17);

        linkedList.add(99);
        linkedList.add(199);
        linkedList.add(299);

        int i = 0;

        // 17 -> 16 -> 15 -> 11 -> 99 -> 199 -> 299
        //  0     1     2     3     4      5      6

        int some = linkedList.get(4); // some == 99


    }
}
