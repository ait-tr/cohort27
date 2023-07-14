package homework_45;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

  // Написать программу, которая:
  // - прочитает с клавиатуры количество чисел,
  // - прочитает с клавиатуры сами числа и соберёт их в множество,
  // - выведет полученные результаты на экран.
  //
  // Все числа, которые подаются на вход, целые.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<Integer> numbers = new HashSet<>();
    System.out.print("Введите количество чисел: ");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод: " + scanner.next());
//      System.out.print("Введите количество чисел: ");
    }
    int amount = scanner.nextInt(); // InputMismatchException - не произойдёт
    scanner.nextLine(); // "сбрасываем" ввод, дочитав строку до конца
    System.out.println("Введите " + amount + " чисел:");
    for (int i = 0; i < amount; ++i) { // ни разу не повторится, если amount <= 0
      while (!scanner.hasNextInt()) {
        System.out.println("Некорректный ввод: " + scanner.next());
      }
      int x = scanner.nextInt(); // InputMismatchException
      numbers.add(x);
    }
//    int i = 0;
//    while (i < amount) { // ни разу не повторится, если amount <= 0
//      int x = scanner.nextInt(); // InputMismatchException
//      numbers.add(x);
//      ++i;
//    }
    System.out.println(numbers);
  }
}
