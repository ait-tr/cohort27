# Comparable и Comparator

* Оба - интерфейсы. Назначение - сравнение объектов любого типа.
* Сравнение - не equals!!! equals - проверяет только эквивалентность
* Comparable/Comparator - выясняют, кто больше, а кто меньше
* Применяется сортировка или выполняется поиск минимального и максимального

## Какие варианты?

* Мы написали решение для поиска минимального элемента в массиве чисел.
* Это было просто, потому что операция `<` строго определена для целых чисел.
* Вы можете для любой пары чисел с помощью простых операций сравнения определить, какое из больше или меньше, или они равны

```
<
>
==
```

* Но для произвольных объектов неясно, какие операции сравнения и как следует применять
* Если мы хотим написать один код для поиска минимума, то нужно переложить ответственность за само понятия "сравнения" на сам класс.
* Сам класс будет решать, какие объекты больше, а какие меньше.
* Тут нам на помощь приходит интерфейс `Comparable` (сравниваемый)
* Этот интерфейс - это просто соглашение (контракт) о том, как нужно сравнивать объекты между собой
* Предполагается, что из объекта `a` вызывается метод `compareTo` для объекта `b`, т.е.

```
a.compareTo(b) -> a ~ b мы сравниваем a и b
```

* А что будет результатом сравнения? `compareTo` обязывает вас вернуть целое число:

- отрицательное - объект `a` меньше объекта `b`
- ноль - объект `a` равен объекту `b`
- положительное - объект `a` больше объекта `b`

```
public interface Comparable<T> {

    
    public int compareTo(T o);
}
```

## С Comparable все понятно, а зачем нам нужен Comparator?

- Если вы хотите написать код для объектов, у которых нет `compareTo` (они не имплементируют `Comparable`)
- Вас не устраивает то, как сравнивают в самом классе объекты

* В этих двух случаях мы опишем логику сравнения отдельно от самих классов.

```
public interface Comparator<T> {
    int compare(T o1, T o2);
}
```

* Данный интерфейс работает по тем же правилам, что и `Comparable`, но!!! позволяет описать сравнение ДВУХ произвольных объектов

```
a ~ b

a.compareTo(b) мы будем писать не так
comparator.compare(a, b) -> отрицательное, положительное, ноль
```