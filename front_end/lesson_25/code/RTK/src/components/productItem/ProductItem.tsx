import { FC, useEffect, useState } from 'react';
import { Link, Navigate, useParams } from 'react-router-dom';

import MyButton from '../myButton/MyButton';
import Product from '../../features/products/types/Product';
import { useAppSelector } from '../../app/hooks';

// import cn from 'classnames'
// import styles from './Product.module.css'

const ProductItem: FC = () => {
  const { id } = useParams();

  const initialValue: Product = {
    id: 0,
    title: '',
    price: 0,
    description: '',
    category: '',
    image: '',
  };

  const [product, setProduct] = useState<Product>(initialValue);

  async function loadProduct(): Promise<void> {
    const res = await fetch(`https://fakestoreapi.com/products/${id}`);
    const data = await res.json();
    setProduct(data);
  }

  useEffect(() => {
    loadProduct();
  }, []);

  const { user } = useAppSelector(state => state.auth)
  console.log('Lets go!');
  if (!user) {
    return <Navigate to='/' />
  }

  return (
    <div>
      <h1>{product.title}</h1>
      <p>{product.description}</p>
      <img style={{ width: '300px', display: 'block' }} src={product.image} alt="" />
      <Link to="../"><MyButton text="Назад к продуктам" /></Link>
    </div>
  );
};

export default ProductItem;
