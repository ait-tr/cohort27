# Lambda Expressions

Lambda expressions in Java are a feature introduced in Java 8 that allows you to treat functions as method arguments or code as data. They are primarily used to define small, concise, and anonymous functions (also known as "closures") directly in the body of a method, constructor, or other block of code. Lambda expressions make it easier to express instances of single-method interfaces (also called functional interfaces) using a more compact syntax.

Лямбда-выражения в Java - это возможность, впервые введенная в Java 8, которая позволяет вам рассматривать функции как аргументы методов или код как данные. Они используются преимущественно для определения небольших, кратких и анонимных функций (также известных как "замыкания") непосредственно в теле метода, конструктора или другого блока кода. Лямбда-выражения облегчают создание экземпляров интерфейсов с одним методом (также называемых функциональными интерфейсами) с более компактным синтаксисом.

The syntax of a lambda expression consists of the following parts:

Синтаксис лямбда-выражения состоит из следующих частей:

```java
(parameters) -> expression
(параметры) -> выражение
```

or

или

```java
(parameters) -> { statements; }
(параметры) -> { инструкции; }
```

Here's a breakdown of each part:

Вот разбор каждой части:

- `parameters`: The parameters are the inputs that the lambda expression takes. These are the parameters of the single method defined in the functional interface that the lambda expression implements.

  Параметры представляют собой входные данные, которые принимает лямбда-выражение. Это параметры единственного метода, определенного в функциональном интерфейсе, который реализует лямбда-выражение.
- `->`: This arrow token separates the parameters from the body of the lambda expression.

  Эта стрелка отделяет параметры от тела лямбда-выражения.
- `expression` or `{ statements; }`: This is the body of the lambda expression. If the lambda performs a single operation, you can use an expression. If it requires multiple operations, you can use a block of statements enclosed in curly braces.

  Это тело лямбда-выражения. Если лямбда выполняет одну операцию, вы можете использовать выражение. Если требуется выполнение нескольких операций, можно использовать блок инструкций, заключенных в фигурные скобки.

Here's a simple example of a lambda expression that implements the `Runnable` interface:

Вот простой пример лямбда-выражения, реализующего интерфейс `Runnable`:

```java
Runnable myLambda = () -> System.out.println("Hello, Lambda!");
```

Lambda expressions are often used with functional interfaces, which are interfaces with exactly one abstract method. Examples of functional interfaces include `Runnable`, `Callable`, `Comparator`, and various other interfaces in the `java.util.function` package such as `Predicate`, `Function`, and `Consumer`.

Лямбда-выражения часто используются с функциональными интерфейсами, которые представляют собой интерфейсы с ровно одним абстрактным методом. Примеры функциональных интерфейсов включают `Runnable`, `Callable`, `Comparator` и различные другие интерфейсы в пакете `java.util.function`, такие как `Predicate`, `Function` и `Consumer`.

For instance, using a lambda expression with the `Comparator` interface to sort a list of strings:

