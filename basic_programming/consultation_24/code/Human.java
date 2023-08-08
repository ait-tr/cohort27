/**
 * 8/8/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human implements Comparable<Human> {
    private int age;

    // краевые случаи:
    // -1,0,100,101
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else throw new IllegalArgumentException("Возраст некорректный");
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Human o) {
        // отрицательное число, если у второго объекта возраст больше
        // ноль, если возраст такой же
        // положительное число, если у второго объекта возраст меньше
        return this.age - o.age;
    }
}
