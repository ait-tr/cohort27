# Lesson 10

## 00. Разбор домашнего задания

* Блок-схема `Task12`

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_10/img/1.png)

## 01. Решение задач

* Блок-схема `Ex10` для случая с двумя числами (см. код)

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_10/img/2.png)

## 02. Цикл `for` и области видимости

* Цикл `for` имеет следующий синтаксис: 

```
for (объавление/инициализация переменной; условие окончания цикла; манипуляции над переменной) {
        // тело цикла
}
```

* Области видимости:

```
{
        int a;
        {
                int b;
                // переменная <a> доступна
                {
                        // переменные <a> и <b> доступны
                }
        }
        // переменная <b> недоступна
}
```

