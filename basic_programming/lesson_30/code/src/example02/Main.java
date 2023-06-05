package example02;

public class Main {
    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList();
        list1.add(4);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(33);

        MyArrayList list2 = new MyArrayList();
        list2.add(777);
        list2.add(888);
        list2.add(999);

        MyArrayList.Iterator iterator1 = list1.new Iterator();
        MyArrayList.Iterator iterator2 = list2.new Iterator();

        while (iterator1.hasNext()) {
            int element = iterator1.next();
            System.out.print(element + " ");
        }
        // 4 10 15 20
        System.out.println();
        while (iterator2.hasNext()) {
            int element = iterator2.next();
            System.out.print(element + " ");
        }
    }
}
