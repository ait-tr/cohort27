# Lesson 24

## 00. Немного о конструкторах

* Java создает пустой конструктор по-умолчанию, даже если его нет в явном виде.
* Любой написанный программистом конструктор заменяет тот, который сделала Java.
* Из одного конструктора можно вызвать другой, с помощью `this(...)`.
* Полностью одинаковые конструкторы быть не могут.

## 01. Концепция связных списков (linked list)

## Узел (node)

* Узел, это объект, который имеет два поля:
  * значение, которое хранит узел (`value`)
  * ссылка на другой узел (`next`)

* Таким образом, мы имеем цепочку объектов, каждый из которых знает расположение в памяти другого объекта
* Получение следующего узла после текущего для полного обхода всех узлов:

```
current = current.next;
```

* Внутренняя структура узлов:

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_24/img/1.png)

* Простое представление:

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_24/img/2.png)

* Обход узлов:

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_24/img/3.png)

* Добавление узла в цепочку (см. Dictionary.java)

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_24/img/4.png)


