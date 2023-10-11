// функция возвращающая promise

function getUser() {
  return new Promise(function (resolve, reject) {
    setTimeout(() => {
      resolve("Tom Hanks");
    }, 2000);
  });
}

// ! синтаксис .then()

getUser().then(data => {
  console.log(data);
});

// ? async / await синтаксис

async function getUserAsyncAwait() {
  const response = await getUser()
  console.log(response);
}

getUserAsyncAwait()
