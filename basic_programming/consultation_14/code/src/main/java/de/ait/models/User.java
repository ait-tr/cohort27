package de.ait.models;

/**
 * 6/20/2023
 * simple-project
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {
    private boolean hasOrders;

    public User(boolean hasOrders) {
        this.hasOrders = hasOrders;
    }

    public boolean isHasOrders() {
        return hasOrders;
    }
}
