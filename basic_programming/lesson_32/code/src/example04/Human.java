package example04;

public class Human {
    protected String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void go() {
        System.out.println("Я " + name + ", я человек, иду домой.");
    }
}
