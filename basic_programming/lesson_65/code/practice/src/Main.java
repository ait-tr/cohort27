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
    }).forEach(System.out::println);
    // Чтобы реализовать интерфейс Consumer, нам нужен метод `void accept(Book o)`
    // Мы хотим, чтобы этот метод вызвал `void println(Book o)` у объекта `System.out`
    // println и будет нашей реализацией accept
    // method reference - ссылка на метод:
    // - `объект::метод`
    // - `Класс::метод` (для статических методов)
    // - `Класс::метод` (для методов аргумента)
    // моим лямбда-выражением стал метод println()
  }
}
