package comparing.task_02;

import comparing.task_01.Cat;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(6);
        set.add(2);
        set.add(4);
        set.add(8);
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(3);

        System.out.println(set);

        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat(5, "Black", 3.7));
        cats.add(new Cat(4, "White", 6.1));
        cats.add(new Cat(6, "Gray", 4.6));
        cats.add(new Cat(1, "Red", 4.6));
        cats.add(new Cat(7, "Blue", 4.6));
        cats.add(new Cat(2, "Orange", 4.6));
        cats.add(new Cat(2, "Blue", 4.6));
        cats.add(new Cat(2, "blue", 4.6));
        cats.add(new Cat(2, "Red", 4.6));
        cats.add(new Cat(2, "red", 4.6));
        cats.add(new Cat(2, "Green", 4.6));
        cats.add(new Cat(3, "Green", 5.2));
        cats.add(new Cat(7, "Yellow", 7.0));

        cats.forEach(System.out::println);

        System.out.println();

        Set<Cat> cats1 = new TreeSet<>(new CatComparator());

        cats1.add(new Cat(5, "Black", 3.7));
        cats1.add(new Cat(4, "White", 6.1));
        cats1.add(new Cat(6, "Gray", 4.6));
        cats1.add(new Cat(1, "Red", 4.6));
        cats1.add(new Cat(7, "Blue", 4.6));
        cats1.add(new Cat(2, "Orange", 4.6));
        cats1.add(new Cat(2, "Blue", 4.6));
        cats1.add(new Cat(2, "blue", 4.6));
        cats1.add(new Cat(2, "Red", 4.6));
        cats1.add(new Cat(2, "red", 4.6));
        cats1.add(new Cat(2, "Green", 4.6));
        cats1.add(new Cat(3, "Green", 5.2));
        cats1.add(new Cat(7, "Yellow", 7.0));

        cats1.forEach(System.out::println);
    }
}