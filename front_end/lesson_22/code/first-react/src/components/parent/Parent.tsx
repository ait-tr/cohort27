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

  const orchid = {
    color: 'pink',
    title: 'Orchid',
    price: 10000
  };

  const me = {
    name: 'Dima',
    job: 'coder',
    age: 30
  };

  const galina = {
    name: 'Galina',
    job: 'coder'
  };

  const howManyAuthors = 1;
  // * мы используем ОДИН! компонент и в зависимости от наших данных
  // * он будет вести себя по разному
  return (
    <div>
      {/* синтаксис пропсов похож на аттрибуты */}
      <FlowerCard flower={romashka} author={me} howManyAuthors={howManyAuthors} />
      <FlowerCard flower={roza} />
      <FlowerCard flower={orchid} author={galina} />
    </div>
  );
};

export default Parent;
