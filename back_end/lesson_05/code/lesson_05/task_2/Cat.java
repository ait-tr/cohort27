package lesson_05.task_2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
import java.util.Objects;

@JsonAutoDetect
public class Cat {

    private int age;
    private String color;
    private double weight;
    private Owner owner;
    private List<Food> food;

    public Cat() {
    }

    public Cat(int age, String color, double weight, Owner owner, List<Food> food) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.owner = owner;
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color) && Objects.equals(owner, cat.owner) && Objects.equals(food, cat.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight, owner, food);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Кот: возраст - ");
        builder.append(age)
                .append(", цвет - ")
                .append(color)
                .append(", вес - ")
                .append(weight)
                .append(".\n")
                .append("    ")
                .append(owner)
                .append("\n")
                .append("    Список предпочитаемой еды:\n");
        for (Food currentFood : food) {
            builder.append("        ").append(currentFood).append("\n");
        }
        return builder.toString();
    }
}