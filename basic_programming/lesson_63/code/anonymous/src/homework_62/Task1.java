package homework_62;

public class Task1 {

  // Напишите рекурсивный метод `public static String reverse(int x)`,
  // который будет возвращать строку, содержащую десятичные цифры числа в обратном порядке
  // (развернёт число).
  // Для отрицательных чисел:
  // - вывести минус в начало строки
  // - вывести минус в конец строки
  public static String reverse(int x) {
    if (x < 0) {
      return reverse(Math.abs(x)) + "-";
    }
    // базис рекурсии:
    if (x < 10) {
      return Integer.toString(x);
    }
    // шаг рекурсии:
    // последняя цифра + развернуть всё остальное
    int last = x % 10;
    return last + reverse(x / 10);
  }
}
