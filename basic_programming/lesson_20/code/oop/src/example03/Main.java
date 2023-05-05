package example03;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // ссылочный
        Human h1 = new Human();
        h1.name = "Марсель";
        h1.age = 29;

        Human h2 = new Human();
        h2.name = "Виктория";
        h2.age = 18;

        System.out.println("До присваивания - " + (h1 == h2));

        h2 = h1;
        h2.name = "Вика";

        System.out.println("После присваивания - " + (h1 == h2));
        System.out.println(h1.name); // Вика

        // примитивный
        int a = 10;
        int b = 15;

        b = a;
        b = 33;
        System.out.println(a); // 10

//        double h = h1.age - 10;
//        System.out.println(h);

        h1.age = h1.age - 10; // h1.age = 29 - 10 -> h1.age = 19;

        h1.age -= 10;

        h1.age--;


    }
}
