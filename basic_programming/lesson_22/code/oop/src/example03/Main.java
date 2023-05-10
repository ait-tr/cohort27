package example03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // создаем объекты класса MyArray
        MyArray a1 = new MyArray();
        MyArray a2 = new MyArray();

        Scanner scanner = new Scanner(System.in);


//        for (int i = 0; i < 50 ; i++) {
//            int number = scanner.nextInt();
//            a1.add(number);
////            System.out.println(Arrays.toString(a1.array));
//        }

        // программа работает и все хорошо
        // но у вас есть возможность изменить внутреннее состояние объекта MyArray
        // и для него это состояние не будет корректным

        a1.add(555);
//        a1.array = null;
//        a1.array[0] = 10000;
//        a1.count = -15;
        a1.add(777);
        a1.add(567);
//        a1.resize();
//        a1.resize();
//        a1.resize();
//        a1.resize();
//        a1.resize();
//        a1.resize();
//        a1.resize();

        System.out.println(a1.getCount());
    }
}
