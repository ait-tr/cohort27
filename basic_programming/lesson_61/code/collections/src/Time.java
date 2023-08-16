import java.util.Scanner;

public class Time {

  // по введённому размеру выводить оценку эффективности:
  // по времени и по памяти (без дополнительных коэффициентов)
  // O(n) = n, O(n^2) = n^2
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер данных: ");
    long n = scanner.nextLong();
    printTimeEfficiency(n);
    printSpaceEfficiency(n);
  }

  private static void printTimeEfficiency(long n) {

  }

  private static void printSpaceEfficiency(long n) {

  }
}
