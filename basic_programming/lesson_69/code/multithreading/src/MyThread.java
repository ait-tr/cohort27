public class MyThread extends Thread {

  private final int limit;

  public MyThread(int limit) {
    this.limit = limit;
  }

  @Override
  public void run() {
    for (int i = 0; i < limit; i++) {
      System.out.println(i + " MY_THREAD");
    }
  }
}
