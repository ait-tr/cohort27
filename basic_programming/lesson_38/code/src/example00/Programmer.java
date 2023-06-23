package example00;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Programmer extends Human {
    private String language;

    public Programmer(String name, int age, String language) {
        super(name, age);
        this.language = language;
    }

    public void work() {
        System.out.println("Я программист, работаю на " + language);
    }

    public String getLanguage() {
        return language;
    }
}
