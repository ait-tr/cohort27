package books;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class BookTests {

  @Test
  public void interactiveReadIntegerPositive() {
    Scanner scanner = new Scanner("""
        5
        """);

    int number = Book.interactiveReadInteger(scanner);

    assertEquals(5, number);
  }

  @Test
  public void interactiveReadIntegerNegative() {
    Scanner scanner = new Scanner("""
        -5
        """);

    int number = Book.interactiveReadInteger(scanner);

    assertEquals(-5, number);
  }

  @Test
  public void interactiveReadIntegerErrorPositive() {
    Scanner scanner = new Scanner("""
        a
        5
        """);

    int number = Book.interactiveReadInteger(scanner);

    assertEquals(5, number);
  }

  @Test
  public void interactiveReadIntegerErrorNegative() {
    Scanner scanner = new Scanner("""
        a
        -5
        """);

    int number = Book.interactiveReadInteger(scanner);

    assertEquals(-5, number);
  }

  @Test
  public void interactiveReadPagesPositive() {
    Scanner scanner = new Scanner("""
        5
        """);

    int number = Book.interactiveReadPages(scanner);

    assertEquals(5, number);
  }

  @Test
  public void interactiveReadPagesNegative() {
    Scanner scanner = new Scanner("""
        -5
        5
        """);

    int number = Book.interactiveReadPages(scanner);

    assertEquals(5, number);
  }

  @Test
  public void interactiveReadPagesError() {
    Scanner scanner = new Scanner("""
        a
        -5
        5
        """);

    int number = Book.interactiveReadPages(scanner);

    assertEquals(5, number);
  }
}
