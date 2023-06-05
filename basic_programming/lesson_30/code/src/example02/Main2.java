package example02;

public class Main2 {
    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList();
        list1.add(4);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(33);

        MyArrayList.Iterator iterator1 = list1.new Iterator();
        iterator1.next();
        iterator1.next();
        iterator1.next();

        MyArrayList.Iterator iterator2 = list1.new Iterator();
        System.out.println(iterator2.next());
    }
}
