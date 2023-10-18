// npm install -g ts-node - установка библиотеки для работы с TS без компиляции в JS
// чтобы запустить файл команда: ts-node + название файла (как было с node)
// sudo npm install -g ts-node - если нет разрешения на установку и ошибки в консоли. после напишите пароль в password
// ctrl + L - чтобы очистить консоль на windows
// если возникают ошибки при объявлении одинаковых переменных в соседних файлах
// пишем в начале файла: export {} и TS перестает ругаться
// командой npm install -g typescript можете установить глобально ts
// через 'tsc имя файла' можете запустить


console.log('welcome to ts');

// типы данных JS: string, number, boolean, undefined, null, bigint, symbol


// тип объявляется в момент объявления переменной
let x: string
x = 'Peter'

// TS запрещает нам присваивать значения другого типа
// x = 10 - это ошибка

x = String(10)

// способ присвоения типа вместе с объявлением переменной

let year: number = 1993

type Age = number

let myAge: Age = 30

// union type - можно присваивать выбор из нескольких типов через логическое 'или'
let yourAge: number | string = 19

// вы можете давать выбор не только из типов но и из отдельных значений
type Animal = 'cat' | 'dog'
let myPet: Animal = 'cat'

//расширяем тип Animal
type ExtendedPet = Animal | 'parrot'
let yourPet: ExtendedPet = 'parrot'

//можно не указывать тип при объявлении и типом станет тот, что будет у значения при инициализации
// ! но так не делается, это ведет к меньшей предсказуемости и читаемости

let wildAnimal = 'lion'

// типизация массивов через квадратные скобки [] и указания значения внутри массивов

// массив строк
let fruits: string[] = ['apple', 'pear', 'strawberry']

let vegetables: string[] = []
vegetables.push('tomato')
console.log(vegetables);

// можно типизировать массивы из всего! например из цифр
let answers: number[] = [1, 99, 100]

// * ключевые слова для объявления типов: 'type' и 'interface'



// * типизация объекта через type

//TS проверит наличие всех ключей и соответствие данных по ключам их типам
type User = {
  firstName: string
  isAdmin: boolean
  //указываем необязательное поле через '?', чтобы TS не ругался, если этого ключа не будет
  age?: number
}

// наследование типов (стало возможным в последних версиях TS)
type VipUser = User & {
  isVip: boolean
}

const user1: User = { firstName: 'Jack', isAdmin: true }

const vip: VipUser = { firstName: 'Jack', isAdmin: false, isVip: true }


// * типизация объекта через interface

interface IMagician {
  name: string
  hasWand?: boolean
  faculty: string
}

interface IBlackMagician extends IMagician {
  hasBlackMagic: true
}

const voldemort: IBlackMagician = {
  name: 'Voldemort',
  // hasWand: false,
  faculty: "Slytherin",
  hasBlackMagic: true
}

// ? Создайте интерфейс для объекта город City

// name
// population
// foundationDate - дата основания
// isRiver
// riverName - опциональный параметр

// создайте несколько объектов
// добавьте расширение touristicCity
// c параметрами isTouristic
// touristicName

// ! Типизация функций
// типизируем параметры и возвращаемое значение

//типизируем значения параметров в скобках
//и после скобок прописываем тип ожидаемого значения
function sum(a: number, b: number, c: string): string {
  return `${c} ${a + b}`
}

console.log(sum(33, 99, 'сумма'));

//типизация стрелочных функций
const dev = (a: number, b: number): number => a / b


// * Создайте функцию, которая принимает массив строк
// и возвращает 1 элемент массива

//Set-ExecutionPolicy -ExecutionPolicy Bypass -Scope CurrentUser
