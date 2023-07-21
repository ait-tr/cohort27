public class Task01CLIExample {

  // GUI - graphical user interface - графический интерфейс пользователя
  // CLI - command line interface - интерфейс командной строки
  public static void main(String[] args) {
    System.out.println("При вызове было указано " + args.length + " аргументов");
    boolean secret = false;
    for (String arg : args) {
      System.out.println("Аргумент: " + arg);
      if (arg.equalsIgnoreCase("секрет")) {
        secret = true;
      }
    }

    if (secret) {
      System.out.println("Вы нашли секретный аргумент");
    }
  }
}
