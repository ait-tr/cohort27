## ArrayList

* `ArrayList` - список на основе массиве

```java
public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10; // размер массива по умолчанию

    Object[] elementData = new Object[DEFAULT_CAPACITY]; // массив с данными, E[] elementData, E[] elements = (E[])new Object[10];

    private int size; // количество элементов в массиве - int count

    public E get(int index) { // метод получения по индексу
        Objects.checkIndex(index, size); // проверка индекса (index < 0 || index >= size)
        return elementData(index); // получение элемента под нужным индексом
    }

    E elementData(int index) {
        return (E)elementData[index]; // return elements[index]
    }

    public boolean add(E e) { // мы писали как void
        // add(e, elementData, size); // вызываем метод добавления элемент e в массив elementData в котором size-элементов

        if (size == elementData.length) { // count == length
            elementData = grow(); // resize()
        }
        
        elementData[size] = e; // добавление элемента в конец
        size = size + 1;
        
        return true; // всегда возвращает true, зачем? забейте
    }

    private Object[] grow(int minCapacity) { // увеличение размера массива
        int oldCapacity = elementData.length; // запоминаем старый размер
        int newCapacity = oldCapacity >> 1; // получаем новый размер, который в полтора раза больше предыдущего,
        // побитовый сдвиг на одну позицию эквивалентен умножению в полтора раза, это работает быстрее, чем обычная операция деления
        return elementData = Arrays.copyOf(elementData, newCapacity); // создаем новый массив большего размера и сразу кидаем туда все элементы
        // делаем это с помощью встроенной функции copyOf
        // эта функция работает гораздо быстрее, чем обычный for - потому что она вызывает нативную функцию native void arraycopy
    }
} 
```

## Словарик

* `grow` - расти