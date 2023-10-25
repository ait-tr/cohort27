import { FC } from 'react';
import FlowerCard from '../flowerCard/FlowerCard';
// import cn from 'classnames'
// import styles from './Parent.module.css'

// компонент родитель
const Parent: FC = () => {
  // данные по розе
  const roza = {
    color: 'indianred',
    title: 'roza',
    price: 40
  };
  // данные по ромашке
  const romashka = {
    color: 'moccasin',
    title: 'Ромашка',
    family: 'Астровые',
    price: 25

  };
  // * мы используем ОДИН! компонент и в зависимости от наших данных
  // * он будет вести себя по разному
  return (
    <div>
      {/* синтаксис пропсов похож на аттрибуты */}
      <FlowerCard flower={romashka} />
      <FlowerCard flower={roza} />
    </div>
  );
};

export default Parent;
