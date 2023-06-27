package example01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 6/27/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("orders_goods.txt"));
        List<Order> orders = new ArrayList<>();
        for (Order order : orders) {
            List<Good> goods = order.getGoods();
            for (Good good : goods) {
                writer.write(order.getId() + "|" + good.getId());
            }
        }
    }
}
