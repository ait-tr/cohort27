package books;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BookRunner {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    BooksFile booksFile = new BooksFile("res/books.csv", ";");
    List<Book> books = booksFile.readBooks();
    for (Book b : books) {
      System.out.println(b);
    }
    booksFile.writeBooks(books);
  }
}