Например, использование лямбда-выражения с интерфейсом `Comparator` для сортировки списка строк:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
```

In this example, the lambda expression `(s1, s2) -> s1.compareTo(s2)` is used as an argument (comparator) to the `Collections.sort` method to define the sorting order for the list.

В этом примере лямбда-выражение `(s1, s2) -> s1.compareTo(s2)` используется в качестве аргумента (компаратора) для метода `Collections.sort`, чтобы определить порядок сортировки для списка.

Lambda expressions are a powerful tool for simplifying code and promoting more functional programming styles in Java. They can lead to more readable and concise code by eliminating the need for anonymous inner classes in certain scenarios.

Лямбда-выражения - это мощный инструмент для упрощения кода и поощрения более функциональных стилей программирования в Java. Они могут привести к более читаемому и краткому коду, устраняя необходимость в анонимных внутренних классах в определенных сценариях.

Read more: [Lambda Expressions Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)

# Streams (Потоки)

Streams are a powerful feature introduced in Java 8 that provide a higher-level, functional-style approach to working with collections of data. Streams allow you to process sequences of elements (such as arrays or collections) in a declarative and often more concise way, while enabling optimizations under the hood for parallelism and efficiency.

Потоки (streams) - это мощная возможность, введенная в Java 8, которая предоставляет высокоуровневый, функциональный подход к работе с коллекциями данных. Потоки позволяют обрабатывать последовательности элементов (таких как массивы или коллекции) в декларативной и часто более краткой форме, обеспечивая при этом оптимизации для параллелизма и эффективности.

Streams are designed to enable various operations on data, such as filtering, mapping, and reducing, without the need for explicit iteration. They encourage a more functional programming style, where you express what you want to do with the data, rather than how to do it.

Потоки разработаны для выполнения различных операций над данными, таких как фильтрация, отображение (маппинг) и уменьшение (редукция), без явной итерации. Они способствуют более функциональному стилю программирования, где вы выражаете, что вы хотите сделать с данными, а не как это сделать.

Here are some key characteristics and concepts related to streams:

Вот несколько ключевых характеристик и понятий, связанных с потоками:

1. **Source**: A stream is typically created from a data source, which can be a collection, array, I/O channel, generator function, etc.

   **Источник**: Поток обычно создается из источника данных, который может быть коллекцией, массивом, каналом ввода-вывода, генераторной функцией и т.д.

2. **Intermediate Operations**: These operations are performed on a stream and return a new stream. They are typically lazy, meaning they don't perform the actual processing until a terminal operation is invoked. Examples include `filter`, `map`, `distinct`, `sorted`, and `limit`.

   **Промежуточные операции**: Эти операции выполняются над потоком и возвращают новый поток. Они обычно являются ленивыми, что означает, что фактическая обработка данных происходит только при вызове терминальной операции. Примеры включают `filter`, `map`, `distinct`, `sorted` и `limit`.

3. **Terminal Operations**: These operations trigger the processing of the data and produce a result or a side-effect. Once a terminal operation is invoked, the stream cannot be used again. Common terminal operations include `forEach`, `collect`, `reduce`, `min`, `max`, and `count`.

   **Терминальные операции**: Эти операции запускают обработку данных и создают результат или побочный эффект. После вызова терминальной операции поток нельзя использовать повторно. К общим терминальным операциям относятся `forEach`, `collect`, `reduce`, `min`, `max` и `count`.

4. **Short-Circuiting Operations**: Some terminal operations, like `findFirst`, `findAny`, and `anyMatch`, can stop processing once a certain condition is met, which can be more efficient for large datasets.

   **Операции с коротким циклом**: Некоторые терминальные операции, такие как `findFirst`, `findAny` и `anyMatch`, могут прекращать обработку после достижения определенного условия, что может быть более эффективно для больших наборов данных.

5. **Pipeline**: A sequence of stream operations (intermediate and terminal) is called a pipeline. Pipelines are composed of a source, zero or more intermediate operations, and a terminal operation.

   **Пайплайн**: Последовательность операций потока (промежуточных и терминальных) называется пайплайном. Пайплайны состоят из источника, нуля или более промежуточных операций и терминальной операции.

6. **Parallel Processing**: Streams can be processed in parallel using the `parallel()` method. This can lead to improved performance for operations that can be divided into independent tasks, like mapping or filtering.

   **Параллельная обработка**: Потоки могут обрабатываться параллельно с использованием метода `parallel()`. Это может привести к улучшению производительности для операций, которые можно разделить на независимые задачи, такие как маппинг или фильтрация.

Here's a simple example to demonstrate the use of streams:

Вот простой пример, демонстрирующий использование потоков:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

int sum = numbers.stream()
                 .filter(n -> n % 2 == 0)
                 .mapToInt(Integer::intValue)
                 .sum();

System.out.println("Sum of even numbers: " + sum);
```

In this example, we're creating a stream from a list of numbers. We filter out the odd numbers, convert the stream to an `IntStream`, and then calculate the sum of the even numbers.

В этом примере мы создаем поток из списка чисел. Мы фильтруем нечетные числа, преобразуем поток в `IntStream` и затем вычисляем сумму четных чисел.

Streams are particularly useful for scenarios where you want to perform various operations on a collection of data without resorting to traditional iterative approaches. They promote cleaner and more concise code, and they often lead to code that is more readable and easier to reason about.

Потоки особенно полезны в сценариях, где требуется выполнить различные операции с коллекцией данных без использования традиционных итерационных методов. Они способствуют более чистому и краткому коду, а также часто улучшают читаемость и понятность кода.

It's important to note that while streams can offer performance benefits, their use should be considered in the context of your specific application and use case. Not all scenarios require streams, and sometimes using traditional looping constructs might be more appropriate.

Важно отметить, что, хотя потоки могут предложить преимущества в производительности, их использование следует рассматривать в контексте конкретного приложения и сценария. Не все ситуации требуют использования потоков, и иногда использование традиционных циклов может быть более подходящим.

