package example05;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human {
    private int age;
    private boolean isWork;

    public Human(int age, boolean isWork) {
        this.age = age;
        this.isWork = isWork;
    }

    public int getAge() {
        return age;
    }

    public boolean isWork() {
        return isWork;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (this.getClass() == obj.getClass()) {
            Human that = (Human) obj;
            return this.isWork == that.isWork && this.age == that.age;
        } return false;
    }
}
