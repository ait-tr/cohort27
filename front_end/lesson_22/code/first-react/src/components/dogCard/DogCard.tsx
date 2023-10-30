import { FC, useEffect, useState } from 'react';
import MyButton from '../myButtom/MyButton';
// import cn from 'classnames'
import styles from './DogCard.module.css';

const DogCard: FC = () => {
  // есть переменная в которой мы хроним данные
  const [img, setImg] = useState('');
  // хук useEffect срабатывает один раз при пустом массиве зависимостей
  // в нем работаем с асинхронной вызовом fetch

  function fetchDog(): void {
    // это асинхронный запрос
    fetch('https://dog.ceo/api/breeds/image/random')
      .then((res) => res.json())
      .then((data) => setImg(data.message));
  }

  useEffect(() => {
    console.log('cработал хук!');
    fetchDog();
  }, []);

  // если указать вызов функции без useffect() она
  // будет срабатывать каждый раз при перерендре компонента
  // fetchDog();

  console.log('обновление компонента!');

  return (
    <div className="App">
      <h1>DogCard</h1>
      {/* на onCloick() ставим вызов функции, похоже на addEventListener() */}
      <MyButton onClick={fetchDog} text="обновить пса" />
      <img className={styles.dogImg} src={img} alt="dog" />
      {/* кнопка-компонент в котрой прописаны стили и логика */}
      {/* данные приходят  */}
    </div>
  );
};

export default DogCard;
