package example01;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human {
    private int age; // возраст
    private int height; // рост в сантиметрах

    private int experience; // опыт

    public Human(int age, int height, int experience) {
        this.age = age;
        this.height = height;
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", experience=" + experience +
                '}';
    }
}
