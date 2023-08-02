import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class BillTests {

  @Test
  public void addNewRow() {
    // arrange - установить начальные значения
    Bill bill = new Bill();
    String title = "title";
    double price = 2.5;

    // act - совершить действие
    bill.addRow(title, price);
    Map<String, Double> rows = bill.getRows();

    // assert - предположить, что результат правильный
    // проверить, что строка только одна
    assertEquals(1, rows.size());
    // проверить, что названию title соответствует price
    assertEquals(price, rows.get(title));
  }
}
