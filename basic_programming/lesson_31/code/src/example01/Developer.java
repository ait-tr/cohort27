package example01;

public class Developer {
    private String firstName;
    private String lastName;
    private int age; // 0
    private boolean isSleep; // false
    private boolean isMarried; // false
    private int experience;
    private String programmingLanguage;

    public Developer(String firstName, String lastName, String programmingLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.programmingLanguage = programmingLanguage;
    }

    public void setExperience(int experience) {
        if (experience > 0 && experience <= age) {
            this.experience = experience;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }


    public void wakeUp() {
        this.isSleep = false;
    }

    public void goToSleep() {
        this.isSleep = true;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public boolean isMarried() {
        return isMarried;
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
