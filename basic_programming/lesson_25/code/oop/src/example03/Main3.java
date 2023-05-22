package example03;

public class Main3 {
    public static void main(String[] args) {
        MyArray a = new MyArray();

        a.add(7); // [0]
        a.add(8); // a[1]
        a.add(35); // a[2]
        a.add(17); // a[3]
        a.add(20); // a[4]

        int[] elementsFromArray = a.toArray();

        for (int i = 0; i < a.getCount(); i++) {
            System.out.print(elementsFromArray[i] + ",");
        }
        System.out.println("--------");
        elementsFromArray[2] = 150;
        System.out.println(a.get(2)); // 35
        System.out.println(a.get(1)); // 8
    }
}
