import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import CityPage from './components/cityPage/CityPage';
import Counter from './components/counter/Counter';
import Sandwich from './components/sandwich/Sandwich';
import BtnTest from './components/btnTest/BtnTest';
import Parent from './components/parent/Parent';
import DogCard from './components/dogCard/DogCard';
import CatCard from './components/CatCard/CatCard';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  // <React.StrictMode>
  <>
    <App />
    <Counter />
    <CityPage />
    <Sandwich />
    <CatCard />
    <BtnTest />
    <Parent />
    <DogCard />
  </>
  // </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
