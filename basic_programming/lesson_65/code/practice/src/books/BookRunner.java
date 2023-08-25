package books;

import java.util.Scanner;

public class BookRunner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Book book = Book.interactiveRead(scanner);
    System.out.println(book);
  }
}
