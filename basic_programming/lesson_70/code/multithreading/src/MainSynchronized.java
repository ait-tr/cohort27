public class MainSynchronized extends Thread {

  static int counter = 0;

  // служебное слово `synchronized` запрещает запускать метод или блок кода
  // в разных потоках одновременно -- если новый поток подойдёт к этому месту,
  // он будет дожидаться завершения предыдущего вызова
  synchronized public static void increaseCounter() {
    ++counter;
  }
  // counter = 3
  // THREAD - взять counter // 3
  // THREAD - увеличить на один // 4
  // THREAD - записать получившееся в counter // 4
  // MAIN - взять counter // 4
  // MAIN - увеличить на один // 5
  // MAIN - записать получившееся в counter // 5
  // THREAD - взять counter // 5
  // THREAD - увеличить на один // 6
  // THREAD - записать получившееся в counter // 6
  // counter = 6

  // без synchronized:
  // counter = 3
  // MAIN - взять counter // 3
  // THREAD - взять counter // 3
  // MAIN - увеличить на один // 4
  // THREAD - увеличить на один // 4
  // THREAD - записать получившееся в counter // 4
  // THREAD - взять counter // 4
  // THREAD - увеличить на один // 5
  // THREAD - записать получившееся в counter // 5
  // MAIN - записать получившееся в counter // 4
  // counter = 4 (а должен был 6)

  // запустится, когда MainSynchronized - отдельный поток
  @Override
  public void run() {
    for (int i = 0; i < 10000; ++i) {
      increaseCounter(); // data race - гонка данных
    }
  }

  // запустится, когда MainSynchronized - основная программа
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new MainSynchronized();
    thread.start(); // запустить поток
    for (int i = 0; i < 10000; ++i) {
      increaseCounter();
    }
    thread.join(); // дождаться завершения потока
    System.out.println(counter);
  }
}
