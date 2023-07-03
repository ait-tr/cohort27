import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  // ArrayList
  // - как массив (array)
  // - можно добавлять и удалять элементы
  // - в качестве типа указываем тип содержимого:
  //   new ArrayList<String>

  // new ИмяКласса<НужныйТип> - создание класса с использованием дженерика.
  // new ИмяКласса<Integer> - можно
  // new ИмяКласса<int> - нельзя, только классы (ссылочные типы)
  public static void main(String[] args) {
    // Слева указываем интерфейс и тип содержимого, справа - класс и пустые угловые скобочки
    List<Integer> numbers = new ArrayList<>();
    // Задача # 1:
    // - прочитать с клавиатуры количество чисел
    // - сами числа
    // - сохранить прочитанные числа в список
    // - вывести только элементы с чётными индексами
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество чисел: ");
    int amount = scanner.nextInt();
    System.out.println("Введите " + amount + " чисел:");
    for (int i = 0; i < amount; ++i) { // повтори amount раз
//      int x = scanner.nextInt();
//      numbers.add(x);
      numbers.add(scanner.nextInt());
    }
    // отладочный вывод - вывод промежуточного результата
    // перед сдачей программы его необходимо удалить или закомментировать
//    System.out.println("[DEBUG] Получившийся список: " + numbers);

    // - вывести только элементы с чётными индексами
    // проверка на чётность:
    // чётное = делится на 2 (кратное двум)
    // делится = делится без остатка = остатка от деления нет = остаток равен нулю
    for (int i = 0; i < numbers.size(); ++i) { // List.size() - размер списка
      if (i % 2 == 0) { // если индекс чётный
        System.out.println(numbers.get(i)); // List.get(индекс) - получить элемент по индексу
      }
    }
    // бонус: цикл с шагом +2: `for (int i = 0; i < numbers.size(); i += 2)`
  }
}
