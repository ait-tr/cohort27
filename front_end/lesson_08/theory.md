## JS intro

## Примитив (значение примитивного типа, примитивный тип данных)
Примитив - это данные, которые не являются объектом и не имеют методов. В JavaScript имеется 7 простых типов данных: string, number, boolean, null, undefined, symbol (новое в ECMAScript 2015), bigint.

##  Преобразование типов (coercion)
Когда сравниваются разные типы, движок JavaScript производит попытку привести тип одного элемента к типу другого, чтобы он мог их сравнить

## Два способа создания пустого массива
  -  let arr = new Array();
   let arr = [];
   - // В квадратных скобках можно сразу указать начальные значения
   - let fruits = ["Apple", "Orange", "Banana"];

- Можно получить элемент по индексу
let fruits = ["Apple", "Orange", "Banana"];
- Получим нулевой элемент
console.log(fruits[0]); // Apple

- Можно получить элемент по индексу
let fruits = ["Apple", "Orange", "Banana"];
-  Можно заменить элемент по индексу
fruits[0] = "Mango"
console.log(fruits[0]); // ["Mango", "Orange", "Banana"];
