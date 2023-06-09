package example04;

public class Blogger extends Human {
    private String target;

    public Blogger(String name, int age, String target) {
        super(name, age);
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void saySomething() {
        System.out.println("Посмотрите мое новое видео!");
    }
}
