package homework_51;

import java.util.Scanner;

public class Main {

  // Усовершенствуйте класс `Month` из классной работы.
  //
  // Добавьте для каждого месяца количество дней.
  //
  // Спросите у пользователя номер месяца
  // (нумерация начинается с 1, январь - первый месяц!)
  // и выведите по номеру название и количество дней.
  public static void main(String[] args) {
    // У каждого класса enum есть статический метод values(),
    //   который возвращает массив значений (в порядке описания их в enum):
    //   public static Класс[] values()
    Month[] allMonths = Month.values();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите номер месяца: ");
    while (!scanner.hasNextInt()) {
      if (!scanner.hasNext()) {
        System.err.println("Неожиданный конец файла");
        return; // дальше нечего читать
      }
      System.out.println("Некорректный ввод, введите целое число: " + scanner.nextLine());
    }
    int monthNumber = scanner.nextInt();
    if (1 <= monthNumber && monthNumber <= allMonths.length) {
      int monthIndex = monthNumber - 1; // номер превращается в индекс: 1-12 в 0-11
      Month month = allMonths[monthIndex];
      int days = month.getDays();
      // число % основание_системы_счисления = последняя_цифра
      System.out.printf("Месяц с номером %d: %s (%d %s)%n", monthNumber, month.getName(),
          days, (days % 10 == 1) ? "день" : "дней");
      // тернарный оператор:
      // условие ? значение_если_да : значение_если_нет
      // (days % 10 == 1) ? "день" : "дней"
    } else {
      System.out.println("Нет месяца с номером " + monthNumber);
    }
  }
}
