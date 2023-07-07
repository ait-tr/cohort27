import java.util.Scanner;

public class Main {

  // final означает, что переменную нельзя изменить
  // (она больше не переменная, а постоянная - константа)
  // нельзя изменить - нельзя нигде больше написать `ADD = новое значение`
  private static final int ADD = 1;
  private static final int CLOSE = 2;
  private static final int EXIT = 0;

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
      System.out.println("Вы ввели команду " + command);
    } while (command != EXIT);
    System.out.println("До свидания!");
  }

  private static int readCommand(Scanner scanner) {
    System.out.println("Команды:");
    System.out.println(ADD + ". Добавить позицию");
    System.out.println(CLOSE + ". Закрыть чек"); // автоматически начнётся новый
    System.out.println(EXIT + ". Выход");
    System.out.println("Выберите команду:");
    int command = scanner.nextInt();
    scanner.nextLine();
    return command;
  }
}
