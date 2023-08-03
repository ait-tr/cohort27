package homework_54;

import homework_53.Book;
import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

  // Используйте класс `Book` (книга) из предыдущего домашнего задания.
  //
  // Создайте компаратор, который позволит сортировать книги по названию,
  // при одинаковых названиях - по автору.
  @Override
  public int compare(Book o1, Book o2) {
    String title1 = o1.getTitle();
    String title2 = o2.getTitle();
    int titleComparison = title1.compareTo(title2);
//    int titleComparison = o1.getTitle().compareTo(o2.getTitle());
    if (titleComparison != 0) {
      return titleComparison;
    }
    // сюда мы попадём, только если названия совпали и `titleComparison == 0`
    return o1.getAuthor().compareTo(o2.getAuthor());
  }
}
