import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// импорт из библиотеки
import { BrowserRouter } from 'react-router-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';

// import CatCard from './components/CatCard/CatCard';
// import TodoList from './components/TodoList/Todo';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

root.render(
  // <React.StrictMode>
  <BrowserRouter>
    <App />
  </BrowserRouter>
  // </React.StrictMode>
);

reportWebVitals();
