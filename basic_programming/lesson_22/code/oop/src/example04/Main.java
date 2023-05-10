package example04;

import example03.MyArray;

public class Main {

    public static void main(String[] args) {
        MyArray a1 = new MyArray();
        MyArray a2 = new MyArray();
        MyArray a3 = new MyArray();


        a1.add(170);
        a1.add(180);

        a2.add(566);
        a2.add(777);
        a2.add(-10);

        a3.add(9);

        System.out.println(a1.getCount());
        System.out.println(a2.getCount());
        System.out.println(a3.getCount());

    }
}
