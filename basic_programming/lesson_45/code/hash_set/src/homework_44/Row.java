package homework_44;

public class Row {

  private String title;
  private double price;

  public Row(String title, double price) {
    this.title = title;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
//    return title + " =" + price;
    return String.format("%s = %.2f", title, price);
  }
}
