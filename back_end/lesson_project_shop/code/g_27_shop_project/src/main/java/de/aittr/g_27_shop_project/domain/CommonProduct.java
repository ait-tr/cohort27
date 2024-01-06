package de.aittr.g_27_shop_project.domain;

import de.aittr.g_27_shop_project.domain.interfaces.Product;

import java.util.Objects;

public class CommonProduct implements Product {

    private int id;
    private boolean isActive;
    private String name;
    private double price;

    public CommonProduct() {
        this.isActive = true;
    }

    public CommonProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.isActive = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonProduct that = (CommonProduct) o;
        return id == that.id && isActive == that.isActive && Double.compare(that.price, price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, price);
    }

    @Override
    public String toString() {
        return String.format("Продукт: ИД - %d, наименование - %s, цена - %.2f, активен - %s.",
                id, name, price, isActive ? "да" : "нет");
    }
}