import { FC, useEffect } from 'react'
import { useAppDispatch, useAppSelector } from '../../app/hooks';
import { deleteProducts, loadProducts } from './productAction';
import MyButton from '../../components/myButton/MyButton';
// import cn from 'classnames'
import styles from './Products.module.css'
import { Link } from 'react-router-dom';
import ProductForm from '../../components/productForm/ProductForm';

const Products: FC = () => {
  const { products, isLoading, error } = useAppSelector(state => state.products)
  const dispatch = useAppDispatch()
  useEffect(() => {
    dispatch(loadProducts())
  }, [])
  return (
    <div>
      <ProductForm />
      {isLoading && <h1>Loading...</h1>}
      {error && <h1>Ошибка:{error}</h1>}
      {products && <ul className={styles.productList}>
        {products.map((el) => (
          <li className={styles.productCard} key={el.id}>
            <span className={styles.title}>{el.title}</span>
            <div className={styles.imgContainer}>
              <img className={styles.image} src={el.image} alt="" />
            </div>
            <Link to={String(el.id)}><MyButton text="To product" /></Link>
            <MyButton onClick={() => dispatch(deleteProducts(el.id))} text='delete' />
          </li>
        ))}
      </ul>}
    </div>
  )
}

export default Products
