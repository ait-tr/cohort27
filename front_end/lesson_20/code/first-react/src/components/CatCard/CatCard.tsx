import { FC, useEffect, useState } from 'react';

// import cn from 'classnames'
import styles from './CatCard.module.css';
import MyButton from '../myButtom/MyButton';

const CatCard: FC = () => {
  const [text, setText] = useState('');
  const [img, setImg] = useState('');
  function fetchCat(): void {
    fetch('https://catfact.ninja/fact')
      .then((res) => res.json())
      .then((data) => setText(data.fact));
  }
  function fetchCatImg(): void {
    fetch('https://cataas.com/cat')
      // .then(res => res.json())
      .then((res) => setImg(res.url));
    // .then(data => s)
  }
  useEffect(() => {
    fetchCat();
    fetchCatImg();
  }, []);
  return (
    <div>
      <h1>CatCard</h1>
      <p>{text}</p>
      <img className={styles.catImg} src={img} alt="" />
      <MyButton text="Меняю факт о кошке" onClick={fetchCat} />
    </div>
  );
};

export default CatCard;
