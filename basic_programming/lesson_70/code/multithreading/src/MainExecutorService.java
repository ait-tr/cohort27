import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutorService {

  private static final ExecutorService executor = Executors.newFixedThreadPool(4);

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      String taskName = "Task " + (i + 1);
      executor.submit(() -> System.out.println(taskName));
    }

    executor.shutdown();
  }
}