Read more: [Streams Tutorial](https://docs.oracle.com/javase/tutorial/collections/streams/index.html)

## Intermediate Operations (Промежуточные операции)

The general idea of intermediate operations "chained together" might already be somewhat familiar to you. This is how working with streams can be structured.

Общая идея промежуточных операций "в цепочке" вам уже слегка знакома. Именно так может быть устроена работа со строками.

- `filter(Predicate predicate)` filters the stream, allowing only the elements that meet the condition to pass through.

  `filter(Predicate predicate)` фильтрует поток, пропуская только те элементы, что проходят по условию

  `Predicate` is a built-in functional interface. It represents something that returns `true` or `false`, such as a lambda function.

  `Predicate` - встроенный функциональный интерфейс. "Что-то", возвращающее `true` или `false` - например, лямбда-функция;
- `map(Function mapper)` allows you to create a function that transforms each element into something else.

  `map(Function mapper)` даёт возможность создать функцию, с помощью которой мы будем превращать каждый элемент в какой-то другой

  The functional interface `Function<T,R>` represents a function that takes an object of type `T` and returns an object of type `R`.

  Функциональный интерфейс `Function<T,R>` представляет функцию перехода от объекта типа `T` к объекту типа `R`.
- `limit(long maxSize)` limits the stream to a maximum number of elements.

  `limit(long maxSize)` ограничивает поток по количеству элементов
- `skip(long n)` skips `n` elements.

  `skip(long n)` пропускает n элементов
- `sorted()` or `sorted(Comparator comparator)` sorts the stream.

  `sorted()` или `sorted(Comparator comparator)` сортирует поток
- `distinct()` returns only unique elements.

  `distinct()` возвращает только уникальные элементы

## Terminal Operations (Терминальные операции)

- `forEach(Consumer action)`

  `Consumer` is a functional interface representing an action to be performed on each element.

  `Consumer` - "Потребитель" - функциональный интерфейс, описывающий действие с каждым элементом.
- `count()` returns the number of elements in the stream.

  `count()` возвращает количество элементов потока
- `collect(Collector collector)` collects the elements into a list, set, or other collection, concatenates them into a string, etc.

  `collect(Collector collector)` собирает итог в список, множество или другую коллекцию, объединяет в строку...
- `findFirst()` retrieves the first element of the stream.

  `findFirst()` вытаскивает первый элемент стрима
- `allMatch(Predicate predicate)` returns `true` if all elements in the stream satisfy the `predicate` condition.

  `allMatch(Predicate predicate)` возвращает `true`, если все элементы стрима удовлетворяют условию `predicate`
- `anyMatch(Predicate predicate)` returns `true` if at least one element in the stream satisfies the `predicate` condition.

  `anyMatch(Predicate predicate)` возвращает `true`, если хотя бы один элемент стрима удовлетворяет условию `predicate`
- ``noneMatch(Predicate predicate)` returns `true` if no element in the stream satisfies the `predicate` condition.

  noneMatch(Predicate predicate)` возвращает `true`, если ни один элемент стрима не удовлетворяет условию `predicate`

## Collectors (Коллекторы)

Some collectors are already described in the `Collectors` class ([documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html)).

Некоторые коллекторы уже описаны в классе `Collectors` ([документация](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html)).

- `toList()` collects elements into a `List`.

  `toList()` собирает элементы в `List`
- `toSet()` collects elements into a set.

  `toSet()` cобирает элементы в множество
- `counting()` counts the number of elements.

  `counting()` подсчитывает количество элементов
- `joining()` concatenates elements into a single string.

  `joining()` собирает элементы в одну строку
   - `joining(CharSequence delimiter)`
   - `joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)`

## Example (Пример)

Let's take the numbers 50, 60, 70, 80, 90, 100, 110, 120.

Возьмём числа 50, 60, 70, 80, 90, 100, 110, 120.

We will select those less than 90.

Отберём те из них, которые меньше 90.

We will add 10 to each selected number.

Добавим к каждому отобранному по 10.

We will print the first three resulting numbers.

Распечатаем первые три получившихся числа.

Without streams (без потоков):
```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
int count = 0;
for (int x : arr) {
  if (x >= 90) {
    continue;
  }
  x += 10;
  count++;
  if (count > 3) {
    break;
  }
  System.out.println(x);
}
```

With streams, formatted for clarity (С потоками и красивыми переносами для большей понятности):
```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
Arrays.stream(arr)
    .filter(x -> x < 90)
    .map(x -> x + 10)
    .limit(3)
    .forEach(System.out::println);
```

With streams, but without formatting (С потоками, но без красивых переносов):
```java
IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10).limit(3).forEach(System.out::print);
```
