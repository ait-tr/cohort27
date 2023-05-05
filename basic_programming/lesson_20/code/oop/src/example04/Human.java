package example04;

// класс, файл имеет название Human.java
public class Human {
    String name; // null
    double age; // 0.0
    int steps; // 0
    String eyesColor; // null

    // constructor, конструктор

    // пустой конструктор
    Human() {
        name = "Непустое имя";
        age = 1.0;
        steps = 1;
        eyesColor = "Black";
    }

    // конструктор с параметрами
    // String Name, double Age, int Steps, String EyesColor - формальные параметры
    Human(String name, double age, int steps, String eyesColor) {
        // name, age, steps, eyesColor - поля
        this.name = name;
        this.age = age;
        this.steps = steps;
        this.eyesColor = eyesColor;
    }

    Human(String name, double age, int steps) {
        // name, age, steps, eyesColor - поля
        this.name = name;
        this.age = age;
        this.steps = steps;
        this.eyesColor = "Black";
    }
}
