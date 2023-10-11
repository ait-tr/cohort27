// объявляем переменные с элементами, с которыми будем работать

const catImg = document.getElementById("catImg");
const catInfo = document.getElementById("catInfo");

// асинхронный запрос к API
// посылаем запрос с помощью fetch(), передаем адрес в кавычках

// * 1. способ с .then()

function getCat() {
  fetch("https://cataas.com/cat").then(response => {
    catImg.src = response.url;
  });
}

// * 2 способ с async / await

async function getCatFact() {
  // запрос на сервер
  const result = await fetch("https://catfact.ninja/fact");
  //обработка JSON и превращения в данные JS
  const obj = await result.json();
  //деструктуризация - удобный способ достать данные из объекта в одну строку
  const { fact } = obj;
  catInfo.textContent = `New fact: ${fact}`;
}

//вызов функций 
getCatFact();
getCat();
