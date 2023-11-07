import { FC, useEffect } from 'react';
import { NavLink } from 'react-router-dom';
import cn from 'classnames';
import styles from './Header.module.css';
import { useAppDispatch, useAppSelector } from '../../app/hooks';
import { login } from '../../features/auth/authAction';

const Header: FC = () => {
  const { user } = useAppSelector(state => state.auth)
  const dispatch = useAppDispatch()
  console.log('Отрендрился хедер!');

  // ! вместо этой функции можно будет в дальнейшем с готовым беком отправлять данные из куки
  // ! и этот useEffect будет срабатывать в самом начале mount компонента header

  // useEffect(() => {
  //   dispatch(login({ username: 'kminchelle', password: '0lelplR' }))
  // }, []);
  return (
    <div className={styles.navbar}>
      <div className={cn(styles.navbar, styles.desktopMenu)}>
        {/* теги верстки последи js кода обязательно должны быть обернуты в родительский тег */}
        {/* если в ответе пришел юзер - покажи пользовательскую навигацию */}
        {user?.id ?
          <>
            <span >Привет, {user?.firstName}! </span>
            <NavLink to="/">Home</NavLink>
            <NavLink to="youtube">Youtube</NavLink>
          </> :
          <NavLink to="login">Login</NavLink>
        }
      </div>
      <div className={cn(styles.navbar, styles.mobileMenu)}>
        <NavLink to="catCard">☰</NavLink>
      </div>
    </div>
  );
};

export default Header;
