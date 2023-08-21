# Anonymous Class (Анонимный класс)

In Oracle documentation, a good recommendation is provided: "Use anonymous classes when you need a local class for one-time use."

В документации Oracle приведена хорошая рекомендация: «Применяйте анонимные классы, если вам нужен локальный класс для одноразового использования».

Why might we need a one-time use class? For instance, for a comparator.

Зачем нам может потребоваться одноразовый класс? Например, для компаратора.

Instead of creating a separate class to compare cars based on their maximum speed like this:

Для сравнения автомобилей по максимальной скорости вместо создания отдельного класса:
```java
public class MaxSpeedCarComparator implements Comparator<Car> {

  @Override
  public int compare(Car o1, Car o2) {
    return o1.getMaxSpeed() - o2.getMaxSpeed();
  }
}

public class Main {

  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
    // заполнение списка

    Collections.sort(cars, new MaxSpeedCarComparator());

    System.out.println(cars);
  }
}
```
we can use a shorter notation:

мы можем использовать более короткую запись:
```java
public class Main {

  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
    // заполнение списка

    Collections.sort(cars, new Comparator<Car>() {
      @Override
      public int compare(Car o1, Car o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
      }
    });

    System.out.println(cars);
  }
}
```
We no longer need a separate file for the comparator, and the comparison logic is now located where the sorting is invoked.

Нам больше не нужен отдельный файл с компаратором, и логика сравнения теперь находится в том же месте кода, где вызывается сортировка.

# Functional Interfaces (Функциональные интерфейсы)

A functional interface in Java is an interface that declares only one abstract method (for example, a comparator).

Функциональный интерфейс в Java — интерфейс, в котором объявлен только один абстрактный метод (например, компаратор).

Most often, five functional interfaces are used:

Чаще всего используются пять функциональных интерфейсов:
- `Runnable` - takes no arguments and returns no result, simply runs

   ничего не принимает и ничего не возвращает, просто запускается
- `Supplier` - takes no arguments but produces new values

   поставщик - ничего не принимает, но порождает новые значения
- `Predicate` - takes a parameter and returns a boolean value, often describing a condition, for example, for searching or filtering

   принимает параметр и возвращает логическое значение, часто описывает условие, например, для поиска или фильтрации
- `Function` - takes a parameter and returns a new value, transforming an argument into a result

   функция - принимает параметр и возвращает новое значение, преобразовывает аргумент в результат
- `Consumer` - takes a parameter and does not return any value

   потребитель - принимает параметр и не возвращает никакого значения
