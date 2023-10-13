// объявили переменные

const formItems = document.getElementById("form-items");
const loader = document.getElementById("loader");
const productList = document.getElementById("product-list");
const content = document.getElementById("content");

//обратились к форме по id
formItems.addEventListener("submit", event => {
  //предотвратили поведение по умолчанию
  event.preventDefault();
  //нашли есть элементы с ошибками на странице
  const error = document.querySelector(".error");
  //если есть ошибки мы их подчистим
  //чтобы старые не отображались с новыми
  if (error) {
    content.removeChild(error);
  }
  //чистим список от старых элементов
  while (productList.firstChild) {
    productList.removeChild(productList.firstChild);
  }

  // забрали данные из input в переменную
  const amount = event.target["form-amount"].value;

  //очистили форму
  event.target["form-amount"].value = "";

  //делаем валидацию данных пользователя
  if (amount > 0 && amount < 20) {
    //если все верно - включаем лоадер и делаем фетч
    loader.style.display = "block";
    // подставили в запрос переменную через шаблонные строки
    fetch(`https://fakestoreapi.com/products?limit=${amount}`)
      //обработали response на предмет ошибки
      //обратились к полю 'ok'
      //он может быть либо true либо false - в зависимости от успеха
      .then(response => {
        if (!response.ok) {
          //сгенерили ошибку и отправили ее в catch
          throw new Error("Что-то сломалось... Попробуйте еще раз!");
        }
        // при положительном исходе обрабатываем json
        return response.json();
      })
      .then(data => {
        // ! в timeout мы положили отображение данных чтобы сымитировать поведение сервера, в реальной разработки вы так не будете
        setTimeout(() => {
          //делаем div видимым
          content.style.display = "block";
          //удаляет элемент из потока - мы его не видим
          //если хотите оставить элемент но сделать невидимым - используйте visibility:hidden
          loader.style.display = "none";
          //распечатываем массив
          data.forEach(el => {
            //создаем новый элемент списка
            const listItem = document.createElement("li");
            listItem.textContent = el.title;
            productList.append(listItem);
          });
        }, 1000);
      })
      //обработчик ошибки
      .catch(error => {
        // отображаем список
        content.style.display = "block";
        //убираем loader
        loader.style.display = "none";
        // создаем html для ошибки
        const errorMessage = document.createElement("p");
        errorMessage.className = "error";
        errorMessage.style.color = "red";
        errorMessage.textContent = `Ошибка пришла с сервера! ${error.message}`;
        content.append(errorMessage);
      });
  } else {
    // обрабатываем клиентскую ошибку
    content.style.display = "block";
    const errorMessage = document.createElement("p");
    errorMessage.className = "error";
    errorMessage.style.color = "orange";
    errorMessage.textContent = `Ошибка в форме на клиенте! Укажите число в диапазоне от 1 до 10`;
    content.append(errorMessage);
  }
});
