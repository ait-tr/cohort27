package example01;

import java.util.List;
import java.util.Objects;

/**
 * 6/27/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Order {
    private String id;

    private List<Good> goods;

    public Order(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getId() {
        return id;
    }

    public List<Good> getGoods() {
        return goods;
    }
}
