import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {

  // Анонимные классы - классы для однократного создания объекта
  //   (часто при передаче в виде аргумента)
  // Лямбда-выражения (Lambda Expressions) - анонимные методы для создания
  //   анонимных классов, реализующих функциональные интерфейсы
  // На примере:
  // - функциональный интерфейс Comparator<Book>
  // - реализация единственного абстрактного метода compare(Book o1, Book o2)
  // - для реализации метода compare и таким образом описания компаратора
  //   можно использовать лямбда-выражение

  // Лямбда-выражение состоит из:
  // `аргумент`, `(аргумент1, аргумент2)` или `()`, если аргументов нет
  // оператор стрелочка (arrow): `->`
  // `значение` или `{ операция1; операция2; }`
  // `{ операция1; операция2; }` чаще выглядят так:
  // () -> {
  //   операция1;
  //   операция2;
  // }

  // Из
//  new Comparator<Order>() {
//    @Override
//    public int compare(Order o1, Order o2) {
//      return o1.getStartTime().compareTo(o2.getStartTime());
//    }
//  }
  // берём самое главное:
  // - аргументы: `(Order o1, Order o2)`
  // - значение: `o1.getStartTime().compareTo(o2.getStartTime())`
  // Так как мы писали @Override, Java уже знает, какой должна быть сигнатура метода
  //   и какого типа должны быть аргументы метода.
  // Поэтому аргументы можно записать в формате `(o1, o2)`
  // И итоговая запись выглядит так:
  // `(o1, o2) -> o1.getStartTime().compareTo(o2.getStartTime())`

  // Стримы (Потоки) - класс Stream
  // Стримы состоят из:
  // - источника данных
  //   из данных получается поток
  // - промежуточных операторов (intermediate operations)
  //   из потока с одними данными получается поток с другими данными
  // - терминального оператора (terminal operation)
  //   из потока данных получается какой-то результат
  public static void main(String[] args) {
    // Найти минимальное чётное из списка чисел
    int[] numbers = new int[]{23, 45, 8, 24, -5, 12};
    int result = Arrays.stream(numbers)
                       .filter(x -> x % 2 == 0)
                       .min()
                       .orElse(-1);
    System.out.println(result);
  }
}
