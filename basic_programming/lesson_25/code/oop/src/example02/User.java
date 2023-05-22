package example02;

public class User {
    private String name;
    private int age;

    public User() {
        this.age = 1;
        this.name = "NONAME";
    }

    public User(String name, int age) {
        if (name.equals("")) { // если некорректная ситуация
            this.name = "NONAME";
        } else {
            this.name = name;
        }

        if (age <= 1 || age >= 120) { // если некорректная ситуация
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // метод
    public void makeOlder() {
        this.age++;
    }
}
