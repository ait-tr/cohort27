import { FC } from 'react';
import { NavLink } from 'react-router-dom';
// import cn from 'classnames'
import styles from './Header.module.css';

const Header: FC = () => {
  console.log('Отрендрился хедер!');
  return (
    <div className={styles.navbar}>
      <NavLink to="/">random activity</NavLink>
      <NavLink to="productPage">productPage</NavLink>
      <NavLink to="counter">counter</NavLink>
      <NavLink to="cityPage">cityPage</NavLink>
      <NavLink to="sandwich">sandwich</NavLink>
      <NavLink to="btnTest">btnTest</NavLink>
      <NavLink to="parent">parent</NavLink>
      <NavLink to="dogCard">dogCard</NavLink>
      <NavLink to="catCard">catCard</NavLink>
    </div>
  );
};

export default Header;
