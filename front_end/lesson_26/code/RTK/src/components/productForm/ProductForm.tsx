import { FC, useState } from 'react'
import Product from '../../features/products/types/Product'
import { useAppDispatch } from '../../app/hooks';
import { addProducts } from '../../features/products/productAction';
// import cn from 'classnames'
import styles from './ProductForm.module.css'
import useLocalStorage from '../../hooks/useLS';

const ProductForm: FC = () => {
  const dispatch = useAppDispatch()
  // из особенностей React мы для каждого input value завели state
  // точнее стейт-массив в котором меняем ключи и значения
  const [product, setProduct] = useLocalStorage<Product>('product', {
    title: '',
    price: '',
    description: '',
    image: '',
    category: '',
  });

  // мы сделали функцию, которая срабатывает в момент изменения
  const handleInputChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    // забираем из event.target (всего элемента) два поля
    const { name, value } = event.target
    // перезаписываем product целиком (так работает любой set из useState())
    setProduct({
      //копируем предыдущее значение через spread оператор '...'
      ...product,
      // добавляем новые данные в массив по ключу, который у нас уже нет
      [name]: value
    })
  }

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault()
    let newProduct = product
    newProduct.price = Number(product.price)
    // в диспатч мы покидываем функцию из файла actions с createAsyncThunk
    dispatch(addProducts(product))
    setProduct({
      title: '',
      price: '',
      description: '',
      image: '',
      category: '',
    })
    localStorage.setItem("myCat", "Tom");
  }


  return (
    <div>
      <form className={styles.form} onSubmit={handleSubmit} action="">
        <p style={{ textAlign: 'center' }}>Добавить новый продукт</p>
        <input onChange={handleInputChange} type="text" placeholder='title' name='title' value={product.title} />
        <input onChange={handleInputChange} type="text" placeholder='description' name='description' value={product.description} />
        <input onChange={handleInputChange} type="text" placeholder='category' name='category' value={product.category} />
        <input onChange={handleInputChange} type="text" placeholder='image' name='image' value={product.image} />
        <input onChange={handleInputChange} type="text" placeholder='price' name='price' value={product.price} />
        <button type='submit'>добавить продукт</button>
      </form>
    </div>
  )
}

export default ProductForm
