package example02;

public class User {
    // fields
    private String name;
    private int stepsCount;
    private int age;
    private int experience;

    // constructor
    public User(String name, int stepsCount, int age, int experience) {
        this.name = name;
        // осуществляем контроль внесенных данных
        if (stepsCount >= 0) {
            this.stepsCount = stepsCount;
        } else {
            this.stepsCount = 0;
        }

        if (age >= 1) {
            this.age = age;
        } else {
            this.age = 1;
        }

        if (experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getStepsCount() {
        return stepsCount;
    }

}
