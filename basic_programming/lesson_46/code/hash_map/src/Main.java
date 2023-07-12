import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

  // HashMap - мапа - словарь - ассоциативный массив
  // Набор данных в формате "ключ - значение".
  // Ключи представляют собой множество (как элементы в HashSet).

  // В качестве элементов HashSet или ключей HashMap могут использоваться
  // любые классы, для которых корректно определены методы hashCode() и equals()
  // В качестве значений HashMap можно использовать что угодно
  public static void main(String[] args) {
    Set<String> names = new HashSet<>();
    names.add("Alpha");
    names.add("Bravo");
    names.add("Charlie");
    System.out.println(names);

    Map<String, Object> phonebook = new HashMap<>();
    phonebook.put("Alpha", "+1");
    phonebook.put("Bravo", "+2");
    phonebook.put("Charlie", "+3");
    System.out.println(phonebook);
  }
}
