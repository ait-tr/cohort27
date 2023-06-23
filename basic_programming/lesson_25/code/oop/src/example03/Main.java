package example02;

public class Main {
    public static void main(String[] args) {
        MyArray a = new MyArray();
        MyArray b = new MyArray();

        a.add(7); // [0]
        a.add(8); // a[1]
        a.add(35); // a[2]
        a.add(17); // a[3]
        a.add(20); // a[4]
        a.add(16); // a[5]
        a.add(23); // a[6]
        a.add(37); // a[7]
        a.add(40); // a[8]
        a.add(31); // a[9]
        a.add(77); // a[10]

        b.add(11);
        b.add(15);

        a.remove(1000); // 8 -> X
        a.add(33);

        System.out.println(a.get(10000)); // 35
    }
}
