public class Main {

  // Parallelism (параллельность) - "как на нескольких компьютерах"
  // Multithreading (concurrency) (многопоточность) - переключение между задачами
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 50; ++i) {
          System.out.println(i + " NEW");
        }
      }
    });
    thread.start();
    for (int i = 0; i < 50; ++i) {
      System.out.println(i + " MAIN");
    }
  }
}
