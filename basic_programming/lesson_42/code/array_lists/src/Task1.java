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

  }
}
