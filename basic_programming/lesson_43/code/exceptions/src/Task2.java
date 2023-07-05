import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

  // методы списка:
  // - get(index) - получить элемент по индексу                        (array[i])
  // - set(index, elem) - задать новое значение по указанному индексу  (array[i] = elem)
  // - remove(index) - удалить элемент с указанным индексом (остальные сдвинутся)
  // - add(elem) - добавить элемент в конец списка
  // - add(index, elem) - добавить элемент так, чтобы его индекс стал index (остальные сдвинутся)

  // индексы:  0 1 2 3  <- так ориентируется Java
  // номера:   1 2 3 4  <- существуют только в нашей голове (или голове пользователя)
  // элементы: 3 9 5 7
  // номер = индекс + 1
  // индекс = номер - 1

  // - прочитать с клавиатуры количество имён
  // - прочитать сами имена (каждое с новой строки)
  // - вывести имена пронумерованными (начиная с 1)
  // - спросить номер имени для замены
  // - заменить имя с указанным номером на прочитанное
  // - вывести получившийся список (пронумерованным)
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество имён: ");
    int amount = scanner.nextInt();
    scanner.nextLine();
    List<String> names = new ArrayList<>();
    System.out.println("Введите " + amount + " имён, каждое с новой строки:");
    for (int i = 0; i < amount; ++i) {
      names.add(scanner.nextLine());
    }
    printNumberedList(names);

    System.out.print("Введите номер имени, которое хотите заменить: ");
    int ordToReplace = scanner.nextInt(); // читаем номер от 1 до size
    scanner.nextLine();
    int iToReplace = ordToReplace - 1; // нужен индекс от 0 до (size - 1)
    System.out.println("Старое имя: " + names.get(iToReplace));
    System.out.print("Введите новое имя: ");
    String name = scanner.nextLine();
    names.set(iToReplace, name); // List.set(index, element) - задание нового значения
    // ссылка на старый элемент при этом просто исчезает (затирается)
    System.out.println("Имена после замены:");
    printNumberedList(names);
  }

  private static void printNumberedList(List<String> words) {
    for (int i = 0; i < words.size(); ++i) {
      int k = i + 1; // k - порядковый номер, (индекс + 1)
      System.out.println(k + ". " + words.get(i));
    }
  }
}
