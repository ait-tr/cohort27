public class Task02CLIArgumentExample {

  public static void main(String[] args) {
    // --port=1080
    System.out.println("При вызове было указано " + args.length + " аргументов");
    int port = getPort(args);
    System.out.println("Порт: " + port);
  }

  /**
   * Метод читает значение ключа <code>--port</code> из аргументов командной строки
   *
   * @param args массив аргументов командной строки
   * @return прочитанный порт или число -1, если значения нет или оно некорректное
   */
  private static int getPort(String[] args) {
    String prefix = "--port=";
    if (args.length == 0) {
      return -1; // аргументов нет, в том числе аргумента port
    }
    for (String arg : args) {
      //        0123456789...
      // arg = "--port=1080" // arg = "--port=key"
      if (arg.startsWith(prefix)) {
        // prefix.length() = 7
        String portValue = arg.substring(prefix.length());
        // portValue = "1080" // portValue = "key"
        try {
          // return 1080; // NumberFormatException
          return Integer.parseInt(portValue);
        } catch (NumberFormatException e) {
          // значение некорректное - не целое число
          return -1;
        }
      }
    }
    return -1; // не было аргумента --port=...
  }
}
