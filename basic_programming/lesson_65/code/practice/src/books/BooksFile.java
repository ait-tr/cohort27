package books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFile {

  private final File file;
  private final String separator;

  public BooksFile(String fileName, String delimiter) throws IOException {
    file = new File(fileName);
    if (!file.exists()) {
      if (!file.getParentFile().mkdirs() || !file.createNewFile()) {
        throw new RuntimeException("Не получилось создать файл: " + fileName);
      }
    }
    if (!(file.canRead() && file.canWrite())) {
      throw new IllegalArgumentException("Файл не доступен: " + fileName);
    }
    this.separator = delimiter;
  }

  public ArrayList<Book> readBooks() throws FileNotFoundException {
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      books.add(Book.parseFromCSVLine(scanner.nextLine(), separator));
    }
    scanner.close();
    return books;
  }

  public void writeBooks(List<Book> books) throws IOException {
    try (FileWriter writer = new FileWriter(file)) {
      for (Book b : books) {
        writer.write(b.getCSVLine(separator));
      }
    }
  }
}
