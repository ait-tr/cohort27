import books.Book;
import java.util.Comparator;
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
    ).sorted(Comparator
        .comparing(Book::getAuthor)
        .thenComparing(Book::getTitle)
    ).forEach(System.out::println);
    // Чтобы реализовать интерфейс Consumer, нам нужен метод `void accept(Book o)`
    // Мы хотим, чтобы этот метод вызвал `void println(Book o)` у объекта `System.out`
    // println и будет нашей реализацией accept
    // method reference - ссылка на метод:
    // - `объект::метод`
    // - `Класс::метод` (для статических методов)
    // - `Класс::метод` (для методов аргумента)
    // моим лямбда-выражением стал метод println()

    // Компаратор для книг по авторам и названиям:
    Comparator<Book> bookAuthorTitleComparator = (o1, o2) -> {
      int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
      if (authorComparison != 0) {
        return authorComparison;
      }
      return o1.getTitle().compareTo(o2.getTitle());
    };
    // Из предыдущего компаратора делаем усовершенствованный -- для авторов, названий и страниц
    Comparator<Book> bookAuthorTitlePagesComparator =
        bookAuthorTitleComparator.thenComparing(Book::getPages);
  }
}
