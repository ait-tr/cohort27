public class Main3 extends Thread {

  static int counter = 0;

  // запустится, когда Main3 - отдельный поток
  @Override
  public void run() {
    for (int i = 0; i < 10000; ++i) {
      ++counter; // data race - гонка данных
    }
  }

  // запустится, когда Main3 - основная программа
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Main3();
    thread.start();
    for (int i = 0; i < 10000; ++i) {
      ++counter;
    }
    thread.join();
    System.out.println(counter);
  }
}
