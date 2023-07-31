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

  public static Student readInteractive() {
    return new Student("Без имени", 0);
  }
}
