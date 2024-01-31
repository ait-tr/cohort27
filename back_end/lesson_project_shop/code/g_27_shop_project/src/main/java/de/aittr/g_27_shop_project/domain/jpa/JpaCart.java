package de.aittr.g_27_shop_project.domain.jpa;

import de.aittr.g_27_shop_project.domain.interfaces.Cart;
import de.aittr.g_27_shop_project.domain.interfaces.Product;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cart")
public class JpaCart implements Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private JpaCustomer customer;

    @ManyToMany
    @JoinTable(
            name = "cart_product",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<JpaProduct> products;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(JpaCustomer customer) {
//        JpaCustomer entity = new JpaCustomer();
//        entity.setId(customer.getId());
//        entity.setName(customer.getName());
//        entity.setActive(customer.isActive());
//        entity.setCart(customer.getCart());
//        this.customer = entity;
//    }

    public JpaCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(JpaCustomer customer) {
        this.customer = customer;
    }

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public void setProducts(List<Product> products) {
        this.products = products.stream().map(x -> {
            JpaProduct entity = new JpaProduct();
            entity.setId(x.getId());
            entity.setName(x.getName());
            entity.setActive(x.isActive());
            entity.setPrice(x.getPrice());
            return entity;
        }).toList();
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProductById(int productId) {

    }

    @Override
    public void clear() {

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getAveragePrice() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JpaCart jpaCart = (JpaCart) o;
        return id == jpaCart.id && Objects.equals(customer, jpaCart.customer) && Objects.equals(products, jpaCart.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, products);
    }

    @Override
    public String toString() {
        return "JpaCart{" +
                "id=" + id +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}