package example02;

public class Developer extends Human {
    private int experience;

    public Developer(String firstName, String lastName, int experience) {
        super(firstName, lastName);
        this.experience = experience;
    }

    public Developer(int experience) {
        super("Без имени", "Без фамилии");
        this.experience = experience;
    }

}
