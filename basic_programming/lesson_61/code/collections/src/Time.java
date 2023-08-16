import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Time {

  // по введённому размеру выводить оценку эффективности:
  // по времени и по памяти (без дополнительных коэффициентов)
  // O(n) = n, O(n^2) = n^2
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер данных: ");
    long n = scanner.nextLong();
    Map<String, Double> efficiency = calculateEfficiency(n);
    printTimeEfficiency(efficiency);
    printSpaceEfficiency(efficiency);
  }

  private static double factorial(long n) {
    double result = 1.0;
    for (long k = 2; k <= n; k++) {
      result *= k;
    }
    return result;
  }

  private static Map<String, Double> calculateEfficiency(long n) {
    Map<String, Double> result = new LinkedHashMap<>();
    result.put("log n", Math.log(n));
    result.put("n", (double) n);
    result.put("n log n", n * Math.log(n));
    result.put("n^2", Math.pow(n, 2));
    result.put("n^3", Math.pow(n, 3));
    result.put("2^n", Math.pow(2, n));
    result.put("n!", factorial(n));
    return result;
  }

  private static void printTimeEfficiency(Map<String, Double> efficiency) {
    System.out.println("Эффективность по времени:");
    for (Map.Entry<String, Double> entry : efficiency.entrySet()) {
      System.out.printf("O(%s) = %.0f%n", entry.getKey(), entry.getValue());
    }
  }

  private static void printSpaceEfficiency(Map<String, Double> efficiency) {
    System.out.println("Эффективность по памяти:");
    for (Map.Entry<String, Double> entry : efficiency.entrySet()) {
      System.out.printf("O(%s) = %.0f%n", entry.getKey(), entry.getValue());
    }
  }
}
