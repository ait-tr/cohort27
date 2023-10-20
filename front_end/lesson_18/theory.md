
### Create react app, useState, eslint
Чтобы создать приложение зайдите в папку, где хотите его расположить и введите в терминал команду(замените my-app на имя вашего приложения):
- npx create-react-app my-app --template typescript

После этого войдите в терминале в директорию приложение:
- верхнее меню file -> open folder

И запустите приложение, откройте териминал в VSСode:
- npm start


### Для проектов мы будем использовать ES модули — с синтаксисом import/export
// App.jsx
export default App;

// index.jsx
import App from './App';

### node_modules
Поскольку директория node_modules указана в gitignore, когда вы склонируете проект к себе, вам потребуется подгрузить все эти модули, сделать это можно при помощи команды `npm i`.

## Ссылки
- React CRA: [ссылка](https://create-react-app.dev/docs/adding-typescript/)





