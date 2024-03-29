package homework_44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  // final означает, что переменную нельзя изменить
  // (она больше не переменная, а постоянная - константа)
  // нельзя изменить - нельзя нигде больше написать `ADD = новое значение`
  private static final int ADD = 1;
  private static final int CLOSE = 2;
  private static final int EXIT = 0;
  private static final int INCORRECT = -1;

  // MVP - Minimal Valuable Product
  // Кассовый аппарат:
  // - получает информацию о позициях
  // - закрывает чек и печатает его (на экран)
  // Чек:
  // - номер
  // - порядковый номер, наименование позиции, стоимость
  // - сумма
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== Кассовый аппарат v. 0.0.1 ===");
    Register register = new Register();
    int command;
    do {
      command = readCommand(scanner);
      switch (command) {
        case ADD:
          register.addInteractive(scanner);
          break;
        case CLOSE:
          register.closeBill();
          break;
        case EXIT:
          break;
        default:
          // Мы не должны здесь оказаться, `readCommand()` уже всё проверил
          System.out.println("Некорректная команда: " + command);
          break;
      }
    } while (command != EXIT);
    System.out.println("До свидания!");
  }

  private static int readCommand(Scanner scanner) {
    int command = INCORRECT;
    while (!isCommand(command)) {
      printMenu();
      System.out.print("Выберите команду: ");
      try {
        command = scanner.nextInt(); // здесь может быть InputMismatchException
        if (!isCommand(command)) {
          System.out.println("Некорректный номер команды: " + command);
        }
      } catch (InputMismatchException e) {
        System.out.println("Некорректный ввод, введите номер команды!");
      } finally {
        // пропустить некорректную строчку
        // или дочитать до конца корректную
        scanner.nextLine();
      }
    }
    return command;
  }

  private static boolean isCommand(int command) {
    // здесь мог бы быть любой другой способ проверки
    switch (command) {
      case ADD:
      case CLOSE:
      case EXIT:
        return true;
      default:
        return false;
    }
  }

  private static void printMenu() {
    System.out.println("Команды:");
    System.out.println(ADD + ". Добавить позицию");
    System.out.println(CLOSE + ". Закрыть чек"); // автоматически начнётся новый
    System.out.println(EXIT + ". Выход");
  }
}
