# Lesson 26

* Что и для чего? - исследуем различные реализации списков, списки нам нужны, чтобы хранить какую-либо информацию
* Какие могут быть задачи - телефонная книга, список email-ов для рассылки, список телефонов для отправки смс

## 01. Список на основе массива (ArrayList) 

* `example01.MyArrayList`

* Добавление элементов
* Удаление элементов
* Получение элемента по индексу
* Автоматическое расширение массива

* Но есть определенные проблемы с такой реализацией
  * Добавление в начало - долгая операция из-за необходимости сдвига элементов

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_26/img/1.png)

* Главная особенность массива - память выделяется блоком. Например, сделали массив из 10 элементов, значит в памяти эти десять элементов будут лежать друг за другом, поэтому массивы нельзя расширять

## 02. Список на основе узлов (связный список, LinkedList)

* Общая структура связного списка

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_26/img/2.png)

* Упрощенный вид с указателем на первый элемент

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_26/img/3.png)

* Добавление элемента в начало

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_26/img/4.png)

* Добавление элемента в конец с помощью цикла

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_26/img/5.png)

* Добавление элемента в конец с помощью указателя на последний элемент

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_26/img/6.png)
