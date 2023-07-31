import java.io.BufferedReader;
import java.io.IOException;

public class Student {

  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public String toString() {
//    return name + " (" + score + ")";
    return String.format("%s (%d)", name, score);
  }

  public static Student readInteractive(BufferedReader reader) throws IOException {
    System.out.print("Введите имя: ");
    String name = reader.readLine();
    System.out.print("Введите накопленные баллы: ");
    int score = 0;
    try {
      score = Integer.parseInt(reader.readLine());
    } catch (NumberFormatException e) {
      System.out.println("Некорректный формат числа: " + e.getMessage());
      // score так и останется 0
    }
    return new Student(name, score);
  }
}
