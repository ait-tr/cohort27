# Lesson 03

## 00. Разбор ошибок 

1. Неправильно написали название метода:

```
double height = s.nextDoube(); // правильно - nextDouble()
```

* Текст ошибки:

```
/Task04.java:12: error: cannot find symbol
        double height = s.nextDoube();
                         ^
  symbol:   method nextDoube()
  location: variable s of type Scanner
1 error
```

2. Забыли подключить класс, например Random // нужно import java.util.Random;

```
/Task04.java:7: error: cannot find symbol
        Random r = new Random();
        ^
  symbol:   class Random
  location: class Task04
```

* Если нарушен синтаксис (все предыдущие ошибки) - `compile error` ошибка компиляции.

* Если нарушена логика работы программы - `runtime exception` - исключение времени выполнения

3. Если нарушен формат ввода, программа ожидала данные в определенном формате, а вы подали в другом:

```
Exception in thread "main" java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at Task04.main(Task04.java:11)
```

## 01. Работа с целыми числами

* Тип данных `int` подразумевает определенный набор операций (`+, -, *`)

* Особые операции для целого типа `/, %`

* `/` - если справа от этой операции `int` и слева от этой операции `int` то результат будет целочисленным. Дробь - отбрасывается. Если хотя бы один из операндов - вещественный, то и результат будет вещественным.

* Любое число можно представить в виде:

```
a = b * c + d
a / b = c
a / c = b
a % b = d
a % c = d
```

* Например:

```
7 = 2 * 3 + 1
7 / 2 = 3
7 % 2 = 1
7 / 3 = 2
7 % 3 = 1

8 = 3 * 2 + 2
8 / 3 = 2
8 % 2 = 2

9 = 4 * 2 + 1
9 / 4 = 2
9 % 4 = 1
```

## 02. Работа с логическим типом

* Тип `boolean` - переменные данного типа могут принимать значения либо `true`, либо `false`

* Операция `==` - сравнение, сравнивает значения двух операндов. 

```
a == b
    - true если значения равны
    - false если значения не равны
```

## Словарик

* `Error` - ошибка
* `Exception` - исключение (синоним ошибки)
* `Runtime` - время выполнения, момент, когда программа запущена
* `Bug` - то же ошибка, но чаще всего скрытая, непонятная, и проявляет себя чисто в логике
* `Runtime exception` - ошибка времени выполнения
* `Log` - информация, которая выводится при работе программы в качестве сопроводительной
* `Input Mismatch Exception` - исключение несоответствия формата ввода 
* `Create` - создать
* `True` - истина
* `False` - ложь