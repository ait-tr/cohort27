import java.util.Scanner;

public class Task1 {

  // Вводят количество чисел, а затем и сами числа.
  // Найти и вывести сумму всех чисел
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    System.out.println(sum);
  }
}
