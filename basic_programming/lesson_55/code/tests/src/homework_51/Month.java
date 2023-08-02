package homework_51;

public enum Month { // enumeration - перечисление
  JANUARY("Январь", 31), // происходит вызов конструктора
  FEBRUARY("Февраль", 28),
  MARCH("Март", 31),
  APRIL("Апрель", 30),
  MAY("Май", 31),
  JUNE("Июнь", 30),
  JULY("Июль", 31),
  AUGUST("Август", 31),
  SEPTEMBER("Сентябрь", 30),
  OCTOBER("Октябрь", 31),
  NOVEMBER("Ноябрь", 30),
  DECEMBER("Декабрь", 31);

  // в enum можно добавлять обычные поля и методы, как в любой другой класс
  private final String name;
  private final int days;

  // При описании конструктора его нужно "вызвать" в описании каждого значения (см. выше).
  // Конструктор enum по умолчанию private.
  /*private*/ Month(String name, int days) {
    this.name = name;
    this.days = days;
  }

  public String getName() {
    return name;
  }

  public int getDays() {
    return days;
  }
}
