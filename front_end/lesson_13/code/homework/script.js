// объявляем переменные
const formInput = document.getElementById("todo-form");
const listItem = document.getElementById("todo-list");

//создаем пустой массив
const tasks = [];

//функция добавления элементов в массив
const addTask = event => {
  // предотвращаем перезагрузку страницы по умолчанию
  event.preventDefault();
  // добавили значения из input в переменные
  const todoItem = event.target["todo-item"].value;
  const todoDesc = event.target["todo-desc"].value;
  //очистили поля формы
  event.target["todo-item"].value = "";
  event.target["todo-desc"].value = "";

  tasks.push({ todoItem, todoDesc, done: false });

  //вызываем функция создания DOM элемента li c чекбоксом
  renderTasks();
  console.log(tasks);
};

function renderTasks() {
  // прежде чем добавить элементы в DOM из массива
  // мы очищаем UL от старых элементов (чтобы те не повторялись)
  while (listItem.hasChildNodes()) {
    listItem.firstChild.remove();
  }

  // добавляем элементы из массива в UL
  tasks.forEach(task => {
    //создаем list element
    const li = document.createElement("li");
    //создаем новый input типа checkbox
    const checkBox = document.createElement("input");
    checkBox.type = "checkbox";
    checkBox.checked = task.done;

    if (task.done) {
      li.classList.add("completed");
    } else {
      li.classList.remove("completed");
    }

    checkBox.onclick = () => {
      task.done = !task.done;
      if (task.done) {
        li.classList.add("completed");
      } else {
        li.classList.remove("completed");
      }
      console.log(tasks);
      console.log("клик мышкой");
    };
    console.log("сработал forEach");
    li.append(checkBox);
    const text = document.createTextNode(`${task.todoItem} ${task.todoDesc}`);
    li.append(text);

    listItem.append(li);
  });
}

//добавляем функцию добавления в слушатель событий
formInput.addEventListener("submit", addTask);
