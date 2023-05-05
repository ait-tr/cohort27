package example01;

public class Main2 {
    public static void main(String[] args) {
        // создал 5 объектов
        // age = 0.0, steps = 0, name = null
        Human marsel = new Human();
        Human viktoria = new Human();
        Human kenan = new Human();
        Human kirill = new Human();
        Human petr = new Human();

        // 0 - Марсель 29 1500
        // 1 - Виктория 18 20000
        // 2 - Кенан 27 15000
        // 3 - Кирилл 35.5 12000
        // 4 - Петр 34 20000

        marsel.name = "Марсель";
        marsel.age = 29.5;
        marsel.steps = 4;
        marsel.eyesColor = "Brown";

        viktoria.name = "Виктория";
        viktoria.age = 18;
        viktoria.steps = 20_000;
        viktoria.eyesColor = "Blue";

        kenan.name = "Кенан"; // eyesColor = null
        kenan.age = 27;
        kenan.steps = 15_000;

        kirill.name = "Кирилл";
        kirill.age = 35.5;
        kirill.steps = 20_000;

        petr.name = "Петр";
        petr.age = 34;
        petr.steps = 20_000;

        int[] numbers = {55, 67, 89, 11};
        // объявляем массив людей
        Human[] humans = {marsel, viktoria, kenan, kirill, petr};

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + " " + humans[i].age);
        }
    }
}
