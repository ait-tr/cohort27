import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    // printf(формат, аргументы для подстановки)
    // аргументы для подстановки в строке формата начинаются с %
    // %d - decimal  - целые числа   (int, long...)
    // %f - float    - дробные числа (double, float...)
    // %s - string   - строки        (String)
    // %n - new line - символ конца строки
    String name = "Kirill";
    Map<String, String> greeting = new HashMap<>();
    greeting.put("en", "Hello %s!%n");
    greeting.put("ru", "Привет, %s!%n");
    System.out.printf(greeting.get("en"), name);

    int age = 30;
    System.out.printf("I'm %d years old!%n", age);

    double pi = 3.1415;
    // %.(знаковПослеТочки)f
    System.out.printf("pi = %.2f%n", pi);

    // %(знаков)d/s/f - дополнит слева пробелами до нужного количества,
    // если символов и так больше, выведет "как есть" (символы не пропадут)
    // "%10s" - формат "строка, которая должна занять не меньше 10 символов"
    // "%10d" - формат "число, которое должно занять не меньше 10 символов"
    System.out.printf("Names:      %10s %10s%n", "Alice", "Bob");
    System.out.printf("Last names: %10s %10s%n", "Dow", "Dow");

    // Издевательство над здравым смыслом:
    // "%%" в формате означает "%" в выводе
    // планируемый вывод: "%% Good bye! %%"
    System.out.printf("%%%% %s %%%%%n", "Good buy!");
  }
}
