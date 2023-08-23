package club;

public class Club {

  private final String title;

  public Club(String title) {
    this.title = title;
  }

  public void greet() {
    System.out.println("Добро пожаловать в клуб " + title);
  }

  public boolean hasFreeSpace() {
    return true;
  }

  public void sorry() {
    System.out.println("Извините, мест больше нет");
  }

  public void tryToEnter(Visitor visitor) {

  }

  public void printVisitorsByAge() {

  }

  public void close() {
    System.out.println("Клуб " + title + " закрывает свои двери до следующего раза");
  }
}
