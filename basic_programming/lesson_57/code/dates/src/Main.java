import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

  public static void main(String[] args) {
    // как тестировать компаратор:
    // компаратор сравнивает два объекта, именно результат сравнения и нужно проверять
    // - два одинаковых объекта
    // - два разных объекта (сначала все пункты сравнения проверяем "по отдельности")
    //   например, две книги с разными названиями, но одинаковые во всём остальном
    // - сравнения с приоритетом (отличаются и авторы, и названия, но "в разные стороны")
    // - один и тот же объект сам с собой
    // - что-то и null (throws NullPointerException)

    // новая тема: работа с датами в Java
    // первый вариант: java.util.Date (устарел с выходом Java 8)
    // второй вариант: java.util.Calendar (заменил часть методов Data и используется в связке с ним)
    // третий вариант: пакет java.time (появился в Java 8)

    // java.time:
    // - LocalDate - хранит только дату без учёта момента времени (5-е августа 2023 г.)
    // - LocalTime - хранит только время без учёта даты (15:37:24) и тайм-зоны
    // - LocalDateTime - хранит и дату, и время
    // - ZonedDateTime - хранит и дату, и время, и тайм-зону
    // У всех этих классов есть статический метод .now(), возвращающий текущий момент времени,
    //  и статические методы .of(), работающие как конструкторы
    System.out.println("Сейчас: " + LocalTime.now().withNano(0));
    System.out.println("12:34 : " + LocalTime.of(12, 34));

    System.out.println("Сегодня : " + LocalDate.now());
    System.out.println("1.2.2003: " + LocalDate.of(2003, Month.FEBRUARY, 1));

    System.out.println("Сегодня и сейчас: " + LocalDateTime.now());
  }
}
