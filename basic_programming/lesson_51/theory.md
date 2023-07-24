# Enum (Перечисляемый тип)

In Java, an enum (short for enumeration) is a special data type that allows you to define a set of named constants. It is used to represent a fixed set of related values, making the code more readable, maintainable, and type-safe. Enums were introduced in Java 5 and have become a powerful tool for defining a finite set of constants.

В Java enum (перечисление) - это особый тип данных, который позволяет определить набор именованных констант. Он используется для представления фиксированного набора связанных значений, что делает код более читаемым, удобным для поддержки и безопасным в отношении типов. Enums были введены в Java 5 и стали мощным инструментом для определения ограниченного набора констант.

To create an enum, you use the `enum` keyword followed by the name of the enum and a list of constant values within curly braces. Each constant value is defined using uppercase letters by convention.

Чтобы создать enum, используется ключевое слово `enum`, за которым следует имя enum и список константных значений в фигурных скобках. Каждое константное значение определяется с помощью заглавных букв по соглашению.

Here's a simple example of an enum representing the days of the week:

Вот простой пример enum, представляющий дни недели:

```java
enum Day {
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY
}
```

With this enum, you have defined a set of seven constants: `SUNDAY`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, and `SATURDAY`.

В этом enum определен набор из семи констант: `SUNDAY`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY` и `SATURDAY`.

Enums can have methods and fields just like regular Java classes. Here's an example with a method:

Enums могут содержать методы и поля, как обычные классы Java. Вот пример с методом:

```java
enum Day {
  SUNDAY("Sun"),
  MONDAY("Mon"),
  TUESDAY("Tue"),
  WEDNESDAY("Wed"),
  THURSDAY("Thu"),
  FRIDAY("Fri"),
  SATURDAY("Sat");

  private final String abbreviation;

  private Day(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }
}
```

In this example, we have added an additional private field `abbreviation` to the enum and created a constructor to initialize it. We've also added a public method `getAbbreviation()` to retrieve the abbreviation associated with each day.

В этом примере мы добавили дополнительное приватное поле `abbreviation` в enum и создали конструктор для его инициализации. Мы также добавили публичный метод `getAbbreviation()` для получения сокращения, связанного с каждым днем.

You can access the constants and methods of an enum using the dot notation:

Вы можете получить доступ к константам и методам enum с помощью точечной нотации:

```java
Day today = Day.WEDNESDAY;
System.out.println(today); // Output (вывод): WEDNESDAY

String abbreviation = today.getAbbreviation();
System.out.println(abbreviation); // Output (вывод): Wed
```

You can also use enums in switch statements, which is a common use case:

Также вы можете использовать enum в операторах switch, именно так enum используют чаще всего:

```java
Day today = Day.FRIDAY;

switch (today) {
  case MONDAY:
    System.out.println("It's Monday!");
    break;
  case FRIDAY:
    System.out.println("It's Friday!");
    break;
  // ... other cases
  default:
    System.out.println("It's some other day.");
}
```

Enums offer a safe and structured way to represent a set of related constants, making your code more organized and easier to understand.

Enums предлагают безопасный и структурированный способ представления набора связанных констант, что делает ваш код более организованным и понятным.

Additionally, enums in Java provide a method called `values()`, which returns an array containing all the constants in the order they were declared. This method can be useful when you need to iterate over all the enum constants or when you want to perform some operations on all the values defined in the enum.

Кроме того, в Java перечисления предоставляют метод с именем `values()`, который возвращает массив, содержащий все константы перечисления в порядке их объявления. Этот метод может быть полезен, когда необходимо перебрать все константы перечисления или когда требуется выполнить некоторые операции со всеми значениями, определенными в списке значений перечисления.

```java
Day[] allDays = Day.values();
for (Day day : allDays) {
  System.out.println(day);
}
```
The above code will print all the days in the order they were declared in the enum value list.

Приведенный выше код выведет все дни в порядке их объявления в списке значений перечисления.
