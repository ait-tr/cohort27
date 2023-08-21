package hair_color;

import java.time.LocalTime;
import java.util.Scanner;

public class Order {

  private static final double PRICE_PER_CM = 1.5;         // евро за сантиметр длины
  private static final double MULTIPLIER_PER_COLOR = 0.2; // доля за каждый цвет
  private String name;                                    // имя заказчика
  private LocalTime startTime;                            // время начала
  // TODO продолжительность
  private int colors;                                     // количество цветов
  // TODO список цветов
  private double length;                                  // длина волос
  private double price;                                   // сумма заказы

  public Order(String name, LocalTime startTime, int colors, double length) {
    this.name = name;
    this.startTime = startTime;
    this.colors = colors;
    this.length = length;
    calculatePrice();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  public int getColors() {
    return colors;
  }

  public void setColors(int colors) {
    this.colors = colors;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Обновление поля <code>price</code> с использованием значений полей <code>length</code> и
   * <code>colors</code>
   */
  private void calculatePrice() {
    price = PRICE_PER_CM * length + MULTIPLIER_PER_COLOR * colors;
  }

  /**
   * Интерактивное чтение данных о заказе
   *
   * @param scanner источник данных
   * @return прочитанный заказ
   */
  public static Order interactiveRead(Scanner scanner) {
    System.out.print("Введите имя заказчика: ");
    String name = scanner.nextLine();
    System.out.print("Введите время начала: ");
    LocalTime startTime = LocalTime.parse(scanner.nextLine());
    System.out.print("Укажите планируемое количество цветов: ");
    int colors = scanner.nextInt();
    scanner.nextLine(); // пропускаем весь ввод после числа до нажатия клавиши Enter
    System.out.print("Укажите длину волос в сантиметрах: ");
    double length = scanner.nextDouble();
    scanner.nextLine(); // дочитываем последнюю строку до конца
    return new Order(name, startTime, colors, length);
  }
}
