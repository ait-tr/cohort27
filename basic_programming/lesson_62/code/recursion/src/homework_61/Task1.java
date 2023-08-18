package homework_61;

import java.util.Scanner;

public class Task1 {

  // Найти минимальное чётное число в последовательности положительных чисел
  // или вывести -1, если такого числа не существует.
  public static void main(String[] args) {        // Time=O(n)  Space=O(1)
    Scanner scanner = new Scanner(System.in);     // O(1)       O(1)
    int min = -1;                                 // O(1)       O(1)
    while (scanner.hasNextInt()) {                // n=O(n)     n=O(1)
      int x = scanner.nextInt();                  // *O(1)      +O(1)
      if (x % 2 == 0) {                           // *O(1)
        // если до этого чётных не было (min == -1) или новое меньше предыдущего минимума (x < min)
        if (min == -1 || x < min) {               // *O(1)
          min = x;                                // *O(1)
        }
      }
    }
    System.out.println(min);                      // O(1)
  }
}
