import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentsDatabase {

  // напишем программу, которая:
  // - умеет загружать список студентов из файла
  // - добавлять студентов
  // - сохранять список в файл
  // - сортировать студентов по:
  //   - алфавиту
  //   - среднему баллу (по убыванию)
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    printMenu();
    String command = reader.readLine();
    while (!command.equalsIgnoreCase("выход")) {
      switch (command.toLowerCase()) {
        case "добавить":
          System.out.println("Добавляем студента");
          break;
        case "сохранить":
          System.out.println("Сохраняем список");
          break;
        case "вывести":
          System.out.println("Выводим список на экран");
          break;
        default:
          System.out.println("Неизвестная команда: " + command);
          break;
      }
      printMenu();
      command = reader.readLine();
    }
    System.out.println("Выходим из программы");
  }

  private static void printMenu() {
    System.out.println("- `Добавить` студента");
    System.out.println("- `Сохранить` список студентов в файл");
    System.out.println("- `Вывести` список студентов на экран");
    System.out.println("- `Выход` из программы");
  }
}
