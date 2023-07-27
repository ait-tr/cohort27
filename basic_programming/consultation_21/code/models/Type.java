package models;

/**
 * 7/27/2023
 * PizzaProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Type {
    private final Size size;
    private final double price;

    public Type(Size size, double price) {
        this.size = size;
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Type{" +
                "size=" + size +
                ", price=" + price +
                '}';
    }
}
