# Lesson 18

## 01. Подпрограммы - функции (продолжение)

### Тип возвращаемого значения

* Тип возвращаемого значения - это тип результата, который возвращает функция. Указывается рядом с названием функции.

```
public static boolean isEven(int a) {
        boolean result = a % 2 == 0;

        return result;
    }
```

* Результат работы функции, значение true или false, следовательно, тип возвращаемого значения - `boolean`
* Функция может возвращать результат только одного типа (того, который заявлен в функции)

#### НЕЛЬЗЯ

```
public static int isEven(int a) {
    boolean result = a % 2 == 0;

    return result;
}
```

```
public static int sum(int a, int b) {
    double result = a + b;

    return result;
}
```

### Замечание - работает правило преобразования типов

#### Можно

* Неявное преобразование

```
byte(1 байт) -> char(2 байта) -> int(4 байта) -> long(8 байт) -> double(8 байт)
```

```
public static long sumLong(int a, int b) {
        int result = a + b;

        return result;
    }
```

```
public static int toUnicodeNumber(char c) {
        return c;
    }
```

* Явное преобразование (в обратную сторону)

```
public static int sum(int a, int b) {
    long sum = a + b;

    return (int)sum;
}
```

### Замечания

* В функции может быть более 1-го `return`
* Каждый `return` при срабатывании прерывает работу функции и сразу возвращает результат
