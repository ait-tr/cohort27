import java.util.Scanner;

public class Task1 {

  // Вводят количество чисел, а затем и сами числа.
  // Найти и вывести сумму всех чисел
  public static void main(String[] args) {    // time = O(n)    space = O(1)
    Scanner scanner = new Scanner(System.in); // O(1)           O(1)
    int size = scanner.nextInt();             // O(1)           O(1)
    int sum = 0;                              // O(1)           O(1)
    for (int i = 0; i < size; i++) {          // n раз = O(n)   +O(1)
      int x = scanner.nextInt();              // - O(1)          +O(1)
      sum += x;                               // - O(1)
    }
    System.out.println(sum);                  // O(1)
  }
}
