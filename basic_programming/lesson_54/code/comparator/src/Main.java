import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Pizza> pizzas = new ArrayList<>();
    pizzas.add(new Pizza("A", "L", 25));
    pizzas.add(new Pizza("A", "S", 17));
    pizzas.add(new Pizza("B", "M", 9));
    pizzas.add(new Pizza("A", "XS", 15));

    System.out.println("До сортировки:");
    for (Pizza p : pizzas) {
      System.out.println(p);
    }
    // сортировка может быть стабильной и нестабильной:
    // - стабильная для равных элементов сохраняет порядок добавления
    // - нестабильная ничего не обещает и может перемешать равные элементы
    // Collections.sort() и list.sort() - стабильные, это написано в документации
    // Сортировка с использованием компаратора:
    // - нужно создать объект компаратора и передать его в:
    //   - Collections.sort(list, comparator) ИЛИ
    //   - list.sort(comparator)
//    Comparator<Pizza> comparator = new PizzaPriceComparator();
//    pizzas.sort(comparator);
    pizzas.sort(new PizzaPriceComparator());
    System.out.println("После сортировки:");
    for (Pizza p : pizzas) {
      System.out.println(p);
    }
  }
}
