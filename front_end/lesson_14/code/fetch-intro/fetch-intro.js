// Fetch запрос
// посылает запрос на сервер
// также на сторонние API сервисы
// API - application programming interface
// JSON JavaScript Object Notation

fetch("https://dog.ceo/api/breeds/image/random")
  //первый .then() обрабатывает запрос
  .then(res => res.json())
  //второй .then() обрабатывает результат .json()
  .then(data => console.log(data));
