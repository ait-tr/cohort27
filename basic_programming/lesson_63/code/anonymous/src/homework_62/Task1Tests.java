package homework_62;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Task1Tests {

  @Test
  public void testReverseCommon() {
    // arrange
    int source = 1234;

    // act
    String result = Task1.reverse(source);

    // assert
    assertEquals("4321", result);
  }

  @Test
  public void testReverseDigit() {
    // arrange
    int source = 3;

    // act
    String result = Task1.reverse(source);

    // assert
    assertEquals("3", result);
  }

  @Test
  public void testReverseZero() {
    // arrange
    int source = 0;

    // act
    String result = Task1.reverse(source);

    // assert
    assertEquals("0", result);
  }

  @Test
  public void testReverseDigitNegative() {
    // arrange
    int source = -3;

    // act
    String result = Task1.reverse(source);

    // assert
    assertEquals("3-", result);
  }

  @Test
  public void testReverseCommonNegative() {
    // arrange
    int source = -1234;

    // act
    String result = Task1.reverse(source);

    // assert
    assertEquals("4321-", result);
  }
}
