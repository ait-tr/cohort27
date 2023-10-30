import { FC, useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import Product from './types/Product';
// import cn from 'classnames'
import styles from './ProductPage.module.css';
import MyButton from '../myButtom/MyButton';

const ProductPage: FC = () => {
  const [products, setProducts] = useState<Product[]>([]);

  async function Shop(): Promise<void> {
    const res = await fetch('https://fakestoreapi.com/products');
    const arr = await res.json();
    setProducts(arr);
  }

  useEffect(() => {
    Shop();
  }, []);

  return (
    <div>
      <ul className={styles.productList}>
        {/* проходимся по массиву и печатем значения по ключам в элементах-объектах массива */}
        {products.map((el) => (
          <li className={styles.productCard} key={el.id}>
            <span className={styles.title}>{el.title}</span>
            <div className={styles.imgContainer}>
              <img className={styles.image} src={el.image} alt="" />
            </div>
            <Link to={String(el.id)}><MyButton text="To product" /></Link>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ProductPage;
