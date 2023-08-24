# Collections (Коллекции)

## `List`

### `ArrayList`

`ArrayList` implements the `List` interface.

`ArrayList` реализует интерфейс `List`.

Allows storing any data, including `null`, as an element. As you can guess from the name, its implementation is based on a regular array.

Позволяет хранить любые данные, включая `null`, в качестве элемента. Как можно догадаться из названия, его реализация основана на обычном массиве.

This implementation should be used if frequent access to elements by index is expected during collection manipulation. Due to the implementation specifics, indexing elements is done in constant time O(1). However, it's recommended to avoid using this collection if frequent insertion/removal of elements in the middle of the collection is required.

Данную реализацию следует применять, если в процессе работы с коллекцией предплагается частое обращение к элементам по индексу. Из-за особенностей реализации поиндексное обращение к элементам выполняется за константное время O(1). Но данную коллекцию рекомендуется избегать, если требуется частое удаление/добавление элементов в середину коллекции.

Learn more (Подробнее): [Структуры данных в картинках. `ArrayList`](https://habr.com/ru/articles/128269/)

### `LinkedList`

`LinkedList` is another implementation of the `List` interface. It allows storing any data, including `null`. The key feature of this collection's implementation is that it is based on a doubly-linked list (each element has references to the previous and next elements). Because of this, adding and removing from the middle, accessing by index or value, takes linear time O(n), while adding and removing from the beginning and end takes constant time O(1).

`LinkedList` — ещё одна реализация `List`. Позволяет хранить любые данные, включая `null`. Особенностью реализации данной коллекции является то, что в её основе лежит двунаправленный связный список (каждый элемент имеет ссылку на предыдущий и следующий). Благодаря этому, добавление и удаление из середины, доступ по индексу, значению происходит за линейное время O(n), а из начала и конца за константное O(1).

Learn more (Подробнее): [Структуры данных в картинках. `LinkedList`](https://habr.com/ru/articles/127864/)

## `Set`

### `HashSet`

`HashSet` is an implementation of the `Set` interface based on `HashMap`. It uses the `HashMap` object internally for data storage. The added element is used as the key, and a dummy object (`new Object()`) is used as the value. Due to implementation specifics, the order of elements is not guaranteed upon addition.

`HashSet` — реализация интерфейса `Set`, базирующаяся на `HashMap`. Внутри использует объект `HashMap` для хранения данных. В качестве ключа используется добавляемый элемент, а в качестве значения — объект-пустышка (`new Object()`). Из-за особенностей реализации порядок элементов не гарантируется при добавлении.

### `TreeSet`

`TreeSet` is an implementation of the `Set` interface that is based on [red-black trees](https://en.wikipedia.org/wiki/Red–black_tree). By default, the collection is sorted according to the keys using "natural ordering," but this behavior can be customized for a specific task using a `Comparator` object, provided as a parameter when creating a `TreeSet` object.

`TreeSet` - реализация интерфейса `Set`, основанная
на [красно-чёрных деревьях](https://ru.wikipedia.org/wiki/Красно-чёрное_дерево). По умолчанию коллекция сортируется по ключам с использованием принципа "natural ordering", но это поведение может быть настроено под конкретную задачу при помощи объекта `Comparator`, который указывается в качестве параметра при создании объекта `TreeSet`.

# Time Complexity of Operations (Временная сложность операций)

| Collection   | Index  | Search   | Insertion | Deletion |
|--------------|--------|----------|-----------|----------|
| Коллекция    | Индекс | Поиск    | Вставка   | Удаление |
| `ArrayList`  | O(1)   | O(n)     | O(n)      | O(n)     |
| `LinkedList` | O(n)   | O(n)     | O(1)      | O(1)     |
| `ArrayList`  | O(1)   | O(n)     | O(n)      | O(n)     |
| `HashSet`    | n/a    | O(1)     | O(1)      | O(1)     |
| `TreeSet`    | n/a    | O(log n) | O(log n)  | O(log n) |

## Overview of Interface Relationships and Their Implementations (Общая схема взаимосвязи интерфейсов и их реализаций)

![](https://github.com/ait-tr/cohort26/raw/main/basic_programming/lesson_55/img/collections-framework-overview.png)

## `Map`

### `HashMap`

`HashMap` is an implementation of a data structure called a hash table. It allows using `null` as both a key and a value. This collection is not ordered; the order of stored elements depends on the hash function. Adding an element takes constant time O(1), but the time for deletion and retrieval depends on the hash function distribution. Ideally, it's constant, but it can be linear O(n).

`HashMap` — реализация такой структуры данных, как хэш-таблица. Позволяет использовать `null` как в качестве ключа, так и значения. Данная коллекция не является упорядоченной: порядок хранения элементов зависит от хэш-функции. Добавление элемента выполняется за константное время O(1), но время удаления, получения зависит от распределения хэш-функции. В идеале является константным, но может быть и линейным O(n).

Learn more (Подробнее): [Структуры данных в картинках. `HashMap`](https://habr.com/ru/articles/128017/) (актуально для Java < 8).

### `TreeMap`

`TreeMap` is a `Map` implementation based on [red-black trees](https://en.wikipedia.org/wiki/Red–black_tree). It's ordered. By default, the collection is sorted according to the keys using "natural ordering," but this behavior can be customized for a specific task using a `Comparator` object, provided as a parameter when creating a `TreeMap` object.

`TreeMap` — реализация `Map`, основанная на [красно-чёрных деревьях](https://ru.wikipedia.org/wiki/Красно-чёрное_дерево). Является упорядоченной. По умолчанию, коллекция сортируется по ключам с использованием принципа "natural ordering", но это поведение может быть настроено под конкретную задачу при помощи объекта `Comparator`, который указывается в качестве параметра при создании объекта `TreeMap`.

## Очередь (Queue)

Idea: **FIFO (First-In-First-Out)** - the first added element should be the first to leave the collection.

Идея: **FIFO (last-in-first-out)** - первый добавленный элемент должен первым покинуть коллекцию.

### `Queue`

This interface describes collections with a predefined way of inserting and extracting elements, namely FIFO (First-In-First-Out) queues. In addition to methods defined in the `Collection` interface, it defines additional methods for extracting and adding elements to the queue.

Этот интерфейс описывает коллекции с предопределённым способом вставки и извлечения элементов, а именно — очереди FIFO (first-in-first-out). Помимо методов, определённых в интерфейсе `Collection`, определяет дополнительные методы для извлечения и добавления элементов в очередь.

Example implementations: `LinkedList`, `PriorityQueue`.

Пример реализации: `LinkedList`, `PriorityQueue`.

### `Deque`

Interface. Allows adding and removing elements both at the beginning and the end of the queue.

Интерфейс. Позволяет добавлять и удалять элементы и в начало, и в конец очереди.

Example implementation: `LinkedList`.

Пример реализации: `LinkedList`.

### `PriorityQueue`

Concrete class. This queue's special feature is the ability to control the order of elements. By default, elements are sorted using "natural ordering," but this behavior can be overridden using a `Comparator` object provided when creating the queue. This collection doesn't support `null` as elements.

Конкретный класс. Особенностью данной очереди является возможность управления порядком элементов. По умолчанию, элементы сортируются с использованием «natural ordering», но это поведение может быть переопределено при помощи объекта `Comparator`, который задаётся при создании очереди. Данная коллекция не поддерживает `null` в качестве элементов.

## Стек (Stack)

Idea: LIFO (Last-In-First-Out) - the last added element should be the first to leave the collection.

Идея: LIFO (last-in-first-out) - последний добавленный элемент должен первым покинуть коллекцию.

### `Stack`

Concrete class. `Stack` is an implementation of a **LIFO (Last-In-First-Out)** stack. Since Java 1.6 introduced the `Deque` interface, it's recommended to use implementations of this interface, such as `ArrayDeque`.

Конкретный класс. `Stack` — Реализация стека **LIFO (last-in-first-out)**. После добавления в Java 1.6 интерфейса `Deque`, рекомендуется использовать именно реализации этого интерфейса, например `ArrayDeque`.

### `ArrayDeque`

`ArrayDeque` is an implementation of the `Deque` interface, which extends the `Queue` interface with methods that allow implementing a **LIFO (Last-In-First-Out)** structure.

`ArrayDeque` — реализация интерфейса `Deque`, который расширяет интерфейс `Queue` методами, позволяющими реализовать конструкцию вида **LIFO (last-in-first-out)**.

This collection is implemented using arrays, similar to `ArrayList`, but it doesn't allow indexing elements and storing `null`. As stated in the documentation, it performs faster than `Stack` when used as a LIFO collection and faster than `LinkedList` when used as a FIFO collection.

Эта коллекция представляет собой реализацию с использованием массивов, подобно `ArrayList`, но не позволяет обращаться к элементам по индексу и хранение `null`. Как заявлено в документации, коллекция работает быстрее, чем `Stack`, если используется как LIFO коллекция, а также быстрее,
чем `LinkedList`, если используется как FIFO.

# Временная сложность операций

| Collection                       | Index  | Search   | Insertion                                          | Deletion                                                 |
|----------------------------------|--------|----------|----------------------------------------------------|----------------------------------------------------------|
| Коллекция                        | Индекс | Поиск    | Вставка                                            | Удаление                                                 |
| `HashMap`                        | n/a    | O(1)     | O(1)                                               | O(1)                                                     |
| `TreeMap`                        | n/a    | O(log n) | O(log n)                                           | O(log n)                                                 |
| Queue (theoretical)              | n/a    | n/a      | at the beginning (в начало) - O(1)                 | of the last (последнего) - O(1)                          |
| Double-ended queue (theoretical) | n/a    | n/a      | at the beginning and end (в начало и конец) - O(1) | of the first and last (первого и последнего) - O(1)      |
| Stack (theoretical)              | n/a    | n/a      | at the end (в конец) - O(1)                        | of the last (последнего) - O(1)                          |
| `PriorityQueue`                  | n/a    | O(log n) | O(log n)                                           | of the last (последнего) - O(1), any (любого) - O(log n) |
