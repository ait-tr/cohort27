package example02;

public class Human {
    private String firstName;
    private String lastName;
    protected int age; // 0
    private boolean isSleep; // false
    private boolean isMarried; // false

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String firstName) {
        this.firstName = firstName;
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

    public void go() {
        System.out.println("Я человек, иду домой!");
    }
}
