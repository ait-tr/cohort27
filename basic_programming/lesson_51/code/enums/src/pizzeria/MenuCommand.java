package pizzeria;

import java.util.Scanner;

public enum MenuCommand {
  UNEXPECTED(""), // служебное значение, которое не должен видеть пользователь
  START("Начать заказ"),
  EXIT("Выйти");

  private final String message;

  MenuCommand(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public static MenuCommand readCommand(Scanner scanner) {
    if (!scanner.hasNext()) {
      throw new RuntimeException("Ожидается ввод команды");
    }
    String input = scanner.next();
    switch (input.toLowerCase()) {
      case "1":
      case "start":
      case "начать":
        return START;
      case "2":
      case "exit":
      case "выход":
        return EXIT;
      default:
        return UNEXPECTED;
    }
  }
}
