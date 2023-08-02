package homework_51;

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
    Month second = allMonths[1];
    System.out.println("second: " + second + ", second.getName(): " + second.getName());
  }
}
