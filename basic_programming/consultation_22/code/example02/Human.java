package example02;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human implements Comparable<Human> {
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

    @Override
    public int compareTo(Human that) {
        // возвращалось отрицательное, если ваш человек меньше по возрасту, чем that
        // возвращалось положительное, если ваш человек больше по возрасту, чем that
        // возвращалось ноль, если они равны
        // this.age == 10, that.age == 20, то результат = -10
        // this.age == 10, that.age == 10, то результат = 0
        // this.age == 20, that.age == 10, то результат = 10
        int result = this.age - that.age;
        if (result == 0) {
            return this.height - that.height;
        } else return result;
    }
}
