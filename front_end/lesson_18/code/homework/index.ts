// задание 1

function getSecondElement(arr: string[]): string {
  return arr[1]
}

const res = getSecondElement(['Earth', 'Mars', 'Saturn'])
console.log(res);

// задание 2

const getWeatherDesc = (code: 'sun' | 'strm' | 'fog') => {
  switch (code) {
    case 'sun': return 'sunny'
    case 'strm': return 'storm'
    case 'fog': return 'foggy weather'
    default: return ""
  }
}

console.log(getWeatherDesc('fog'));

// задание 3

// В отдельном файле ts создайте interface Airplane - самолет с полями:
// numberOfEngines - количество двигателей
// isJet - реактивный
// maxHeight - максимальная высота полета
// capacity - опциональное поле вместимость
// Создайте несколько переменных типа Airplane.

interface Airplane {
  numberOfEngines: number
  isJet: boolean
  maxHeight: number
  capacity?: number
}

const boing: Airplane = {
  isJet: false,
  maxHeight: 50,
  numberOfEngines: 6
}

// generics (типы с параметром) - дает возможность работать с несколькими типами данных в отличие от входного параметра
// после объявления функции в угловых скобках передаем параметр для типа
// и работе с ним после

function getFirstElement<T>(arr: T[]):T {
  return arr[0]
}

// void - это возвращение пустоты, когда функция ничего не возвращает
//в нашем случае получилась универсальная функция, которая работает с разными типами данных
function consoleSmth<T>(smth:T):void {
  console.log(smth);
}

console.log(getFirstElement<string>(['Earth', 'Mars', 'Saturn']));
console.log(getFirstElement<number>([1, 88, 99]));
consoleSmth(117)
