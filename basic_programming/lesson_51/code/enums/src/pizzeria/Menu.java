package pizzeria;

public enum Menu {
  START("Начать заказ"),
  EXIT("Выйти");

  private final String message;

  Menu(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
