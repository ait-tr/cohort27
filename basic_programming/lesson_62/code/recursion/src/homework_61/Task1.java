package homework_61;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  // Найти минимальное чётное число в последовательности положительных чисел
  // или вывести -1, если такого числа не существует.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    while (scanner.hasNextInt()) {
      numbers.add(scanner.nextInt());
    }
    int min = numbers.get(0);
    for (int x : numbers) {
      if (x % 2 == 0) {
        if (x < min) {
          min = x;
        }
      }
    }
    System.out.println(min);
  }
}
