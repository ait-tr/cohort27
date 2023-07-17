package homework_47;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

  // На вход программе подаётся одна строка текста.

  // Необходимо посчитать частоту появления разных символов в строке и вывести
  // результат.

  // ## Пример ввода
  // Lorem ipsum dolor sit amet.

  // ## Пример вывода (порядок может быть другим)
  // l: 2
  // o: 3
  // r: 2
  // e: 2
  // m: 3
  //  : 4
  // i: 2
  // p: 1
  // s: 2
  // u: 1
  // d: 1
  // t: 2
  // a: 1
  // .: 1
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    Map<Character, Integer> counters = new HashMap<>();
    // перебираем индексы, получаем символ по индексу
//    String textLower = text.toLowerCase();
//    for (int i = 0; i < textLower.length(); ++i) {
//      char c = textLower.charAt(i);
//      // ...
//    }
    // перебираем индексы, получаем символ по индексу (с Character.toLowerCase())
//    for (int i = 0; i < text.length(); ++i) {
//      char c = Character.valueOf(text.charAt(i)).toLowerCase();
//      // ...
//    }
    // превращаем строку в массив char и перебираем массив через for-each
    for (char c : text.toLowerCase().toCharArray()) {
      int oldValue = counters.getOrDefault(c, 0);
      counters.put(c, oldValue + 1); // обновляем значение счётчика
    }
    // получить значение из словаря:
    // метод                          ключ есть   ключа нет
    // get(ключ)                      значение    null
    // getOrDefault(ключ, умолчание)  значение    умолчание

    for (Map.Entry<Character, Integer> entry : counters.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
