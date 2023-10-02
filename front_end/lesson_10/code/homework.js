// задание 1.

//создали массив
const cities =  ["London", "Paris", "Berlin", "Madrid"]

//создали новый
const newCities = []

//прошлись for c конца
for (let i = cities.length- 1; i>= 0; i--) {
  newCities.push(cities[i])
}

// console.log(newCities);


//с помощью spread оператора '...' сделали одномерную копию старого массива
//и переставили элементы задом наперед
const newCities2 = [...cities].reverse()

//метод который создает новую копию старого массива
const newCities3 = cities.toReversed()

console.log(cities);
console.log(newCities2);
console.log(newCities3);

// задание 2.

const numbers = []
numbers.push(1)
numbers.push(2)
numbers.push(3)
numbers.pop()

console.log(numbers);

const newNumbers = [0, ...numbers]

console.log(newNumbers);

const random = Math.floor(Math.random() * (999 - 99 + 1)) + 99

newNumbers.unshift(random)

console.log(newNumbers);


//  задание 3.
const jedi = []
const elements = ["Yoda", "Obi-Wan", "Qui-Gon"]

let i = 0

// while (i < elements.length) {
//   jedi.push(elements[i])
//   i++
// }

while (jedi.length < 3 ) {
  jedi.push("Yoda", "Obi-Wan", "Qui-Gon")
}

jedi.shift()

console.log(jedi);

const newJedi = [...jedi, 'Anakin']


// const droid =  {name: 'R2-D2', type: 'droid'}

// console.log(`На планете ${newJedi.length} джедаев и их зовут: ${newJedi[0]}, ${newJedi[1]}, ${newJedi[2]}`);

console.log(`На планете ${newJedi.length} джедаев и их зовут: ` + newJedi.join(", "));

// console.log(`На планете ${newJedi.length} джедаев и их зовут: ${droid}`);
