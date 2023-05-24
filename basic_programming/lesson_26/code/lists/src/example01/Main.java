package example01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        int[] beforeAddFirst = arrayList.toArray();

        System.out.println(Arrays.toString(beforeAddFirst));

        arrayList.addFirst(10);

        int[] afterAddFirst = arrayList.toArray();

        System.out.println(Arrays.toString(afterAddFirst));
    }
}