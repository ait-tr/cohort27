/**
 * 7/11/2023
 * Example
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyHashMap<K, V> {
    private V[] values;

    public MyHashMap() {
        this.values = (V[])new Object[10];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = Math.abs(hash % 10); // порежем хеш до числа от 0 до 9
        values[index] = value; // кладем значение
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = Math.abs(hash % 10); // порежем хеш до числа от 0 до 9
        return values[index];
    }
}
