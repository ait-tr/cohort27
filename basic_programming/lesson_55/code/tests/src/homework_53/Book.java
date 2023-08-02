package homework_53;

import java.util.Objects;

public class Book implements Comparable<Book> {

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

  // Они должны сортироваться по авторам,
  // а если авторы совпадают - по названиям,
  // а если и авторы совпадают - по количеству страниц (по возрастанию).
  @Override
  public int compareTo(Book o) {
    if (author.compareTo(o.author) != 0) {
      return author.compareTo(o.author);
    }
    // сюда мы попадём, только если авторы совпали и `author.compareTo(o.author) == 0`
    if (title.compareTo(o.title) != 0) {
      return title.compareTo(o.title);
    }
    // сюда мы попадём, только если авторы и названия совпали и `title.compareTo(o.title) == 0`
    // осталось сравнить страницы: если равны, то и книги равны; если не равны, то и книги не равны
    return Integer.compare(pages, o.pages);
  }

  // переопределение compareTo заставляет переопределить equals
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book book)) {
      return false;
    }
    return pages == book.pages && author.equals(book.author) && title.equals(book.title);
  }

  // переопределение equals заставляет переопределить hashCode
  @Override
  public int hashCode() {
    return Objects.hash(author, title, pages);
  }
}
