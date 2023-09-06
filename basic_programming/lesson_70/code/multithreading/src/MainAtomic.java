import java.util.concurrent.atomic.AtomicInteger;

public class MainAtomic extends Thread {

  // volatile - пометка, обещание, что переменная будет потокобезопасной
  volatile static int pseudoVolatileCounter = 0;

  // atomic - букв. "неделимый" - разновидности переменных, все операции с которыми
  //  будут потокобезопасными
  static AtomicInteger counter = new AtomicInteger();

  // запустится, когда MainAtomic - отдельный поток
  @Override
  public void run() {
    for (int i = 0; i < 10000; ++i) {
      // предупреждение - непотокобезопасная операция с переменной, помеченной как volatile
      ++pseudoVolatileCounter;
      // а здесь всё хорошо, здесь атомик - в любом случае потокобезопасная переменная
      counter.incrementAndGet();
    }
  }

  // запустится, когда MainAtomic - основная программа
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new MainAtomic();
    thread.start(); // запустить поток
    for (int i = 0; i < 10000; ++i) {
      // предупреждение - непотокобезопасная операция с переменной, помеченной как volatile
      ++pseudoVolatileCounter;
      // а здесь всё хорошо, здесь атомик - в любом случае потокобезопасная переменная
      counter.incrementAndGet();
    }
    thread.join(); // дождаться завершения потока
    System.out.println(counter);
  }
}
