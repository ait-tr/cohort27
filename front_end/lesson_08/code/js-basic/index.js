"use strict" // строгий режим в js

// console.log('hello, world!');

//объявление переменных

//константу нельзя переназначить
const x = 'word'

//через let можно
let y = 'another word'

y = 77

console.log('y', y);

// 1. строки они же strings

let str1 = 'это строка'
let str2 = "тоже строка"
let str3 = `${str1} и это тоже строка`

console.log(str3);

// 2. числа они же numbers

let num1 = 2
let num2 = 2.2

console.log(typeof num2);

// 3. булевое значение boolean

let boolean1 = true
let boolean2 = false

boolean1 = 'что-то другое'

console.log(typeof boolean1);

// 4. undefined

let smth
console.log(smth);

/// 5. bigInt

console.log(Number.MAX_SAFE_INTEGER);
let bigInt = 9n

/// 6. symbol

let symbol = Symbol('smth')
console.log(symbol);

/// 7. null

let smth1 = null
console.log(typeof smth1);


/// неявное преобразование в строку
let num3 = 6 + ' '
console.log(typeof num3);

// явное превращение строки в число
let num4 = Number('10')
let stringy = '11'
console.log(num4);
//превращение переменной в число через +
console.log(+stringy);

// явное превращение числа в строку
let str4 = String(15)
// console.log(typeof str4);

let bool1 = Boolean(12)
console.log(bool1);


//равенство '=', '==', '==='

//нестрогое равенство, будет true (с приведением типов)
console.log(9 == 'девять');

//строгое - будет false
console.log(9 === '9');


let n1 = 1 + 1 // сложение
let n2 = 2 - 1 // вычитание
let n3 = 13 * 2 // умножение
let n4 = 14 / 2 // деление
let n5 = 31 % 2 // остаток при делении
let n6 = 3 ** 3

console.log(n5);
console.log(n6);
console.log(Math.sqrt(25));



console.log(9 !== +'9');
let thing = undefined


console.log(Math.random());


// массивы в js

let cities = ['London', 'Madrid', 'Paris', 15, bool1, true]
let cities1 = ['London', 'Madrid', 'Paris', 15]

console.log(typeof cities[3]);

let items = []
let items1 = new Array()

console.log(items1);

//это будет false, потому что это ссылочный тип и сравнивается не содержимое, это разные массивы
console.log(cities === cities1);

cities1[3] = "New York"

console.log(cities1);

const cities3 = ['Tashkent', ...cities1, 123]

console.log(cities3);

//распечать длинну массива
console.log(cities1.length);


for (let i = 0; i < cities1.length; i++) {
  console.log(cities1[i]);
}



