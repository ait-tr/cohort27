import java.util.HashMap;
import java.util.Map;

public class Bill {

  // чек с Map<String, Double> - название позиции и цена
  // методы:
  // - добавить позицию
  // - посчитать сумму
  private final Map<String, Double> rows = new HashMap<>();

  public Map<String, Double> getRows() {
    return rows;
  }

  public void addRow(String title, double price) {
    if (rows.containsKey(title)) {
      throw new IllegalArgumentException("Повтор позиции: " + title);
    }
    rows.put(title, price);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Чек:\n");
    for (Map.Entry<String, Double> entry : rows.entrySet()) {
      builder
          .append(entry.getKey())
          .append(String.format(" =%.2f", entry.getValue()))
          .append('\n');
    }
    return builder.toString();
  }
}
