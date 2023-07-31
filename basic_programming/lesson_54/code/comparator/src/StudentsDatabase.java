import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentsDatabase {

  // напишем программу, которая:
  // - умеет загружать список студентов из файла
  // - добавлять студентов
  // - сохранять список в файл
  // - сортировать студентов по:
  //   - алфавиту
  //   - накопленному баллу (по убыванию)
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Student> students = new ArrayList<>();
    String command = readMenuCommand(reader);
    while (!command.equalsIgnoreCase("выход")) {
      switch (command.toLowerCase()) {
        case "добавить":
          addStudentInteractive(students);
          break;
        case "сохранить":
          saveStudentList(students);
          break;
        case "вывести":
          printStudentList(students);
          break;
        default:
          System.out.println("Неизвестная команда: " + command);
          break;
      }
      command = readMenuCommand(reader);
    }
    System.out.println("Выходим из программы");
  }

  private static void printMenu() {
    System.out.println("- `Добавить` студента");
    System.out.println("- `Сохранить` список студентов в файл");
    System.out.println("- `Вывести` список студентов на экран");
    System.out.println("- `Выход` из программы");
  }

  private static String readMenuCommand(BufferedReader reader) throws IOException {
    printMenu();
    return reader.readLine();
  }

  private static void addStudentInteractive(List<Student> students) {
    Student student = Student.readInteractive();
    students.add(student);
    System.out.println("Добавляем студента " + student);
  }

  private static void saveStudentList(List<Student> students) {
    System.out.println("Сохраняем список " + students);
  }

  private static void printStudentList(List<Student> students) {
    for (Student s : students) {
      System.out.println(s);
    }
  }
}
