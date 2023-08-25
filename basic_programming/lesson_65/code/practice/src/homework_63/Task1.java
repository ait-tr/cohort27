package homework_63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {

  // Создайте список книг и отсортируйте книги по автору,
  // (при одинаковых авторах - по названиям)
  // при помощи анонимного класса в качестве компаратора.
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Другой Автор", "Другое Название", 25));
    books.add(new Book("Автор", "Название", 25));
    books.add(new Book("Автор", "Другое Название", 25));
    books.add(new Book("Другой Автор", "Название", 25));

    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorComparison != 0) {
          return authorComparison;
        }
        return o1.getTitle().compareTo(o2.getTitle());
      }
    });

    for (Book b : books) {
      System.out.println(b);
    }
  }
}
