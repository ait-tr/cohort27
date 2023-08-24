package club;

import java.util.Scanner;
import java.util.stream.Stream;

public class ClubRunnerStream {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Club club = new Club("Ромашка", 5, 18);
    club.greet();

    // Для конечного потока нужно использовать метод stream() или of()
    // Например, List<Visitor> visitors как visitors.stream()

    // генерируем БЕСКОНЕЧНЫЙ поток посетителей из метода interactiveRead
    Stream.generate(() -> Visitor.interactiveRead(scanner))
    // фильтруем только тех, кому возраст позволяет попасть
          .filter(v -> v.getAge() >= club.getAllowedAge())
    // ограничиваем количество посетителей (поток становится КОНЕЧНЫМ)
          .limit(club.getCapacity())
    // сортируем по возрасту
          .sorted((v1, v2) -> Integer.compare(v1.getAge(), v2.getAge()))
    // выводим по одному в строке
          .forEach(v -> System.out.println(v));
    club.close();
  }
}
