# Lesson 12

## 00. Повторение

### Переменные

* Для объявления переменной необходимо указать ее тип
  * Примитивные (хранят непосредственно значение)
    * Численные
      * Целочисленные
        * int
        * short
        * long
        * byte
      * Вещественные
        * float
        * double
      * Символьные
        * char
    * Логические
      * boolean
  * Ссылочные (хранят адрес на значение - массивы, классы)

* Символьные типы - кодируют символы в формате Unicode, следовательно, занимают 2 байта.
* Цифра - это символ - `0`, `1`, `2` ... `9` (указывается в кавычках, как и любой другой символ)
* Число - это математическое обозначение количества (например, 1024 кошки у меня дома)
* Код символа можно получить, просто положив символ в число (неявное преобразование)
* Символы, как числовой тип, можно сравнивать между собой
* Как получить из цифры - число? Надо отнять код `0` (`lesson_07`)

* Преобразование типов (`lesson_07`) - меньшие типы в большие преобразуем неявно, большие в меньшие явно с потерей данных
* Явное преобразование - это напоминалка разработчику, что он может потерять какие-то данные
* Явление переполнения (когда значение в переменной больше, чем она может вместить)

* Лучшие практики работы:
  * Названия переменных должны четко отражать смысл данных, которые мы в них храним
  * Не допускаются имена с `_` и в стиле `PascalCase`
  * Нет смысла экономить на количестве переменных, если вопрос о двух-трех, даже 10-ти штуках
  * Для каждого набора данных используем отдельную, хорошо названную переменную
  * Например:
    * `count` - количество
    * `length`, `size` - размер
    * `index` - индекс
    * `max`, `min` - максимальный минимальный
    * `number` - число
    * `digit` - цифра
    * `temp` - для временных переменных, которые, как правило, используются при обмене значений
    * `average` - среднее (как правило арифметическое)
  * Есть общепринятые сокращения:
    * `i, j, k` - для работы в массивах и циклах (`i` - первый уровень, `j` - второй уровень, `k` - третий, `l` - четвертый)
    * `m,n` - для обозначения количества строк и столбцов
    * `c` - один символ

### Структуры управления

* Условие - `if, if-else, if-(else if)-else`
* Циклы - `while, for`

#### Лучшие практики работы с циклами

* Не писать:

```
int i = 0;
for (i = 0; i <= 10; i++) { ... }
```

* Писать:

```
for (int i = 0; i <= 10; i++) { ... }
```

* Не опускать части цикла:

```
for (;;) { ... }

for (; i < 10; i++) { ... }

for (int i = 0; i < 10; ) { i += 2; }
```

* Писать:

```
while (true) { ... }

for (int i = 0; i < 10; i += 2) { ... }
```

* `i += 2` -> `i = i + 2`
* 
* `for` - придуман для последовательной линейной удобной обработки данных

### Массивы

* Массив - набор элементов с фиксированным количеством, задавать это количество
можно явно в коде, можно в момент работы, можно неявно в коде.