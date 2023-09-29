// ? random numbers / deep copy / basic array methods / logic operators


// * случайное число через Math.random()

const randomNumberFloat = Math.random()

// случайное целое число через Math.floor(Math.random())

const randomNumberRegular = Math.floor(Math.random() * 10) + 1

console.log(randomNumberFloat);
console.log(randomNumberRegular);

// случайный элемент по индексу массива

function getColor() {
  const colors = ['red', 'green', 'blue', 'yellow']
  return colors[Math.floor(Math.random() * colors.length)]
}

console.log(getColor());



//* spread operator и  structuredClone()


const exoticFruits = ['pineapple', 'cocos', ['kiwi', 'banana']]
const fruits = ['apple', 'orange']


// spread operator делает поверхностное копирование
const cloneFruits = [...fruits, ...exoticFruits]

console.log(cloneFruits);

exoticFruits[2][0] = 'grape'
fruits[0] = 'grapefruit'

console.log(exoticFruits);
console.log(fruits);
console.log(cloneFruits);

// structuredClone() делает глубокое копирование с вложенностью

const newClonedFruits = structuredClone(exoticFruits)

exoticFruits[2][0] = 'pizza'

console.log(exoticFruits);
console.log(newClonedFruits);

const a = [1, 2, 3]
const b = a
b[0] = 4
console.log(b);
console.log(a);


// ! приведение типов Number() и parseInt()

let str = '1235abc456'

console.log(Number(str));
console.log(parseInt(str));
console.log(typeof NaN);

let variable

console.log(variable);


// * методы на добавление и удаление элементов из массива

// метод push() добавляет элемент в конец массива и возвращает длину получившегося массива

const cars = ['opel', 'kia', 'bmw', 'audi']
const returned = cars.push('tesla')

console.log('массив с новым элементом =>>', cars);
console.log('возвращает длину измененного массива ==>>', returned)

// метод unshift() добавляет элемент в начало массива и возвращает длину получившегося массива

const returned1 = cars.unshift('mercedes')
console.log('массив с новым элементом =>>', cars);
console.log('возвращает длину измененного массива ==>>', returned1)

// метод pop() удаляет из конца массива и возвращает удаленный элемент


console.log('до удаления', cars);

// массив удаленных элементов
const deletedCars = []


deletedCars.push(cars.pop()) // одним действием мы добавили элемент и удалили
console.log('deleted ===>', deletedCars);


console.log('после удаления', cars);

// метод shift() удаляет элемент из начала массива и возвращает удаленный элемент

console.log(cars);
cars.shift()
console.log('после второго удаления', cars);


// создайте новый массив и поменяйте первый и последний элементы местами
const cars1 = ['opel', 'kia', 'bmw', 'audi']



// ! логические операторы в JS

// '>' - больше, '<' - меньше, '<=' - меньше или равно, '>=' - больше или равно

let age = 18
let hasLicense = true

//пример условного оператора if с логическим 'и' &&

if (age >= 18 && hasLicense) {
  console.log('You can drive a car');
} else {
  console.log("Не садись за руль");
}

// логическое нет '!' меняет булевое значение на противоположное

let isLoggedOut = true

if (!isLoggedOut) {
  console.log('Пользователь вошел в систему');
} else {
  console.log('Пользователь не в системе');
}

// тернарный оператор отвечает за условное ветвление, если значение верно возвращается элемент после '?'
// если значение false - после ':'

let myAge = 10
let canVote = myAge >= 16 ? 'yes' : 'no'

console.log(`Могу ли я проголосовать? ${canVote}`);


let isUser = true


// если условие верное возвращается первое значение, а если нет, то второе
console.log('возвращенное значение', true ? 'yes' : 'no' );

// работа оператора '&&' => если до && выражение верно - вернется второе значение
console.log(5 + 10 === 15 && 'строка отобразится');

console.log(false && 'строка не отобразится');


let person = undefined
let person1 = {name: 'igor'}

// не забывайте ? перед точкой, когда будете обращаться к объекту которого может не существовать (например он может не придти с бека и иметь значение undefined)

console.log('ошибка вернется или нет?', person?.role && 'строка не отобразится');


//  логическое или

let isWeekend = true
let isHoliday = false

if (isWeekend || isHoliday) {
  console.log('Можешь отдыхать ;)');
}


// в случае если у объекта есть свойство, то оно вернется, а если нет вернется Вася
const me = person1?.name || 'Вася'

console.log('имя из логического или ==>', me);



// * цикл while

let i = 0
arr = []

while (i < 5) {
  arr.push(i)
  i++
}

console.log(arr);

// * цикл for

let colors1 = ['red', 'blue', 'green']

for (let i = 0; i < colors1.length; i++) {
  console.log(colors1[i]);
}
