import { FC } from 'react';
// import cn from 'classnames'
import styles from './CatImage.module.css';

interface img {
  img: string

}

const CatImage: FC<img> = ({ img }) => (
  <img className={styles.catImg} src={img} alt="" />

);

export default CatImage;
