// асинхронный код vs синхронный код

console.log('hello!');

//пример асинхронного кода, выполнится через 3 секунды
setTimeout(() => {
  console.log('buy!');
}, 3000)

// ! любой асинхронный код сработает после синхронного, даже если 0 сек в setTimeout()

setTimeout(() => {
  console.log('orange');
}, 0)

console.log('apple');


/// создайте функцию clapHands()
// чтобы она через 2 секунды вывела в консоль "Clap!"
// а через 7 секунд вывела  "Bravo!"

function clapHands() {
  setTimeout(() => {
    console.log("Clap!");
  }, 2000);
  setTimeout(() => {
    console.log("Bravo!");
  }, 7000);
}

clapHands();
