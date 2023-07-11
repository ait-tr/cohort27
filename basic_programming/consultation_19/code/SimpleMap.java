/**
 * 7/11/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class SimpleMap {
    private static class KeyValue {
        String key;
        int value;

        public KeyValue(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private KeyValue[] table;
    private int count;

    public SimpleMap() {
        this.table = new KeyValue[10];
        this.count = 0;
    }

    public void put(String key, int value) {
        for (int i = 0; i < count; i++) { // пробегаем по всем парам ключ-значение
            if (table[i].key.equals(key)) { // если ключ в таблице уже есть
                table[i].value = value; // просто заменяем у него значение
                return; // останавливаем работу метода
            }
        }
        // если такого ключа еще не было, просто кладем новую пару в массив
        KeyValue newKeyValue = new KeyValue(key, value);
        table[count] = newKeyValue;
        count++;
    }
}
