import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

  // Вводят список студентов в формате:
  // Количество студентов
  // Для каждого студента:
  // - Имя
  // - Группа
  // В результате нужно вывести этот список в другом формате:
  // Группа
  // - студенты (по одному в строке)
  //
  // Для каждой группы - свой заголовок и свой список

  // Пример входных данных:
  // 3
  // Кирилл
  // cohort 1
  // Мефодий
  // cohort 2
  // Василий
  // cohort 1

  // Пример вывода:
  // cohort 1
  // - Кирилл
  // - Василий
  // cohort 2
  // - Мефодий
  public static void main(String[] args) {
    // Map:
    // ключ1 -> значение
    // ключ2 -> значение

    // ключ - название группы
    // значение - список имён
    Map<String, List<String>> result = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    // вариант с try-catch. Работает, но плохо читается:
//    int amount;
//    while (true) {
//      try {
//        System.out.print("Введите количество студентов: ");
//        amount = scanner.nextInt(); // если ввод некорректный, отправимся в catch
//        if (amount > 0) { // если число положительное
//          break; // только если ввод корректный и число положительное
//        } else {
//          System.out.println("Введите положительное число!");
//        }
//      } catch (InputMismatchException e) {
//        System.out.println("Ошибка: неправильный формат числа");
//      } finally {
//        scanner.nextLine(); // дочитываем строку до конца или пропускаем некорректную строку
//      }
//    }
    System.out.print("Введите количество студентов: ");
    while (!scanner.hasNextInt()) { // пока следующий ввод - не число
      String error = scanner.nextLine();
      System.out.println("Некорректный ввод, введите целое число: '" + error + "'");
      System.out.print("Введите количество студентов: ");
    } // цикл завершится, когда сканер следующей командой сможет прочитать int
    int amount = scanner.nextInt();
    scanner.nextLine();
    if (amount < 1) { // условие-стражник
      System.out.println("У вас нет студентов.");
      return;
    }
    System.out.println("Введите данные " + amount + " студентов");
    for (int i = 0; i < amount; ++i) {
      System.out.print("Введите имя: ");
      String name = scanner.nextLine();
      while (name.isEmpty()) {
        System.out.print("Имя не может быть пустым, введите имя: ");
        name = scanner.nextLine();
      }
      System.out.print("Введите группу: ");
      String group = scanner.nextLine();

      // правильный, но неаккуратный способ
//      // если в Map уже есть такой ключ
//      if (result.containsKey(group)) {
//        // получаем существующий список студентов по ключу (группе)
//        List<String> students = result.get(group);
//        students.add(name);
//        // при попытке положить значение по существующему ключу значение ПЕРЕЗАПИШЕТСЯ
////        result.put(group, students);
//        // но нам не надо ничего перезаписывать, ссылка остаётся той же
//      } else {
//        // создаём новый список студентов, потому что в Map ещё нет такого ключа
//        List<String> students = new ArrayList<>();
//        students.add(name);
//        result.put(group, students);
//      }

      // чуть более аккуратный способ
      if (!result.containsKey(group)) { // если группу встретили первый раз
        // нужно создать для неё список (пока пустой)
        result.put(group, new ArrayList<>());
      } // теперь список точно есть!
//      List<String> students = result.get(group);
//      students.add(name);
      result.get(group).add(name);
    }

    // for-each:
    // можно перебирать только ключи: Map.keySet() (множество ключей)
    // for (String group : result.keySet())
    // можно перебирать только значения (но зачем?): Map.values() (коллекция значений)
    // for (List<String> students : result.values())
    // можно перебирать пары ключ-значение (класс Map.Entry<K, V>): Map.entrySet() (множество пар)
    for (Map.Entry<String, List<String>> pair : result.entrySet()) {
      String group = pair.getKey(); // получить ключ из конкретной пары
      System.out.println(group);
      List<String> students = pair.getValue(); // получить значение из конкретной пары
      for (String student : students) {
        System.out.println("- " + student);
      }
    }
  }
}
