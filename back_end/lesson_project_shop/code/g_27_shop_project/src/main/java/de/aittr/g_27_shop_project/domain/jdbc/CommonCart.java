package de.aittr.g_27_shop_project.domain.jdbc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.aittr.g_27_shop_project.domain.interfaces.Cart;
import de.aittr.g_27_shop_project.domain.interfaces.Product;

import java.util.ArrayList;
import java.util.List;

public class CommonCart implements Cart {

    private int id;
    private List<Product> products = new ArrayList<>();

    public CommonCart() {
    }

    public CommonCart(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProductById(int productId) {
        products.removeIf(x -> x.getId() == productId);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public double getTotalPrice() {
        return products.stream()
                .filter(x -> x.isActive())
                .mapToDouble(x -> x.getPrice())
                .sum();
    }

    @Override
    @JsonIgnore
    public double getAveragePrice() {
        return products.stream()
                .filter(x -> x.isActive())
                .mapToDouble(x -> x.getPrice())
                .average()
                .orElse(0);
    }
}