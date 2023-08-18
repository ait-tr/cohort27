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
  public static void main(String[] args) {      // Time = O(n)  Space = O(n)
    Scanner scanner = new Scanner(System.in);   // O(1)         O(1)
    int peter = scanner.nextInt();              // O(1)         O(1)
    int size = scanner.nextInt();               // O(1)         O(1)
    List<Integer> heights = new ArrayList<>();  // O(1)         O(1)
    for (int i = 0; i < size; i++) {            // n=O(n)       n=O(n) +O(1)
      heights.add(scanner.nextInt());           // *O(1)        *O(1)
    }

    int counter = 1; // хотим встать первым     // O(1)         O(1)
    for (int h : heights) {                     // n=O(n)       n=O(1) +O(1)
      if (h >= peter) {                         // *O(1)
        counter++;                              // *O(1)
      } else {
        break;
      }
    }
    System.out.println(counter);                // O(1)
  }
}
