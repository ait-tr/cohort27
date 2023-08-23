package club;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClubRunner {

  private static final Set<String> POSITIVE_ANSWERS = new HashSet<>();
  static {
    POSITIVE_ANSWERS.add("yes");
    POSITIVE_ANSWERS.add("y");
    POSITIVE_ANSWERS.add("да");
    POSITIVE_ANSWERS.add("д");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Club club = new Club("Название");
    club.greet(); // начало работы, "добро пожаловать"

    String choice = choose(scanner); // выбор команды (есть посетители или нет)
    while (!choice.equals(EXIT)) {
      if (!club.hasFreeSpace()) { // если нет мест, то заканчиваем цикл
        club.sorry();
        break;
      }
      // новый посетитель пытается попасть в клуб
      club.tryToEnter(Visitor.interactiveRead(scanner));
    }

    // распечатать отсортированный список всех посетителей
    club.printVisitorsByAge();
    club.close();
  }

  /**
   * Выбор команды
   *
   * @param scanner источник ввода команды
   * @return введённая пользователем команда
   */
  private static boolean hasNextVisitors(Scanner scanner) {
    System.out.println("Есть ли в очереди посетители? [y/N]");
    String input = scanner.nextLine();
    return POSITIVE_ANSWERS.contains(input.toLowerCase());
  }
}
