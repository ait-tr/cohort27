import { FC, useState } from 'react';
import cn from 'classnames';
import styles from './Sandwich.module.css';
// импортируем библиотеку classnames для работы с несколькими классами из css модулей

const Sandwich: FC = () => {
  // завели useState
  const [sandwich, setSandwich] = useState<string>('Бутерброд:');

  function handleAddBread(): void {
    setSandwich(`${sandwich} хлеб`);
  }
  function handleAddCheese(): void {
    setSandwich(`${sandwich} сыр`);
  }
  function handleAddKolbasa(): void {
    setSandwich(`${sandwich} колбаса`);
  }

  function handleClear(): void {
    setSandwich('Бутерброд:');
  }

  return (
    <div className={styles.container}>
      <h1>Sandwich</h1>
      <p>{sandwich}</p>
      {/* можно объединять классы через шаблонные строки */}
      <button className={`${styles.btn} ${styles.btnDanger}`} type="button" onClick={handleAddBread}>добавить хлеб</button>
      {/* можно пользоваться библиотекой classnames */}
      <button className={cn(styles.btn, styles.btnBorder)} type="button" onClick={handleAddCheese}>добавить сыр</button>
      <button className={styles.btn} type="button" onClick={handleAddKolbasa}>добавить колбасу</button>
      <button className={styles.btn} type="button" onClick={handleClear}>готовить заново!</button>
    </div>
  );
};

export default Sandwich;
