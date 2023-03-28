package consultation;

public class Boolean {
    public static void main(String[] args) {
        /*

        if (условие) {
            // блок 1
        } else {
            // блок 2
        }

        блок 1 выполняется, если условие - true, блок 2 если условие - false
        условие - это выражение, которое может состоять из одной переменной типа boolean
        либо из комбинации операций, результатом которых будет boolean
        >, <, ==, !=, >=, <=
        ! - отрицание, унарный оператор (выполняется над одной переменной), он дает true, если операнд false и наоборот
        x | y, x & y - бинарные операторы, слева и справа должны быть выражения или переменные, которые дают нам true либо false

        ИЛИ - хотя бы один из операндов должен быть true, тогда все выражение ИСТИННО
        true | false = true
        false | true = true
        false | false = false
        true | true = true

        И - оба операнда должны быть true, тогда все выражение ИСТИННО
        true & true = true
        true & false = false
        false & true = false
        false & false = false

         */

        int a = 5;
        int b = 15;

//        boolean expression = a != b;
//
//        if (expression) {
//            System.out.println("Я в true");
//        } else {
//            System.out.println("Я в false");
//        }

        // a = 5, b = 15
        // x = a > b
        // y = a < 10
        // a > b | a < 10 -> а больше b ИЛИ a меньше 10
        // a > b & a < 10 -> a больше b И a меньше 10

        // ||, &&
        // a | b - Java проверит первый операнд и второй операнд
        // a || b - Java проверит первый операнд и если он ИСТИННЫЙ, она не будет проверять второй

        // a & b - Java проверит первый операнд и второй операнд
        // a && b - Java проверит первый операнд и если он ЛОЖНЫЙ, она не будет проверять второй
        if (a < b && a < 10) {
            System.out.println("Я в true");
        } else {
            System.out.println("Я в false");
        }

        int z = 50;

        boolean expression = !(z < 100); // z < 100 - true, !(z < 100) -> false, z < 100 - false, !(z < 100) - true

        // z > 100
        if (!(z < 100)) {
            System.out.println("z не меньше 100");
        } else {
            System.out.println("z меньше 100");
        }
    }
}
