package club;

import java.util.Scanner;

public class Visitor {

  private final String name;
  private final int age;

  public Visitor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Visitor{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  /**
   * Чтение данных о посетителе клуба
   * @param scanner источник данных
   * @return посетитель
   */
  public static Visitor interactiveRead(Scanner scanner) {
    System.out.println("Как вас зовут?");
    String name = scanner.nextLine();
    System.out.println("Сколько вам лет?");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод: " + scanner.nextLine());
      System.out.print("Введите целое число: ");
    }
    int age = scanner.nextInt();
    scanner.nextLine(); // дочитываем строку после целого числа
    return new Visitor(name, age);
  }
}
