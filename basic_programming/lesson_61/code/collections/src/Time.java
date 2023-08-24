import java.time.Duration;
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
      Double efficiencyValue = entry.getValue();
      if (efficiencyValue.longValue() == Long.MAX_VALUE) {
        System.out.println("O(" + entry.getKey() + ") = Infinity");
        continue;
      }
      Duration result = Duration.ofNanos(efficiencyValue.longValue());
      long days = result.toDays();
      int hours = result.toHoursPart();
      int minutes = result.toMinutesPart();
      int seconds = result.toSecondsPart();
      int nanos = result.toNanosPart();
      StringBuilder toPrint = new StringBuilder();
      toPrint.append("O(").append(entry.getKey()).append(") =");
      if (days > 0) {
        toPrint.append(" ").append(days).append("d");
      }
      if (hours > 0) {
        toPrint.append(" ").append(hours).append("h");
      }
      if (minutes > 0) {
        toPrint.append(" ").append(minutes).append("m");
      }
      if (seconds > 0) {
        toPrint.append(" ").append(seconds).append("s");
      }
      if (result.toMinutes() == 0) {
        toPrint.append(" ").append(nanos).append("ns");
      }
      System.out.println(toPrint);
    }
  }

  private static void printSpaceEfficiency(Map<String, Double> efficiency) {
    System.out.println("Эффективность по памяти:");
    for (Map.Entry<String, Double> entry : efficiency.entrySet()) {
      System.out.printf("O(%s) = %.0f%n", entry.getKey(), entry.getValue());
    }
  }
}
