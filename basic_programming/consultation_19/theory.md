# Hashcode, HashMap, HashSet

* Map - ассоциативный массив (общий случай обычного массива)

* Хеш-код? Что это такое и для чего

* Представим себе обычный массив

```
int[] a = new int[4];

a[0] = 29;
a[1] = 18;
a[2] = 17;
a[3] = 27;

System.out.println(a[2]); // получаю значение под ключом 2 -> 17
```

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/consultation_19/img/1.png)

* Введем термины:
  * Ключ - индекс какого-либо элемента. Мы можем получить элемент по его индексу
  * Значение - то, что содержится под каким-либо индексом
* В массивах, под целочисленным ключом мы можем получить какое-либо значение.

## Немного пофантазируем

* А что, если мы хотим, чтобы ключи были не только целочисленными?

```
a["Marsel"] = 29;
a["Vika"] = 18;
a["Vadim"] = 17;
a["Kenan"] = 27;

System.out.println(a["Vadim"]);
```

## Решение 1

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/consultation_19/img/2.png)

* Создать массив пар `ключ-значение`
* Важный момент - ключи должны быть уникальными. Потому что мы получаем по ключу значение и должны получать ровно одно значение.
* Все хорошо, но есть проблема - нам каждый раз нужно пробегать весь массив, чтобы найти такой же ключ.
* Если у вас уже 1000 пар в массиве, то добавление 1001-й пары заставить сделать 1000 сравнений.

## Решение 2

* Мы знаем, что работа с индексами массива происходит очень быстро.
* Т.е. если я сделаю `a[1000] = 29`, мне не придется делать 1000 сравнений, я просто положу значение в 1000-ый элемент.
* Следовательно, нужно попробовать сделать так, чтобы мои ключи (в данном случае строковые) стали числами (т.е. будущими индексами массива)

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/consultation_19/img/3.png)

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/consultation_19/img/4.png)

* Функция хеширования (хеш-код) - функция преобразования одной последовательности бит в другую последовательность бит по определенному правилу.
* Если мы напишем функцию хеширования для строк, как просто взятие суммы кодов символов, то мы столкнемся с проблемой БОЛЬШОГО числа коллизий.
* Мы никогда не сможем полностью избавиться от коллизий, потому что целое число - int - а оно ограничено, а вот строк - бесчисленное количество.
* Вообще, ключом может быть любой тип, не только строка, поэтому наличие метода `hashCode` закреплено в Java в классе Object
* Для строк разработчики уже предусмотрели умную реализацию hashCode
* Особенность реализации хеш-кода для строк в Java заключается в том, что там каждый раз текущая сумма умножается на 31

```
public int hashCode() { 
        char[] chars = key.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = 31 * result + chars[i];
        }
        return result;
    }
```

* Как это работает?

```
Marsel -> 77, 97, 115, 114, 101, 108

result = 31 * 0 + 77
result = 31 * (31 * 0 + 77) + 97
result = 31 * (31 * (31 * 0 + 77) + 97) + 115
result = 31 * (31 * (31 * (31 * 0 + 77) + 97) + 115) + 114

Что в итоге получаем, если раскрыть скобки:

77 + 31 * 97 + 31 * 31 * 115 + 31 * 31 * 31 * 114 + 31 * 31 * 31 * 31 * 101

общая формула:

sum = chars[i] * 31^[n - i - 1]
```

* Такой подход исключает возникновение коллизии при перестановке символов. Почему? Потому что сменится соответствующая степень 31-го.

### Решение 3

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/consultation_19/img/5.png)

* Предыдущий подход очень удобен, за исключением того, что коллизии все равно будут.
* Либо они будут в функции хеширования, либо при урезании хеша до разумных диапазонов.
* Из-за этого вы можете перетереть нужные значения.
* Есть решение, которое применили в Java - метод цепочек
* Мы создаем массив, каждый элемент которого - это связный список.

### Хороший способ обрезать хеш-код до размера массива

#### Вариант 1

* `Math.abs(number % 10)` - долго

#### Вариант 2 - побитовое умножение

* `A & B`

```
Пусть A = 768986, B = 99
Тогда A & B = 66

A = 
10111011101111011010

B = 
1100011

10111011101111011010
00000000000001100011
--------------------
00000000000001000010

1000010(2) = 66(10)
```

## Additional Homework

```
Реализовать метод get() в MyHashMap по аналогии с put()
```