package homework_52;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

  // Во всех задачах разбивайте решение на несколько коммитов:
  // - условие в комментарии и никакого кода
  // - решение без учёта файлов - чтение с клавиатуры и вывод на экран
  // - добавляем файлы, если они указаны в задаче
  // - разбиваем задачу на методы
  // - добавляем `try`..`catch`
  //
  // Напишите программу создания небольшого словаря сленговых программерских выражений, чтобы она
  // потом по запросу возвращала значения из этого словаря.
  //
  // ## Формат входных данных
  //
  // ## Формат выходных данных
  // Для каждого слова, независимо от регистра символов, если оно присутствует в словаре,
  // необходимо вывести **на экран** его определение.
  //
  // Если слова в словаре нет, программа должна вывести "Не найдено", без кавычек.
  //
  //
  // ## Примечание 2
  // Гарантируется, что в определяемом слове или фразе отсутствует двоеточие (`:`), следом за
  // которым идёт пробел.
  //
  // ## Пример входных данных
  // 5
  // Змея: язык программирования Python
  // Баг: от англ. bug — жучок, клоп, ошибка в программе
  // Конфа: конференция
  // Костыль: код, который нужен, чтобы исправить несовершенство ранее написанного кода
  // Бета: бета-версия, приложение на стадии публичного тестирования
  // 3
  // Змея
  // Жаба
  // костыль
  //
  // ## Пример выходных данных
  // язык программирования Python
  // Не найдено
  // код, который нужен, чтобы исправить несовершенство ранее написанного кода
  public static void main(String[] args) throws FileNotFoundException {
    // ### Файл `dict.txt`
    Scanner dictScanner = new Scanner(new File("res/dict.txt"));
    Map<String, String> dictionary = readDictionary(dictScanner);
    dictScanner.close();

    // ### Ввод с клавиатуры
    Scanner scanner = new Scanner(System.in);
    List<String> words = readWords(scanner);

    List<String> definitions = findDefinitions(dictionary, words);
    for (String definition : definitions) {
      System.out.println(definition);
    }
  }

  static HashMap<String, String> readDictionary(Scanner scanner) {
    // В первой строке задано одно целое число `n` — количество слов в словаре.
    int n = scanner.nextInt();
    scanner.nextLine();
    // В следующих `n` строках записаны слова и их определения, разделенные двоеточием и символом
    // пробела.
    String separator = ": ";
    HashMap<String, String> dictionary = new HashMap<>();
    for (int i = 0; i < n; ++i) {
      String wordAndDefinition = scanner.nextLine();
      //                       012345678
      // wordAndDefinition = "Змея: язык программирования Python"
      int separatorIndex = wordAndDefinition.indexOf(separator);
      // separatorIndex = 4 // индекс начала ": "
      String word = wordAndDefinition.substring(0, separatorIndex);
      // word = "Змея" // от beginIndex включая до endIndex не включая
      String definition = wordAndDefinition.substring(separatorIndex + separator.length());
      // definition = "язык программирования Python" // c (separatorIndex + 2 = 6) до конца строки
      dictionary.put(word.toLowerCase(), definition);
    }
    return dictionary;
  }

  static ArrayList<String> readWords(Scanner scanner) {
    // В первой строке записано целое число `m` — количество поисковых слов, чье определение нужно
    // вывести.
    int m = scanner.nextInt();
    scanner.nextLine();
    // В следующих `m` строках записаны сами слова, по одному на строке.
    ArrayList<String> words = new ArrayList<>(m); // задали вместимость списка (не размер, он 0)
    for (int i = 0; i < m; ++i) {
      String word = scanner.nextLine();
      words.add(word);
    }
    return words;
  }

  static ArrayList<String> findDefinitions(Map<String, String> dictionary, List<String> words) {
    ArrayList<String> definitions = new ArrayList<>();
    for (String word : words) {
      // Для каждого слова, независимо от регистра символов, если оно присутствует в словаре,
      // необходимо вывести **на экран** его определение.
      // Если слова в словаре нет, программа должна вывести "Не найдено", без кавычек.
      String definition = dictionary.getOrDefault(word.toLowerCase(), "Не найдено");
      definitions.add(definition);
    }
    return definitions;
  }
}
