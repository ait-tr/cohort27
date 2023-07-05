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

    System.out.print("Введите номер имени, которое хотите заменить: ");
    int ordToRemove = scanner.nextInt(); // читаем номер от 1 до size
    scanner.nextLine(); // дочитываем до конца строки
    // нужен индекс от 0 до (size - 1)
    int iToRemove = ordToRemove - 1;
    System.out.println("Старое имя: " + names.get(iToRemove));
    // удалим старое имя
    names.remove(iToRemove); // номер превращаем в индекс
    // прочитаем новое имя
    System.out.print("Введите новое имя: ");
    String name = scanner.nextLine();
    // добавим новое имя на то же место
    // в методе add указывается НОВЫЙ, желаемый индекс вставляемого элемента
    names.add(iToRemove, name);
    // добавление в конец: какой индекс?
    // предположим, что в списке 3 элемента (индексы от 0 до 2, size == 3)
    //                            0 1 2 3 4
    //                            A B C
    // * size - 1: (3 - 1) = 2,   A B N C
    // * size:     3,             A B C N
    // * size + 1: 4,             A B C - ошибка!!!
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
