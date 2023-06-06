package task23;

public class Task23 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(8);
        myArray.add(11);
        myArray.add(12);
        myArray.add(15);
        myArray.add(16);
        myArray.add(19);

        System.out.println(myArray.getCount());

        myArray.remove(12);

        System.out.println(myArray.getCount());
    }
}
