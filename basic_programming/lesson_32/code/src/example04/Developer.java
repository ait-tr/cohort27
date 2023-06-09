package example04;

public class Developer extends Human {
    private String programmingLanguage;

    public Developer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void go() {
        System.out.println("Я - " + name + ", домой не иду пишу на " + programmingLanguage);
    }

    public void go(int km) {
        System.out.println("Я " + name + "но я программист, я не могу ходить на " + km + " километров");
    }

}
