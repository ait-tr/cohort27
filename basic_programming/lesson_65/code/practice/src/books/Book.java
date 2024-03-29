package books;

import java.io.PrintStream;
import java.util.Scanner;

public class Book {

  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  // модификаторы доступа:
  // - private - только внутри класса
  // - (ничего, package-private) - только внутри пакета
  // - protected - внутри пакета и потомкам (extends)
  // - public - всем
  static int interactiveReadInteger(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод: " + scanner.nextLine());
      System.out.print("Введите целое число: ");
    }
    int number = scanner.nextInt();
    scanner.nextLine();
    return number;
  }

  static int interactiveReadPages(Scanner scanner) {
    System.out.print("Введите количество страниц: ");
    int pages = interactiveReadInteger(scanner);
    while (pages < 0) {
      System.out.println("Количество страниц не может быть отрицательным: " + pages);
      System.out.print("Введите количество страниц: ");
      pages = interactiveReadInteger(scanner);
    }
    return pages;
  }

  public static Book interactiveRead(Scanner scanner) {
    System.out.print("Введите имя автора: ");
    String author = scanner.nextLine();
    System.out.print("Введите название книги: ");
    String title = scanner.nextLine();
    while (title.isEmpty()) {
      System.out.print("Название книги не может быть пустым! Введите название: ");
      title = scanner.nextLine();
    }
    int pages = interactiveReadPages(scanner);
    return new Book(author, title, pages);
  }

  /**
   * Чтение полей класса Book из строки CSV-файла
   *
   * @param s         строка CSV-файла
   * @param delimiter разделитель CSV-файла
   * @return Book с заполненными полями
   */
  public static Book parseFromCSVLine(String s, String delimiter) {
    // разбить строку на кусочки, кусочки вернут в виде массива
    String[] cells = s.split(delimiter); // cell - англ. "ячейка" (в нашем случае ячейка таблицы)
    try {
      return new Book(cells[0], cells[1], Integer.parseInt(cells[2]));
    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
      throw new IllegalArgumentException("Некорректная строка: " + s);
    }
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", pages=" + pages +
        '}';
  }

  public String getCSVLine(String delimiter) {
//    return author + delimiter + title + delimiter + pages + "\n";
    return String.join(delimiter, author, title, Integer.toString(pages)) + "\n";
  }
}
