import { FC } from 'react';
import { Outlet } from 'react-router-dom';
import Header from '../components/header/Header';
// import cn from 'classnames'
import styles from './Layout.module.css';
import Footer from '../components/footer/Footer';

const Layout: FC = () => (
  <div className={styles.container}>
    <Header />
    <main className={styles.main}>
      <Outlet />
    </main>
    <Footer />
  </div>
);

export default Layout;
