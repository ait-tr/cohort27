import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1Students {

  // homework_43.Task3
  // Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить
  // своё место в строю. Помогите ему это сделать.
  //
  // Программа получает на вход:
  // Число X – рост Пети.
  // Размер последовательности;
  // Саму невозрастающую последовательность натуральных чисел,
  // означающих рост каждого человека в строю.
  //
  // Все числа во входных данных натуральные и не превышают 200.
  //
  // Выведите номер, под которым Петя должен встать в строй.
  // Если в строю есть люди с одинаковым ростом, таким же, как у Пети,
  // то он должен встать после них.
  //
  // ## Пример ввода
  // 162
  // 8
  // 165
  // 163
  // 160
  // 160
  // 157
  // 157
  // 155
  // 154
  //
  // ## Пример вывода
  // 3
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int peter = scanner.nextInt();
    int size = scanner.nextInt();
    List<Integer> heights = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      heights.add(scanner.nextInt());
    }

    int counter = 1; // хотим встать первым
    for (int h : heights) {
      if (h >= peter) {
        counter++;
      } else {
        break;
      }
    }
    System.out.println(counter);
  }
}
