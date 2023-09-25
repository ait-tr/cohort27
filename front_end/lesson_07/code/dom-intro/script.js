// вывод данных в консоль
console.log('hello, js!');

//объявление переменной 1 способ, можно изменить значение
let x = 2
x = 4

console.log('x ==>', x);

//объявление переменной 2 способ, значение нельзя изменить

// const y = 10
// y = 12

// console.log('y ===>', y);

console.log('распечатается ли этот текст?');

//DOM: Document Object Model

//способ найти элемент по id и добавить его в переменную
const btnElement = document.getElementById('btn1')
const btnElementText = 'текст который я вывожу в консоль!'
console.log(btnElementText, 'между переменными', btnElement);

//способ найти элементы по тэгу и добавить их в переменную
let pElementsByTag // сначала объявили переменную
pElementsByTag = document.getElementsByTagName('p') // потом присвоили значение
console.log('pElementsByTag', pElementsByTag);

//способ найти элементы по классу
const pElementsByClass = document.getElementsByClassName('paragraph')
console.log('pElementsByClass', pElementsByClass);

//информация об объекте document
console.log('document', document);

//объявил переменную счетчик через let
let counter = 0

btnElement.addEventListener("click", () => {
  // создание нового элемента
  const newHeading = document.createElement('h1')
  // <h1></h1>

  //увеличил на 1 и перезаписал переменную
  counter += 1
  // добавление текста с переменной через косые ковычки
  newHeading.innerText = `наш первый элемент созданный в js номер ${counter}`
  // <h1>'наш первый элемент созданный в js'</h1>

  newHeading.id = 'newHeading'
  newHeading.className = 'newHeading'
  newHeading.style.color = 'red'
  newHeading.style.fontSize = '30px'

  console.log(newHeading);

  //добавление на страницу в body
  document.body.appendChild(newHeading)

  console.log(counter);
})

// объявляем переменную и через метод getElementById()
const btn2 = document.getElementById('btn2')

//если нужно можем проверить содержимое переменной в консоли. на элементы на странице НЕ ПОВЛИЯЕТ!
console.log(btn2);

//обращаемся к переменной с элементом и вещаем обработчик событий с аргументами:
//1. тип события,
//2. функция с кодом, который нужно выполнить по событию

const helloDom = document.getElementById('hello')

btn2.addEventListener('click', () => {
  helloDom.innerText = 'Это не DOM 2'
  helloDom.className = 'mainHeading'
})

const btn3 = document.getElementById('btn3')

btn3.addEventListener('click', () => {
  //удаляем выбранный в переменной элемент. мы положили его в переменную на 70 строке
  helloDom.remove()
})

const btn4 = document.getElementById('btn4')

btn4.addEventListener('click', () => {
  //удаляем выбранный в переменной элемент. мы положили его в переменную на 70 строке
  const clonedButton = btnElement.cloneNode(true)
  console.log(clonedButton);
  document.body.appendChild(clonedButton)
  //добавили id
  clonedButton.id = 'clonedButton'
  //изменили текст
  clonedButton.innerText = 'нажми меня и получишь зеленый заголовок'
  //вещаем обработчик на новую кнопку
  clonedButton.addEventListener('click', () => {
    // создание нового элемента
    const newHeading = document.createElement('h1')
    // <h1></h1>

    // добавление текста
    newHeading.innerText = 'наш первый элемент созданный в js'
    // <h1>'наш первый элемент созданный в js'</h1>

    newHeading.id = 'newHeading'
    newHeading.className = 'newHeading'
    newHeading.style.color = 'green'
    newHeading.style.fontSize = '30px'

    console.log(newHeading);

    //добавление на страницу в body
    document.body.appendChild(newHeading)
  })
})

const btn6 = document.getElementById('btn6')
const hiddenButton = document.getElementById('btn5')

btn6.addEventListener('click', () => {
  hiddenButton.setAttribute('class', 'visible')
})




// btn2.addEventListener('click', () => {
//   const tagsH1 = document.getElementsByTagName('h1')
//   tagsH1[0].innerText = 'Это не DOM 2'
//   tagsH1[0].className = 'mainHeading'
// })
