package homework_53;

public class Book {

  // Создайте класс `Book` (книга), в конструктор которого передавайте автора,
  // название книги и количество страниц.
  //
  // Реализуйте интерфейс для сравнения книг:
  // они должны сортироваться по авторам,
  // а если авторы совпадают - по названиям
  // (и там, и там - по алфавиту, "в словарном порядке"),
  // а если и авторы совпадают - по количеству страниц (по возрастанию).
  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  // не обязательно для решения, но обязательно для проверки
  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", pages=" + pages +
        '}';
  }
}
