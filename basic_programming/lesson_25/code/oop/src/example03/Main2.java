package example03;

public class Main2 {
    public static void main(String[] args) {
        MyArray a = new MyArray();

        a.add(7); // [0]
        a.add(8); // a[1]
        a.add(35); // a[2]
        a.add(17); // a[3]
        a.add(20); // a[4]

//        a.count = 2;
//        a.count = -10;

//        a.elements = null; // стерли массив с данными
        a.add(777); // a[5]

        System.out.println(a.getCount());
    }
}
