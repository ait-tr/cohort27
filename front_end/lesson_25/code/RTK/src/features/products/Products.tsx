import { FC, useEffect } from 'react'
import { useAppDispatch, useAppSelector } from '../../app/hooks';
import { deleteProducts, loadProducts } from './productAction';
import MyButton from '../../components/myButton/MyButton';
// import cn from 'classnames'
import styles from './Products.module.css'
import { Link } from 'react-router-dom';
import ProductForm from '../../components/productForm/ProductForm';
import { toggleFavorites } from './productSlice';
import Loader from '../../components/loader/Loader';

const Products: FC = () => {
  // можно забирая данные через деструктуризацию переименовывать переменную
  const { user, isLoading: isAuthLoading } = useAppSelector(state => state.auth)

  const { products, isLoading, error, favorites } = useAppSelector(state => state.products)
  const dispatch = useAppDispatch()
  useEffect(() => {
    dispatch(loadProducts())
  }, [])
  if (!user?.id && !isAuthLoading) {
    return (
      <>
        <h1>Войдите в свой аккаунт!</h1>
        <Link to="login">Войти</Link>
      </>
    )
  }

  if (isAuthLoading === true) {
    return <Loader />
  }

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
            <svg style={{ cursor: 'pointer' }} onClick={() => dispatch(toggleFavorites(el.id))} width="30px" height="30px" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" version="1.1" >
              <g transform="translate(0 -1028.4)">
                {/* по свойству fill меняем цвет заливки, в зависимости от наличия id в массиве любимых продуктов */}
                <path d="m7 1031.4c-1.5355 0-3.0784 0.5-4.25 1.7-2.3431 2.4-2.2788 6.1 0 8.5l9.25 9.8 9.25-9.8c2.279-2.4 2.343-6.1 0-8.5-2.343-2.3-6.157-2.3-8.5 0l-0.75 0.8-0.75-0.8c-1.172-1.2-2.7145-1.7-4.25-1.7z" fill={favorites.includes(el.id as number) ? "#e74c3c" : 'grey'} />
              </g>
            </svg>
          </li>
        ))}
      </ul>}
    </div>
  )
}

export default Products
