package homework_42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  // - прочитать с клавиатуры количество чисел
  // - прочитать с клавиатуры сами числа и сохранить их в список
  // - вывести только нечётные элементы списка
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    // scanner.nextLine() - читает строку до конца (до `\n`)
    // scanner.nextВсёОстальное() - пропускает пустое пространство (` `, `\t`, `\n`)
    //  и пытается прочитать `ВсёОстальное` (и выбрасывает `InputMismatchException`).
    //
    // Между nextВсёОстальное() и nextLine() должна быть дополнительная nextLine(),
    // которая дочитает оставшуюся строку до конца (чаще всего - пустую)
    List<Integer> numbers = new ArrayList<>(amount);
    for (int i = 0; i < amount; i++) {
      numbers.add(scanner.nextInt());
    }
    // for для набора объектов, когда нужно перебрать все от начала до конца,
    //   и не важно, какой у них индекс и есть ли индекс:
    // for (тип элемент : набор) // в переменной `элемент` по очереди окажутся
    //   копии всех значений (или ссылок) из набора:
    // перебор по индексам
//    for (int i = 0; i < numbers.size(); i++) {
//      if (numbers.get(i) % 2 != 0) { // `numbers[i]` не кратно 2 (нечётное)
//        System.out.println(numbers.get(i));
//      }
//    }

    // перебор по индексам с дополнительной переменной
//    for (int i = 0; i < numbers.size(); i++) {
//      int x = numbers.get(i);
//      if (x % 2 != 0) { // `x` не кратно 2 (нечётное)
//        System.out.println(x);
//      }
//    }

    // for-each
    for (int x : numbers) { // для каждого (for each) `x` из `numbers`
      if (x % 2 != 0) { // `x` не кратно 2 (нечётное)
        System.out.println(x);
      }
    }
  }
}
