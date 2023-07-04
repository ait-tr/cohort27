# Lesson 41 - 30/06/2023

* Связные списки
* Оберточные типы
* Generics

## Глобально

* Списки нужны для того, чтобы хранить элементы
* Иметь доступ к ним
* Очень похожи на массивы, но имеют дополнительный функционал, который делает работы с ними проще
* В Java есть встроенные списки, но мы пишем свои.
* Стандартный набор операций списка:

- положить в конец
- положить в начало
- положить по индексу
- получить по индексу
- удалить
- и т.д.

* Реализовать списки можно по-разному:

1. На основе массива (MyArrayList):

```
elements[count] = element;
count++;
```

2. На основе узлов (связный список, LinkedList)

## Generics

* Объявление

```
class MyLinkedList<T> {
...
}

public static class Node<E> {
...
}
```

* Использование

```
MyArrayList<Integer>
Node<T> first;
```

* При объявлении может быть любая буква, при использовании - конкретный известный тип

### Чего же мы добились?

```
public static <T> void print(MyList<T> list)
```

* У нас цель - распечатать элементы какого-либо списка.
* У нас есть две возможные реализации списка
  * LinkedList - список на основе узлов, быстро добавляет в начало и конец, медленно получает по индексу
  * ArrayList - медленно добавляет в начало, но быстро получает по индексу
* Методу `print` не важно, как устроен список, главное, чтобы у него были методы:
  * `getCount` - получить количество
  * `get(int index)` - получить элемент по индексу
* Оба этих метода мы описали в интерфейсе MyList, и именно такой тип имеет параметр метода `print`
* Поскольку `ArrayList` и `LinkedList` имплементируют (реализуют) интерфейс `MyList`, то они являются его потомками
* По правилу восходящего преобразования мы можем передать их в качестве аргументов в `print`
* Мы хотим, чтобы в список строк нельзя было положить число, а в список чисел - строку
* Поэтому используем Generics

* `MyIterable` - интерфейс, который говорит, что класс, имплементирующий этот интерфейс можно пробежать итератором
* `MyIterator` - интерфейс, который говорит, что класс, имплементирующий этот интерфейс может пробежать последовательно какую-либо коллекцию