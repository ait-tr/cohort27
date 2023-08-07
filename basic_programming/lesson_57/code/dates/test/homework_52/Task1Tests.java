package homework_52;

import static homework_52.Task1.readDictionary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class Task1Tests {

  @Test
  public void readEmptyFile() {
    // arrange
    String input = "";
    Scanner scanner = new Scanner(input); // делает ввод из указанной строки

    // act & assert
    assertThrowsExactly(NoSuchElementException.class, () -> readDictionary(scanner));
  }

  @Test
  public void readEmptyDictionary() {
    // arrange - задать начальные значения
    String input = "0\n";
    Scanner scanner = new Scanner(input); // делает ввод из указанной строки

    // act - совершить действие
    Map<String, String> dictionary = readDictionary(scanner);

    // assert - предположить, что результат правильный
    assertTrue(dictionary.isEmpty());
  }

  // TODO тест на отрицательное число определений

  @Test
  public void readCommonDictionary() {
    // arrange - задать начальные значения
    String word1 = "word1";
    String definition1 = "definition1";
    String word2 = "word2";
    String definition2 = "definition2";
    String separator = ": ";

    // это как бы наш файл:
    // 2
    // word1: definition1
    // word2: definition2
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(2).append('\n')
        .append(word1).append(separator).append(definition1).append('\n')
        .append(word2).append(separator).append(definition2).append('\n');
    Scanner scanner = new Scanner(stringBuilder.toString());

    // act - совершить действие
    Map<String, String> dictionary = readDictionary(scanner);

    // assert - предположить, что результат правильный
    assertFalse(dictionary.isEmpty());
    assertEquals(2, dictionary.size());
    assertTrue(dictionary.containsKey(word1));
    assertEquals(definition1, dictionary.get(word1));
    assertTrue(dictionary.containsKey(word2));
    assertEquals(definition2, dictionary.get(word2));
  }

  // TODO количество меньше строк

  @Test
  public void readFileAfterEnd() {
    // arrange
    String input = "1\n"; // должна быть одна запись, но записи нет
    Scanner scanner = new Scanner(input); // делает ввод из указанной строки
    boolean caught = false; // поймали правильное исключение

    // act
    try {
      readDictionary(scanner);
    } catch (NoSuchElementException e) {
      // можно добавить проверку на сообщение
      caught = true;
    }

    // assert
    assertTrue(caught);
  }

  // TODO одинаковые слова с разными определениями
}
