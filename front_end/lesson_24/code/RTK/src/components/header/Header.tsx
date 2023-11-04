import { FC } from 'react';
import { NavLink } from 'react-router-dom';
import cn from 'classnames';
import styles from './Header.module.css';

const Header: FC = () => {
  console.log('Отрендрился хедер!');
  return (
    <div className={styles.navbar}>
      <div className={cn(styles.navbar, styles.desktopMenu)}>
        <NavLink to="/">Home</NavLink>
        <NavLink to="youtube">Youtube</NavLink>
      </div>
      <div className={cn(styles.navbar, styles.mobileMenu)}>
        <NavLink to="catCard">☰</NavLink>
      </div>
    </div>
  );
};

export default Header;
