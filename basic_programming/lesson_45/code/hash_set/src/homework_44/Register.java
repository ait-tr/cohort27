package homework_44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {

  // У поля `bills` МОЖНО вызывать любые методы, в том числе add и remove,
  // но НЕЛЬЗЯ перезаписать само поле (ссылку) - нельзя написать `bills = новоеЗначение`
  private final List<Bill> bills = new ArrayList<>(); // хранилище готовых (закрытых) чеков
  private Bill current = new Bill(); // текущий (незакрытый) чек

  // добавить позицию в текущий чек
  public void addInteractive(Scanner scanner) {
    // берём текущий чек (`current`) и вызываем у него метод `добавитьПозицию`
    current.addInteractive(scanner);
  }

  public void closeBill() {
    // закрытие чека current:
    bills.add(current); // кладём только что закрытый чек в хранилище готовых чеков
    // вывод его на экран
    System.out.println(current);
    // начало нового чека:
    current = new Bill(); // начинаем новый чек
    // bills:    Bill@1, Bill@2
    // current:  Bill@3
  }
}
