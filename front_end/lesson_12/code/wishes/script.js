const wishForm = document.getElementById("wishForm");
const wishlist = document.getElementById("wishlist");
const buttonDel = document.getElementById("buttonDel");

// массив для наглядности, не зависит от DOM элементов 😶‍🌫️
const wishes = [];

//функция которая принимает параметр event
//и присваивает его ключу пустою строку (чистит input)
const clearInputs = function (event) {
  event.target.wish.value = "";
  event.target.amount.value = "";
};

const delLast = function () {
  if (wishlist.hasChildNodes()) {
    wishlist.lastChild.remove();
  }
};

wishForm.addEventListener("submit", event => {
  //этой строчкой мы меняем поведение "submit" по умолчанию - останавливаем перезагрузку
  event.preventDefault();

  //через обращение к переменной "event"
  // console.log(event.target.wish.value);
  // console.log(event.target.amount.value);
  const wish = {
    wish: event.target.wish.value,
    amount: event.target.amount.value,
  };

  wishes.push(wish);

  const textItem = document.createElement("p");
  textItem.innerText = `Я хочу ${wish.wish} и их ${wish.amount} шт`;
  wishlist.append(textItem);
  wishlist.classList.add("wish");
  clearInputs(event);
});

buttonDel.addEventListener("click", delLast);
