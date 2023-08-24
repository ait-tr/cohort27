import java.util.Scanner;

public class Task2Fibonacci {

  // Рекурсия - см. Рекурсия
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextInt();
    System.out.println(n + "-ое число Фибоначчи: " + fibonacci(n));
  }

  // Числа Фибоначчи: 1, 1, каждое следующее число - сумма двух предыдущих
  // 1, 1, 2, 3, 5, 8, 13, 21...
  private static long fibonacci(long n) {
    if (n <= 2) { // базис рекурсии
      return 1; // из рекурсии обязательно нужно выйти
    }
    // шаг рекурсии - "возврат к предыдущему", уменьшение размера
    // предыдущее: fibonacci(n - 1)
    // предыдущее: fibonacci(n - 2)
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
