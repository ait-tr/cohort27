import { FC, useEffect } from 'react'
import { useAppDispatch, useAppSelector } from '../../app/hooks';
import { deleteProducts, loadProducts } from './productAction';
import MyButton from '../../components/myButton/MyButton';
// import cn from 'classnames'
// import styles from './Products.module.css'

const Products: FC = () => {
  //достаем данные из store из нашего стейта products
  const { products, isLoading, error } = useAppSelector(state => state.products)
  // забрали данные из другого стейта counter
  const { value } = useAppSelector(state => state.counter)
  const dispatch = useAppDispatch()
  //вызов через dispatch функции loadProducts()
  useEffect(() => {
    dispatch(loadProducts())
  }, [])
  return (
    <div>
      <h1>Что сейчас в counter: {value}</h1>
      {isLoading && <h1>Loading...</h1>}
      {error && <h1>Ошибка:{error}</h1>}
      {products && products.map(el => (
        <div key={el.id}>
          <p>{el.title}</p>
          {/* добавили onClick на кнопку */}
          <MyButton onClick={() => dispatch(deleteProducts(el.id))} text='delete' />
        </div>
      ))}
    </div>
  )
}

export default Products
