package comparing.task_01;

public class PrimitiveComparing {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 5;

        boolean result = x == y;
        System.out.println("Результат сравнения x и y - " + result);

        result = x == z;
        System.out.println("Результат сравнения x и z - " + result);

//        Cat cat = 5;
        Cat cat1 = new Cat(5);
        Cat cat2 = new Cat(5);

        Integer integer = 5; // Автоупаковка
//        Integer integer = new Integer(5); так отрабатывает "под капотом"

        int value = integer; // Автораспаковка
//        int value = integer.intValue(); так отрабатывает "под капотом"

//        Long l = 100L;
        result = x == integer;
        System.out.println("Результат сравнения x и integer - " + result);

        Double d = 5.0;
        result = x == d;
        System.out.println("Результат сравнения x и объекта Double - " + result);

//        result = d == integer;
        result = cat1 == cat2;
        Dog dog = new Dog();
//        result = cat1 == dog;

        int i1 = 5;
        double d1 = 5.9;
        result = i1 == (int) d1;
        System.out.println(result);

        Cat cat3 = new Cat(3, "Black", 4.5);
        Cat cat4 = new Cat(3, "Black", 4.5);

        result = cat3 == cat4;
        System.out.println("Сравнение кота 3 и кота 4 - " + result);

        result = cat3.equals(cat4);
        System.out.println("Сравнение кота 3 и кота 4 через equals - " + result);

        String s1 = "Жёлтый";
        String s2 = "Жёлтый";

        System.out.println(s1 == s2);

        s2 = s2 + " ";
    }
}