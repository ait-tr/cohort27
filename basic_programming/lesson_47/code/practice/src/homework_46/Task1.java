package homework_46;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

  // Вам дан словарь, состоящий из пар слов.
  // Каждое слово является синонимом к парному ему слову.
  // Все слова в словаре различны.
  //
  // Для слова из словаря, записанного в последней строке,
  // определите его синоним.
  //
  // ## Пример ввода
  // 3
  // Hello
  // Hi
  // Bye
  // Goodbye
  // List
  // Array
  // Goodbye
  //
  // ## Пример вывода
  // Bye
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> dictionary = new HashMap<>();
    int size = scanner.nextInt();
    for (int i = 0; i < size; ++i) {
      String word1 = scanner.next();
      String word2 = scanner.next();
      dictionary.put(word1, word2); // word2 - синоним для word1
      dictionary.put(word2, word1); // word1 - синоним для word2
    }
    String request = scanner.next();
    System.out.println(dictionary.get(request));
    System.out.println(dictionary);
  }
}
