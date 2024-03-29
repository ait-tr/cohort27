# Класс Object и для чего нужен?

* Нужен для того, чтобы гарантировать какое-то поведение для всех классов в Java
* Есть определенные требования ко всем классам, и чтобы их можно было удовлетворить (заставить) - нужно сделать суперпредка.
* Object - предок всех классов по-умолчанию.

## Какое поведение есть у Object?

### toString

* `String toString()` - метод, который определен в классе `Object` и, соответственно есть у всех других классов.
* Данный метод позволяет получить строковое представление объекта. Вы можете воспользоваться тем, что есть в Object, а можете написать свой.
* Если класс не имеет собственного `toString`, то при получении строки от объекта вашего класса мы получим запись вида:

```
example01.Human@5e9f23b4
```

* Почему так? - В классе `Object` `toString` реализован вот так:

```
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
```

* Берем имя класса (с пакетом) + `@` + шестнадцатиричное представление хеш-кода объекта.
* Хеш-код - числовое представление объекта (изучим потом, когда будем смотреть коллекции в Java)

* А где у нас на практике использовался `toString`?
* В `System.out.println(Object x)`
* Как он работает?

```
String s = String.valueOf(x); // получить из объекта строку
print(s); // напечатать строку
```

* Как работает `valueOf`?

```
 public static String valueOf(Object obj) {
        if (object == null) {
            return "null";
        } else {
            return obj.toString();
        }
    }
```

### equals()

* Если вы сравниваете две переменные ссылочных типов через `==` - происходит сравнение адресов переменных.
* Если у вас нет собственного `equals`, то вызывается `equals` определенный в классе `Object`:

```java
public boolean equals(Object obj) {
        return (this == obj);
    }
```

* Он просто сравнивает адреса через `==`
* Хотим нормальный `equals` - нужно написать его самостоятельно