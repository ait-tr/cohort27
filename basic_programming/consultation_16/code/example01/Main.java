package example01;

import java.util.ArrayList;
import java.util.List;

/**
 * 6/27/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order order = new Order("ID");
        orders.remove(order);

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).equals("ID")) {
                orders.remove(orders.get(i));
            }

        }
    }
}
