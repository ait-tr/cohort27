const cars = [
  { brand: "BMW", price: 20000, isDiesel: true },
  { brand: "Mercedes", price: 22000, isDiesel: false },
  { brand: "Porshe", price: 50000, isDiesel: true },
  { brand: "Nissan", price: 25000, isDiesel: false },
];

// 1.
const carsNew = cars.map(car => {
  return { brand: car.brand, isDiesel: car.isDiesel };
});

// 1.1 новый массив
const carsNew1 = cars.map(car => {
  const { price, ...newCar } = car;
  return newCar;
});

console.log(carsNew1);
console.log(carsNew);

// 2. все дизельные
const dieselCars = cars.filter(car => car.isDiesel);
console.log(dieselCars);

// 3. все без дизеля
const notDieselCars = cars.filter(car => !car.isDiesel);
console.log(notDieselCars);

// 4. общая сумма всех недизельных машин

const sum = notDieselCars.map(car => car.price).reduce((acc, el) => acc + el, 0);

console.log(sum);

// 5. пербор массива и умножение цены

cars.forEach(car => (car.price *= 1.2));
console.log(cars);

//5.1 на 20% увеличили общую сумму

const allCarsSum = cars.reduce((acc, car) => acc + car.price + (car.price / 100) * 20, 0);

console.log(allCarsSum);

//заменяем все дизельные машины
const cars2 = cars.map(car => (car.isDiesel ? { brand: "Tesla", price: 25000, isDiesel: false } : car));
console.log(cars2);

console.log(cars);

//другой вариант
const replacedCars = cars.map(car => {
  if (car.isDiesel) {
    return { brand: "Tesla", price: 25000, isDiesel: false };
  }
  return { ...car };
});

console.log(replacedCars);

// * ToDo list

const toDoList = ["погулять", "поспать", "поработать"];

toDoList.splice(1, 0, "покодить");

console.log(toDoList);

const newToDo = toDoList.slice();

toDoList.splice(1, 2);

//исходный список
console.log(newToDo);

//пустой сплайс ничего не удаляет и возвращает пустой массив
console.log(toDoList.splice());

//список с изменениями
console.log(toDoList);


