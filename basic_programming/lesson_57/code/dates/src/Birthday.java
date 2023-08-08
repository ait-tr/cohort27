import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Birthday {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // формат ввода и вывода:
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    System.out.print("Введите день рождения в формате ДД.ММ.ГГГГ: ");
    String dateStr = scanner.nextLine();
    LocalDate birthday = LocalDate.parse(dateStr, formatter);
    LocalDateTime current = LocalDateTime.now();

    Duration lifeDuration = Duration.between(birthday.atStartOfDay(), current);
//    System.out.println(
//        "Ваш возраст: " + lifeDuration.toDays() + " дней и " + lifeDuration.toHoursPart()
//            + " часов");
    System.out.printf("Вы прожили %d дней и %d часов%n", lifeDuration.toDays(),
        lifeDuration.toHoursPart());

    Period age = Period.between(birthday, current.toLocalDate());
    System.out.println(
        "Ваш возраст: " + age.get(ChronoUnit.YEARS) + " лет, " + age.getMonths() + " месяцев, "
            + age.getDays() + " дней");
  }
}
