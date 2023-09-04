public class Main2 extends Thread {

  // запустится, когда Main2 - отдельный поток
  @Override
  public void run() {
    for (int i = 0; i < 50; ++i) {
      System.out.println(i + " NEW");
    }
  }

  // запустится, когда Main2 - основная программа
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Main2();
    Thread myThread = new MyThread(50);
    thread.start(); // запустить поток
    for (int i = 0; i < 50; ++i) {
      System.out.println(i + " MAIN");
    }
    thread.join(); // подождать завершения потока
    myThread.start();
  }
}
