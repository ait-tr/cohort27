// * Методы массивов




const brothers = [
  { race: "elf", age: 2000, height: 190, name: "Legolas" },
  { race: "human", age: 160, height: 179, name: "Aragorn" },
  { race: "dwarf", age: 200, height: 45, name: "Ghimli" },
  { race: "human", age: 500, height: 185, name: "Gendalf" },
  { race: "hobbit", age: 80, height: 110, name: "Frodo" },
];

console.log(brothers);






// * 1. метод map()

// мы проитерировались по элементам и с каждым что-то сделали, в данном случай взяли имя по ключу name
// на каждой итерации создается новый элемент массива
// НЕ мутирующий метод, возвращает новый массив
const names = brothers.map(el => el.name);

//здесь мы уже взяли два элемента и добавили строки.
// и в итоге получили новый массив
const namesAge = brothers.map(el => "My name is " + el.name + ", I am " + el.race);

console.log(names);
console.log(namesAge);
console.log(brothers);

// изменение старого массива при определенном условии через if
// ! не забудьте return и кудрявые скобки
const sizes = brothers.map(brother => {
  if (brother.height >= 120) {
    return "Высокий";
  }
  return "Маленький";
});
console.log(sizes);

// изменение старого массива при определенном условии через тернарный оператор
// без return и кудрявых скобок
const newSizes = brothers.map(el => (el.height >= 120 ? "big" : "small"));
console.log(newSizes);

const odd = [1, 3, 5, 6, 8, 7];

//делаем из массива случайных чисел массив четных чисел
const even = odd.map(el => (el % 2 === 0 ? el : el + 1));
console.log(even);






// * 2. Метод reduce() метод

// мы создаем новый элемент
// берем начальное значение в виде второго аргумента (если его ент то начальным значением станет 1й элемент),
// мы по очереди взаимодействуем с каждым элементов и что-то с ним делаем
// это может быть любое допустимое действие

//из 100 по очереди вычитаем нечетные числа из массива Odd
const oddReduced = odd.reduce((acc, el) => acc - el, 100);

//из массива имен героев достаем по имени, складываем и получаем строку
const namesReduced = names.reduce((acc, el) => acc + el + ", ", "Братство кольца: ").slice(0, -2);

console.log(oddReduced);
console.log(namesReduced);


// ! способ через map() скопировать старый массив объектов и добавить в него новый ключ
// ! копируем через spread оператор ...el и дописываем что хотим
// так элемент за элементом копируется наш массив

const heroes = brothers.map(el => {
  return {...el, heroes:true}
});

//brothers остался без изменений
console.log(brothers);

//новые массив с новым ключом
console.log(heroes);





// * 3. методы slice() и splice()

// ? slice() отрезает и оставляет отрезанное
// в нем 2 параметра: 1. индекс элемента с которого отрезает 2. до которого отрезает
// возвращает новый массив
// метод подходит для строк
// ? оставляет старый массив без изменений
//начиная с индекса 2 включительно и до 4 индекса не включительно



//один фродо
const namesSliced1 = names.slice(4, 5)

//оставляем всех кроме фродо
const namesSliced2 = names.slice(0, 4)

//оставляем только фродо короткой записью
const namesSliced3 = names.slice(-1)


console.log(names);
console.log(namesSliced1);
console.log(namesSliced2);
console.log(namesSliced3);





// ? метод splice() мутирует старый массив и вырезает из него элементы
// первый аргумент - индекс откуда вырезать
// второй колличество вырезанных элементов от индекса
// ! мутирует старый массив

console.log('старый массив',names);

//работа с двумя параметрами
//второй это КОЛЛИЧЕСТВО удаляемых элементов
// const namesSpliced = names.splice(1,1)

// console.log(names);
// ! если не указывать второй параметр он удаляет начиная с указанного индекса и до конца
const namesSpliced1 = names.splice(2)

console.log(namesSpliced1);
console.log(names);




// *  4. filter() и find()


// возвращает новый массив элементов, которые удовлетворяют условию
// одному или нескольким
// ! если такой элемент один, то он все равно вернется в массиве под индексом 0
console.log(brothers.filter(el => el.age > 1000));

// проверяем по двум условиям и фильтруем по ним
console.log(brothers.filter(el => (el.height > 120) && (el.age > 100)));

//возвращает первый элемент в массиве который удовлетворяет условию
//если такого элемента нет - возвращает undefined
console.log(brothers.find(el => el.age === 2000));



