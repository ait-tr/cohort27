import java.util.Objects;

public class MainSynchronizedBlock extends Thread {

  static int counter = 0;
  // Cлужебное слово `synchronized` запрещает запускать метод или блок кода
  //  в разных потоках одновременно -- если новый поток подойдёт к этому месту,
  //  он будет дожидаться завершения предыдущего вызова
  // Если synchronized относится к блоку кода, а не к методу, то в скобочках
  //  требуется указание объекта, к которому будет привязана блокировка

  // запустится, когда MainSynchronizedBlock - отдельный поток
  @Override
  public void run() {
    for (int i = 0; i < 10000; ++i) {
      synchronized (MainSynchronizedBlock.class) {
        ++counter; // data race - гонка данных
      }
    }
  }

  // запустится, когда MainSynchronizedBlock - основная программа
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new MainSynchronizedBlock();
    thread.start(); // запустить поток
    for (int i = 0; i < 10000; ++i) {
      synchronized (MainSynchronizedBlock.class) {
        ++counter; // data race - гонка данных
      }
    }
    thread.join(); // дождаться завершения потока
    System.out.println(counter);
  }
}
