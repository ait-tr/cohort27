package example02;

public class Developer extends Human {
    private int experience;
    private String programmingLanguage;

    public Developer(String firstName, String lastName, String programmingLanguage) {
        super(firstName, lastName); // вызов конструктора предка
        this.programmingLanguage = programmingLanguage;
    }

    public void setExperience(int experience) {
        if (experience > 0 && experience <= age) {
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void go() {
        System.out.println("Я программист на " + programmingLanguage + " и я иду на работу!");
    }
}
