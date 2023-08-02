import java.util.Comparator;

public class PizzaPriceComparator implements Comparator<Pizza> {

  @Override
  public int compare(Pizza o1, Pizza o2) {
    // возвращаемые значения устроены точно так же, как и в методе compareTo():
    // если o1 < o2, то метод должен вернуть любое отрицательное число - ответ < 0
    // если o1 = o2, то метод должен вернуть 0                         - ответ = 0
    // если o1 > o2, то метод должен вернуть любое положительное число - ответ > 0
    // метод compare устроен так, чтобы возвращать разницу (o1 - o2)
    return Double.compare(o1.getPrice(), o2.getPrice());
  }
}
