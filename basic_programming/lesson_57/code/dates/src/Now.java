import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Now {

  public static void main(String[] args) {
    LocalTime currentTime = LocalTime.now();
    System.out.println("Сейчас: " + currentTime.withNano(0));

    LocalDate currentDate = LocalDate.now();
    System.out.println("Сегодня: " + currentDate);

    LocalDateTime current = LocalDateTime.of(currentDate, currentTime);
    ZonedDateTime result = ZonedDateTime.of(current, ZoneId.systemDefault());

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    System.out.println("Сегодня и сейчас: " + result.format(formatter));
  }
}
