package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 7/27/2023
 * PizzaProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Pizza {
    private final String name;

    private final List<Type> types;

    public Pizza(String name) {
        this.name = name;
        this.types = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Type> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", types=" + types +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizza pizza)) return false;

        return Objects.equals(name, pizza.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
