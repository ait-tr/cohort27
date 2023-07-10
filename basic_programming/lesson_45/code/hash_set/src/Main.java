import java.util.HashSet;
import java.util.Set;

public class Main {

  // Set и HashSet

  // List - список - упорядоченная коллекция с возможностью повторения
  // Set - множество - (не)упорядоченная коллекция с уникальными элементами

  // Set - множество - набор "в общем".
  // В таком наборе не бывает порядка (приоритета) и повторений.
  // Множество (в общем случае) - неупорядоченная коллекция без повторений.
  // Во множествах не будет индексов - индексация означает наличие порядка.
  // При этом все элементы множества можно перебрать при помощи for-each.
  //
  // HashSet:
  // - распределяет все добавляемые объекты по "ведёркам" (bucket) в зависимости от
  //   хэша (`hashCode()`)
  //   метод `hashCode()` каждому объекту сопоставляет целое число по правилу:
  //     для равных (через `equals()`) объектов число должно быть одинаковым
  //   Если `hashCode()` не перезаписать, то для разных ссылок он выдаст разные
  //     значения, поэтому при переопределении (@Override) метода `equals()`
  //     вы обязаны переопределить метод `hashCode()`.
  // - в одном ведёрке (при одинаковом хэше) сравнивает через `equals()`.

  // `Set` в целом (и `HashSet` в частности) не позволяет добавить дубль (повтор).
  public static void main(String[] args) {
    Set<Person> students = new HashSet<>();
    Person alice = new Person("Alice", "Dow", 23);
    students.add(alice);
    Person bob = new Person("Bob", "Dow", 24);
    students.add(bob);
    Person alice2 = alice; // alice и alice2 указывают на один и тот же объект
    students.add(alice2); // вторая "Алиса" не добавится - все элементы уникальны
    Person bob2 = new Person("Bob", "Dow", 24);
    // bob2 добавится, потому что для Java это ДРУГОЙ объект (`new Person()`)
    // "по умолчанию" (без @Override) Java через equals сравнивает ССЫЛКИ, а не содержимое
    students.add(bob2);
    for (Person student : students) {
      System.out.println(student);
    }
    System.out.println("Что-то пошло не так...");
    System.out.println("alice == bob: " + alice.equals(bob));
    System.out.println("bob == bob2: " + bob.equals(bob2));
  }
}
