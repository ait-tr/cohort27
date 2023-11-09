import { FC, useState } from 'react';
import { NavLink } from 'react-router-dom';
import cn from 'classnames';
import styles from './Header.module.css';
import { useAppSelector } from '../../app/hooks';

const Header: FC = () => {
  const { user } = useAppSelector(state => state.auth)
  const [isMenuOpen, setIsMenuOpen] = useState(false);

  const toggleMenu = () => {
    setIsMenuOpen(!isMenuOpen);
  };

  const closeMenu = () => {
    setIsMenuOpen(false);
  };

  return (
    <div className={styles.navbar}>
      <div className={cn(styles.navbar, styles.desktopMenu)}>
        {user?.firstName ? (
          <>
            <NavLink to="/" onClick={closeMenu}>
              Home
            </NavLink>
            <NavLink to="youtube" onClick={closeMenu}>
              Youtube
            </NavLink>
          </>
        ) : (
          <NavLink to="login" onClick={closeMenu}>
            Login
          </NavLink>
        )}


      </div >
      <div className={cn(styles.navbar, styles.mobileMenu)}>
        {isMenuOpen ? null : (
          <button onClick={toggleMenu} className={styles.menuButton}>
            ☰
          </button>
        )}
      </div>
      {
        isMenuOpen && (
          <div onClick={closeMenu} className={styles.mobileMenuItems}>
            <button onClick={closeMenu} className={styles.closeButton}>
              ✖
            </button>
            {user?.firstName ? (
              <>
                <NavLink to="/" onClick={closeMenu}>
                  Home
                </NavLink>
                <NavLink to="youtube" onClick={closeMenu}>
                  Youtube
                </NavLink>
              </>
            ) : (
              <NavLink to="login" onClick={closeMenu}>
                Login
              </NavLink>
            )}
          </div>
        )
      }
    </div >
  );
};

export default Header;
