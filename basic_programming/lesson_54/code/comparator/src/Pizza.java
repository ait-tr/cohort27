import java.util.Objects;

public class Pizza implements Comparable<Pizza> {
  // интерфейс Comparable<Класс> говорит, что объекты этого класса (и наследников) можно сравнивать
  // В этом интерфейсе обязательно нужно реализовать метод `compareTo()`

  private final String name;
  private final String size;
  private final double price;

  public Pizza(String name, String size, double price) {
    this.name = name;
    this.size = size;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "name='" + name + '\'' +
        ", size='" + size + '\'' +
        ", price=" + price +
        '}';
  }

  // определение "естественного" порядка, натуральной сортировки
  // natural order, natural sort
  @Override
  public int compareTo(Pizza o) {
    // метод compareTo сравнивает текущий объект (this) с аргументом (o - object - other)
    // если this < o, то метод должен вернуть любое отрицательное число - ответ < 0
    // если this = o, то метод должен вернуть 0                         - ответ = 0
    // если this > o, то метод должен вернуть любое положительное число - ответ > 0
    // a < b  -->  a - b < b - b  -->  a - b < 0
    // a = b  -->  a - b = b - b  -->  a - b = 0
    // a > b  -->  a - b > b - b  -->  a - b > 0
    // метод compareTo устроен так, чтобы возвращать разницу (this - o)
    // если сравнение объектов можно превратить в сравнение чисел (есть метрика), то такие числа
    //   иногда называют ключом сравнения (comparison key)

    // если в числа превратить нельзя или сложно:
    // если названия разные, то по названиям
    if (!name.equals(o.name)) { // (compareTo != 0) --> названия не равны (разные)
      return name.compareTo(o.name); // по названиям
    }
    // если названия одинаковые, но размеры разные, то по размерам
    if (!size.equals(o.size)) {
      return size.compareTo(o.size);
    }
    // если размеры одинаковые, то по цене
    // (double - double) нельзя превращать в int - потеряется дробная часть и 0.3 превратится в 0
//    return (int) Math.signum(price - o.price); // знак числа (отриц. в -1.0, полож. +1.0)
    return Double.compare(price, o.price);
  }

  // определение метода compareTo() должно приводить к переопределению метода equals()

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pizza other)) {
      return false;
    }
    return price == other.price &&
        size.equals(other.size) &&
        name.equals(other.name);
  }

  // переопределение метода equals() должно приводить к переопределению метода hashCode()
  @Override
  public int hashCode() {
    return Objects.hash(name, size, price);
  }

  // эти три метода должны быть консистентными - вести себя одинаково
}
