// * 1. Задание

/// создаем promise, работаем с позитивным исходом
// с помощью resolve()

function getStudent() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ name: "Anri", age: 32 });
    }, 4000);
  });
}

//забираем promise через .then()

getStudent().then(student => {
  console.log(student.name);
});

// * 2. Задание

function getDriverLicense(success, failure) {
  if (Math.random() > 0.1) {
    success("успех!");
  } else {
    failure("упс, неудача :(");
  }
}

function success(res){
  console.log(`Успешно завершено с результатом: ${res}`);
}

function failure(res){
  console.log(`Завершено с ошибкой: ${res}`);
}

getDriverLicense(success, failure)
