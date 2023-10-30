import { FC, useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import Product from '../productPage/types/Product';
import MyButton from '../myButtom/MyButton';
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

  return (
    <div>
      <h1>{product.title}</h1>
      <p>{product.description}</p>
      <img style={{ width: '300px', display: 'block' }} src={product.image} alt="" />
      <Link to="../productPage"><MyButton text="Назад к продуктам" /></Link>
    </div>
  );
};

export default ProductItem;
