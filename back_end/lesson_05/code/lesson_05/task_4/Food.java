package lesson_05.task_4;

import java.util.Objects;

public class Food {

    private String label;
    private int requiredQuantity;

    public Food() {
    }

    public Food(String label, int requiredQuantity) {
        this.label = label;
        this.requiredQuantity = requiredQuantity;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return requiredQuantity == food.requiredQuantity && Objects.equals(label, food.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, requiredQuantity);
    }

    @Override
    public String toString() {
        return String.format("Наименование - %s, необходимое количество - %d.", label, requiredQuantity);
    }
}