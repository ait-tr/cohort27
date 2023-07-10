package homework_43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  // Напишите программу, которая получает на вход:
  // - размер списка имён
  // - список имён
  // - номер имени, которое надо вывести
  //
  // И выводит соответствующее имя или сообщение об ошибке при некорректном вводе.
  //
  // Сообщение об ошибке надо вывести через `try`-`catch`, самостоятельно проверять ввод на
  // корректность номера **не нужно**.
  //
  // ## Пример ввода
  // 3
  // Антон
  // Борис
  // Василий
  // 2
  //
  // ## Пример вывода
  // Борис
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    scanner.nextLine(); // прочитает нажатый Enter, после этого будет осмысленный nextLine()
    List<String> names = new ArrayList<>(amount); // amount задаёт не размер (size),
    // а начальную вместимость (initial capacity)
    for (int i = 0; i < amount; i++) {
      names.add(scanner.nextLine());
    }
//    int iToPrint = scanner.nextInt() - 1;
    int nToPrint = scanner.nextInt();
    int iToPrint = nToPrint - 1;
    try {
      // names.get() может выбросить IndexOutOfBoundsException
//    System.out.println(names.get(nToPrint - 1));
      System.out.println(names.get(iToPrint));
    } catch (IndexOutOfBoundsException e) {
//      System.out.println("Некорректный номер имени: " + e.getMessage());
      System.out.println("Некорректный номер имени: " + nToPrint);
    }
  }
}
