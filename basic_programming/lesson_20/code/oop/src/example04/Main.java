package example04;

public class Main {
    public static void main(String[] args) {
        // y = f(x)
        // y = x^2, x - параметр
        // y = f(5) -> 5 * 5, 5 - аргумент
        // "Марсель", 29.5, 4, "Brown" - аргументы
        // значения, которые подставляются в формальные параметры
        Human marsel = new Human("Марсель", 29.5, 4, "Brown");
        Human viktoria = new Human("Виктория", 18, 20_000, "Blue");
        Human kenan = new Human("Кенан", 27, 15_000);
        Human kirill = new Human("Кирилл", 35.5, 20_000, null);
        Human petr = new Human("Петр", 34, 20_000, null);

        Human dmitriN = new Human("Дмитрий Н", 47, 10000, "Grey");
        Human dmitriL = new Human("Дмитрий Л", 32, 8000, "Brown");
        Human somebody = new Human();

        marsel.age = 30;
        System.out.println(somebody.name + " " + somebody.eyesColor);

    }
}
