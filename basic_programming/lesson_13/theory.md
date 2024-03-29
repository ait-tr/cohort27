# Lesson 13

## 01. Задача поиска

* Пусть дан массивы `array` размерности `100 000` элементов, каждый из которых имеет значение в диапазоне от `0` до `999 999`

* Также есть массив `numbersForSearch` размерности `100 000` элементов, каждый из которых имеет значение в диапазоне от `0` до `1 999 999`

* Необходимо опрелить количество элементов массива `numbersForSearch`, которые присутствуют в массиве `array`.

* Простая реализация (см. `composition.Main2`) предполагает последовательный перебор всех элементов массива `numbersForSearch` и поиск их в массиве `array`:

```java
// пробегаем по всем элементам массива numbersForSearch
for (int j = 0; j < numbersForSearch.length; j++) {
  // для каждого numbersForSearch[j] - он выполняет поиск
  int currentNumber = numbersForSearch[j];
  for (int i = 0; i < array.length; i++) {
  // проверяем два элемента на каждом шаге циклов
        if (currentNumber == array[i]) {
            count++;
            break;
        }
    }
}
```

* Следует заметить, что оператор `break` вызывается в том случае, если найдено совпадение. Следовательно, просмотр массива `array` останавливается сразу, как только найдено первое совпадение. Это дает хорошую производительность, когда диапазоны чисел обоих массивов совпадают:

```
Представим, что диапазоны чисел совпадают - 0 до 10 в обоих массивах

numbersForSearch -> 4, 1, 5, 3, 6, 3, 2, 7
array            -> 3, 1, 4, 6, 2, 7, 5, 9

Как будет работать поиск?

Берем numbersForSearch[0], сравниваем его со всеми числами в array

4 ~ 3
4 ~ 1
4 ~ 4

Останавливаем сравнение, всего было 3 операции сравнения.

Берем numbersForSearch[1], сравниваем его со всеми числами в array

1 ~ 3
1 ~ 1

Останавливаем сравнение, всего было 2 операции сравнения.

Выполняется очень мало сравнений по сравнению с количеством элементом.
```

* В случае, если диапазоны разные, мы получаем потерю производительности:

```
Представим, что диапазоны чисел разные - 0 до 10 в array, и от 0 до 20 в numbersForSearch

numbersForSearch -> 14, 11, 15, 13, 16, 13, 12, 17
array            -> 3, 1, 4, 6, 2, 7, 5, 9

Берем numbersForSearch[0], сравниваем его со всеми числами в array.

Выполняем сравнения:

14 ~ 3
14 ~ 1
14 ~ 4
14 ~ 6
14 ~ 2
14 ~ 7
14 ~ 5
14 ~ 9

Всего выполнено 8 сравнений
```

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_13/img/1.png)

## 02. Сортировка выбором

* см. `Main4` - примитивная версия
* см. `Main5` - окончательная версия


* Сортировка (упорядочивание) элементов позволяет значительно ускорить работу программы. 

* Рассмотрим алгоритм сортировки выбором (`Selection sort`)

```
Сначала найдем минимальный элемент во всем массиве (число 2 под индексом 4) и поменяем его местами с самым первым значением (это число 10 под индексом 0)


Теперь повторим ту же процедуру, но уже начиная со второй позиции и т.д.

Таким образом, элементы слева от “границы” всегда будут гарантированно меньше элементов справа, при этом, они уже будут отсортированы.
```

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_13/img/2.png)

## 03. Бинарный поиск

* см. `Main7` - примитивная версия
* см. `Main8` - окончательная версия


* После того, как элементы отсортированы, можно значительно уменьшить количество “просматриваемых” элементов при поиске. Идея бинарного поиска заключается в разбиении исходного массива на две половины. Если искомый элемент больше среднего (middle), то ищем в правой половине, в противном случае - в левой. Данный подход применяем к полученному сегменту массива и повторяем до тех пор, пока элемент не будет найден (или не найден).

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_13/img/3.png)

## 04. Анализ результатов

### Без сортировки и бинарного поиска (composition.Main2)

```
Поиск занял - 2.668
Всего совпадений: 4770
```

### С сортировкой и бинарным поиском (Main6)

```
Сортировка заняла - 3.046
Поиск занял - 0.009
Всего совпадений: 4811
```

### С встроенной java-сортировкой и бинарным поиском (Main10)

```
Сортировка заняла - 0.061
Поиск занял - 0.015
Всего совпадений: 4829
```

