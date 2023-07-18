/**
 * 7/13/2023
 * Example
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 16;
    private static class Node<K, V> {
        K key;
        V value;

        int hashCode;

        Node<K, V> next;

        public Node(K key, V value, int hashCode) {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }
    }

    private Node<K, V>[] table; // массив связных списков (buckets)

    public MyHashMap() {
        this.table = new Node[DEFAULT_SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = hash & table.length - 1; // 15 - 1111

        // проверить, а не лежит ли уже что-то под этим индексом
        if (table[index] == null) { // если там ничего нет
            // положим одну единственную пару ключ-значение
            table[index] = new Node<>(key, value, hash);
        } else {
            // просто добавить как очередной элемент списка, например в конец
            Node<K, V> current = table[index]; // берем самый первый узел конкретного списка
            Node<K, V> last = null; // будем следить за последним
            while (current != null) { // пока не прошли весь список
                if (current.hashCode == key.hashCode()) { // сначала сравниваем по хешкоду, потом по equals
                    // если хеш-коды старого ключа и нового совпали, значит высока вероятность, что это один и тот же хешкод
                    // проверим, а не попался ли нам такой же ключ
                    if (current.key.equals(key)) { // если у текущего узла ключ совпал
                        // просто заменяем значение
                        current.value = value;
                        return; // останавливаем метод
                    }
                }
                last = current; // запоминаем последний элемент
                current = current.next; // идем дальше
            }
            // теперь нужно просто добавить узел в конец
            // сейчас current указывает на последний узел
            // следующий после последнего - новый узел
            last.next = new Node<>(key, value, hash);
        }
    }
}
