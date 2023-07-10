public class Person {

  private final String name;
  private final String lastName;
  private final int age;

  public Person(String name, String lastName, int age) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + " " + lastName + " (age: " + age + ")";
  }

  // хочу, чтобы разные объекты в памяти считались одинаковыми при совпадении полей

  @Override
  public boolean equals(Object obj) {
    if (obj == this) { // ускорение сравнения, частный случай
      return true; // объект равен сам себе
    }
    // предположим, что у нас есть `class Student extends Person`
//    // сравнение классов: нельзя сравнить Student и Person
//    // можно сравнить Student и Student или Person и Person
//    if (this.getClass() != obj.getClass()) {
//      return false;
//    }
    // можно сравнить Person и потомков в любых комбинациях:
    // Student и Person, Student и Student, Person и Person...
    if (!(obj instanceof Person otherPerson)) {
      return false;
    }
    // здесь я оказался, если Object obj получилось преобразовать в Person otherPerson
    // равенство будет означать совпадение полей
    return name.equals(otherPerson.name) &&
        lastName.equals(otherPerson.lastName) &&
        (age == otherPerson.age);
  }
}
