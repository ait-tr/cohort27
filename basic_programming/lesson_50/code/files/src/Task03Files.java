import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task03Files {

  // Прочитать из файла res/input.txt имена и накопленные баллы.
  // Вывести студента с наибольшим количеством баллов
  // в файл res/output.txt.
  public static void main(String[] args) /*throws FileNotFoundException*/ {
    // Класс File используется для хранения информации
    // о файле. Информация может быть некорректной.
//    File input = new File("res/input.txt");
    Scanner scanner;
    try {
//      scanner = new Scanner(input);
      scanner = new Scanner(new File("res/input.txt"));
    } catch (FileNotFoundException e) {
      System.err.println("Файл не найден: " + e.getMessage());
      return;
    }

    if (!scanner.hasNext()) {
      System.err.println("Файл пустой");
      return;
    }
    String resultName = scanner.next();
    int resultScore = scanner.nextInt();
    while (scanner.hasNext()) {
      String name = scanner.next();
      int score = scanner.nextInt();
      if (score > resultScore) { // если прочитанные баллы больше, чем всё, что было раньше
        resultScore = score; // это новое значение "самые большие баллы"
        resultName = name; // а это новый "лучший ученик"
      }
    }

    System.out.println(resultName + " (score: " + resultScore + ")");
  }
}
