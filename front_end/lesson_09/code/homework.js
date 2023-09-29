const names = ["Семен", "Иван", "Петр", "Татьяна"]
const ages = [18, 27, 74, 34]

const namesAges = []
const namesAges2 = []

// * 1 способ: конкатенация и метод push()

for (let i = 0; i < names.length; i++) {
  namesAges.push(names[i]+ " " + ages[i] + " лет/годов")
}

// * 2 способ: индекс массива и синтаксис в косых кавычки (backticks)

for (let i = 0; i < names.length; i++) {
  namesAges2[i] = `${names[i]} ${ages[i]} лет/годов`
}

console.log(namesAges);
console.log(namesAges2);




