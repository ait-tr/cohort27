// * Homework

// Создайте стрелочную функцию, которая бы принимала массив и цифру, возвращала бы элемент массива под этим индексом.

const getElementByIndex = (arr, index) => arr[index];

console.log(getElementByIndex(["a", "b", "c", "d"], 3));

// Создайте функцию, которая бы принимала бы следующие параметры:
// код погоды
// функция decode, которая дает расшифровку погоды по коду.
// Функция должна возвращать строку, описывающую погоду.

const getWeatherByCode = function (code, decode) {
  return decode(code);
};

const decode = function (code) {
  switch (code) {
    case "SQ":
      return "шквал";
    case "PO":
      return "пыльный вихрь";
    case "FC":
      return "торнадо";
    case "BR":
      return "дымка (видимость от 1 до 9 км)";
    case "HZ":
      return "мгла (видимость менее 10 км)";
    case "FU":
      return "дым (видимость менее 10 км)";
    case "DS":
      return "пыльная буря (видимость менее 10 км)";
    case "SS":
      return "песчаная буря (видимость менее 10 км)";
    default:
      return "нет такого кода!";
  }
};

console.log(decode("SQQ"));

console.log("getWeatherByCode ==>", getWeatherByCode("DS", decode));
