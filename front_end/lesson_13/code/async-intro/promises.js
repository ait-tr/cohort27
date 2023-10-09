// promise - обещания

function getUser() {
  setTimeout(() => {
    return "user!";
  }, 3000);
}

let user = getUser();

// ! получим undefined если будем вызывать в консоль
// ! асинхронный код без обработки promise

console.log(user); //undefined

//для корректной обработки "обещанных" данных
//в функции нужно создавать обещание этих данных
function getUserPromise() {
  //передаем два параметра на случай успешной обратки resolve
  // и не успешной rejected
  return new Promise(function (resolve, reject) {
    setTimeout(() => {
      resolve("user!");
    }, 3000);
  });
}

//кладем в переменную 'обещание', чтобы после обратиться к ней через .then()
const promise = getUserPromise();

// если распечатать promise без then мы не увидим данных
// но увидим что в переменной лежит 'обещание'
console.log(promise);

// Promise { <pending> }
// pending - ожидание
// resolve - успех, данные пришли
// reject - ошибка, не удалось обработать данный (отклонено)

//мы обращаемся к переменной с promise
// через метод .then() и в стрелочной функции выполняем работу
// с обещанными данными
promise.then(user => {
  console.log(user);
});

//функция которая при разных параметрах
//выдает или успешный результат или ошибку

function iWantToKnowEverything(answer) {
  // новый промис с дв
  return new Promise(function (resolve, reject) {
    if (String(answer) === "42") {
      setInterval(() => {
        resolve("Now you everything about the Universe!!");
      }, 2000);
    } else {
      setInterval(() => {
        reject(new Error(`Wrong answer! ${answer} is incorrect answer :((`));
      }, 2000);
    }
  });
}

iWantToKnowEverything(42)
  .then(data => console.log(data))
  .catch(error => console.log(error));

// iWantToKnowEverything("money")
//   .then(data => console.log(data))
//   .catch(error => console.log(error));
