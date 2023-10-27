import { FC, useState } from 'react';
// import cn from 'classnames'
import styles from './Footer.module.css';

const Footer: FC = () => {
  const [value, setValue] = useState('Переменная');

  return (
    <div className={styles.footer}>
      <p style={{ cursor: 'pointer' }} onClick={() => setValue('Привет')}>Footer</p>
      <span>{value}</span>
    </div>
  );
};

export default Footer;
