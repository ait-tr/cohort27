public class MonthOld { // enumeration - перечисление
  public static int JANUARY = 0;
  public static int FEBRUARY = 1;
  public static int MARCH = 2;
  public static int APRIL = 3;
  public static int MAY = 4;
  public static int JUNE = 5;
  public static int JULY = 6;
  public static int AUGUST = 7;
  public static int SEPTEMBER = 8;
  public static int OCTOBER = 9;
  public static int NOVEMBER = 10;
  public static int DECEMBER = 11;

  private int ordinal = JANUARY;

  public MonthOld(int ordinal) {
    this.ordinal = ordinal;
  }

  public int ordinal() {
    return ordinal;
  }

  // values, valueOf, toString...
}
