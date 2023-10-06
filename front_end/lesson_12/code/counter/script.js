//здесь мы объявляем переменные и присваиваем им значения
//найденных по id элементов html
const sum = document.getElementById("sum");
const plus = document.getElementById("plus");
const minus = document.getElementById("minus");

//объявили счетчик через let
let counter = 0;

//вынесли в отдельную переменную стрелочную функцию
const minusHandler = () => {
  sum.innerText = --counter;
  //меняем цвет цвета
  sum.style.color = "red";
  minus.style.backgroundColor = "red";
  plus.style.backgroundColor = "";
};

const plusHandler = () => {
  counter++;
  sum.innerText = counter;
  //меняем цвет цвета
  sum.style.color = "blue";
  plus.style.backgroundColor = "blue";
  minus.style.backgroundColor = "";
};

//вызвали слушателей событий
minus.addEventListener("click", minusHandler);
plus.addEventListener("click", plusHandler);

// plus.addEventListener('click', ()=> {
//   counter += 1
//   sum.innerText = counter
// })

// * document.getElementById('sum').innerText = counter
// * сверху равнозначная, но громоздкая запись
