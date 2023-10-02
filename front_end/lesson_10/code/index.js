// ? Функции!

// вызов функций может быть выше ее объявления
hello();

// функция вернет 16 и в процессе выведет в консоль 'Hello, world!'
function hello() {
  console.log("Hello, world!");
  return 16;
}

// функция с параметрами

function sum(a, b, c) {
  return a + b + c;
}

// передача значения функции в переменную
let smth = hello();

// конкатенация строк: числовое значение переменной + строка
console.log(smth + "smth");

// приведения типов к строке во втором случае
console.log(sum(10, 10, "10"));

//функция сложения
function sum1(a, b) {
  return a + b;
}

//функция умножения
function multiply(a, b) {
  return a * b;
}

// функция деления
function devide(a, b) {
  return a / b;
}

// мы можем передавать в качестве параметров другие функции. и если надо параметры
function multiSum(f1, f2) {
  return f1(8, 4) + f2(2, 3);
}

//здесь мы передаем две без параметров и складываем их возвращенное значение
function multiSum1(f1, f2) {
  return f1() + f2();
}

// console.log(multiSum(devide(5, 5), multiply(3, 4)));

// * стрелочные функции

// когда мы используем стрелочные функции и не пишем кудрявые скобки функция  возвращает значение без return

const numberTwice = a => a ** 2;

const numberTwice2 = a => {
  a ** 2;
};

const buy = () => "buy!";

console.log(numberTwice(3));
//если вызывать стрелочную функцию с кудрявыми скобками, то нужен return
console.log(numberTwice2(3));

//вызов стрелочной функции без параметра
console.log(buy());

const helloWorld = (a, b) => {
  return a + b;
};

console.log(helloWorld("Hello, ", "world"));

const cities = ["London", "Paris", "Stockholm"];

//при таком объявлении функции не возможно поднятие hoisting, т.е
//вызов функции до ее объявления

const secondElement = function (arr) {
  //пример деструктуризации массива, берем третий по счету элемент
  const [first, sec, el] = arr;
  return el + " " + sec + " " + first;
};

console.log(secondElement(cities));

// ! объекты в JS

const obj = null;
const obj1 = undefined;

//чтобы безопасно обратиться к undefined или null, в случае когда мы
//что с бека к нам придет объект с ключами - используйте '?' перед обращением к ключу
console.log(obj?.id);
console.log(obj1?.id);

// присвоили объект переменной

const person = {
  firstName: "Donald",
  "second name": "Trump",
  isPresident: false,
  age: 55,
  children: {
    son: "John",
    daughter: "Ivanka",
  },
};

//распечатали объект через синтаксис с '.'
console.log(person.name);

//обратились к ключу записанному двумя словами через "[]"
console.log(person["second name"]);

//присвоили ключ переменной
const key = "isPresident";

//забрали значение по значению переменной
console.log(person[key]);

//через деструктуризацию мы можем объявить сразу несколько переменных
//и достать их из объекта в одну строчку
//значением переменных станут ключи объектов
const { isPresident, firstName } = person;

//обращение к значению
const age = person.age;

//здесь мы уже работаем с переменными со значениями из объекта
console.log(isPresident, firstName);
console.log(age);

// обращение к ключу объекта внутри объекта
console.log(person.children.daughter);

const brand = "opel";
const price = "35000$";

const car = { brand, price };

console.log(car);
console.log(parseInt(car.price));

//это объект у которого в качестве ключа записана функция
const dog = {
  name: "Rex",
  age: 8,
  bark() {
    console.log('Гав-гав!');
  }
};

//мы обращаемся к ней через знак '.'
dog.bark()

// получить все ключи объекта в виде массива
const dogKeys = Object.keys(dog)
// получить все значения объекта в виде массива
const dogValues = Object.values(dog)

console.log(dogValues);
console.log(dogKeys);

// важные методы для строк

const text = 'I cant hug you, I am just a text'

//методом split() разделяем строку по значению в скобках на массив значений
//методом reverse() разворачиваем полученный массив
//методом join объединяем массив по значению в скобках
const reversedWordsFromText = text.split(" ").reverse().join(' ')

//если в скобках указать пустые кавычки - строка разделится на буквы и каждая
//станет элементом в массиве
const cuttedText = text.split("")

console.log(cuttedText);

console.log(text);
console.log(reversedWordsFromText);

//приводим текст к нижнему регистру
console.log(text.toLowerCase());

//приводим текст к верхнему регистру
console.log(reversedWordsFromText.toUpperCase());

