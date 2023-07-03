import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

  // - прочитать с клавиатуры количество имён
  // - прочитать сами имена (каждое с новой строки)
  // - вывести имена пронумерованными (начиная с 1)
  // - спросить номер имени для замены
  // - заменить имя с указанным номером на прочитанное
  // - вывести получившийся список (пронумерованным)
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество имён: ");
    int amount = scanner.nextInt(); // если после этого в строке точно ничего не будет,
    // и мы хотим дочитать до конца строки, чтобы сканер был в "рабочем" состоянии:
    scanner.nextLine();
    List<String> names = new ArrayList<>();
    System.out.println("Введите " + amount + " имён, каждое с новой строки:");
    for (int i = 0; i < amount; ++i) {
      names.add(scanner.nextLine());
    }
    printNumberedList(names);
  }

  private static void printNumberedList(List<String> words) {
    for (int i = 0; i < words.size(); ++i) {
      int k = i + 1; // k - порядковый номер, (индекс + 1)
      System.out.println(k + ". " + words.get(i));
    }
  }
}
