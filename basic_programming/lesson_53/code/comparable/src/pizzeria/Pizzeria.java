package pizzeria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {

  // MVP - minimum viable product - минимально жизнеспособный продукт.
  // Продукт, который можно использовать для демонстрации идеи.

  // Написать небольшую программу, используемую для обработки заказов в пиццерии.
  // Команды:
  // - начать заказ
  //   - указать данные о пицце (на любом этапе можно вернуться к предыдущему шагу)
  //     - название (а лучше выбор из списка)
  //     - размер (выбор из списка)
  //   - автоматический расчёт стоимости
  //   - данные о заказе добавляются в файл (передаются на кухню) (заказ завершён)
  // - выход
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Pizza> pizzas = new ArrayList<>();
    while (true) {
      MenuCommand command = MenuCommand.readCommand(scanner);
      switch (command) {
        case UNEXPECTED:
          System.out.println("Некорректная команда");
          break;
        case START:
          Pizza pizza = Pizza.readInteractive(scanner);
          pizzas.add(pizza);
          // TODO запись заказа (пиццы) в файл с заказами
          break;
        case EXIT:
          System.out.println("Заказанные за сегодня пиццы:");
          Collections.sort(pizzas);
          for (Pizza p : pizzas) {
            System.out.println("[DEBUG] " + p);
          }
          return; // завершение работы метода main()
      }
    }
  }
}
