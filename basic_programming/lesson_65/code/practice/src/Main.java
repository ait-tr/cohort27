import books.Book;
import java.util.stream.Stream;

public class Main {

  // - домашнее задание
  // - лямбда-выражения
  // - статик
  // - файлы
  // - тесты
  // - структура проекта
  public static void main(String[] args) {
    Stream.of(
        new Book("Другой Автор", "Другое Название", 25),
        new Book("Автор", "Название", 25),
        new Book("Автор", "Другое Название", 25),
        new Book("Другой Автор", "Название", 25)
    ).sorted((b1, b2) -> {
      int authors = b1.getAuthor().compareTo(b2.getAuthor());
      if (authors != 0) {
        return authors;
      }
      return b1.getTitle().compareTo(b2.getTitle());
    }).forEach(b -> System.out.println(b));
  }
}
