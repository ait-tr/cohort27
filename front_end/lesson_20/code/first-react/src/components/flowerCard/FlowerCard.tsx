import { FC } from 'react';
// import cn from 'classnames'
// import styles from './FlowerCard.module.css'

// * 1. этап типизации - типизируем пропсы (пробрасываемые данные)

// сначала общие данные - один объект
interface Props {
  // объекту тоже присваиваем тип
  flower: flower
}

// типизируем объект
interface flower {
  color?: string
  title?: string
  family?: string
  price?: number
}

// указываем пропсы в скобках, как параметры функции и тип указываем дженериком
const FlowerCard: FC<Props> = (props: Props) => {
  // достаем данные диструктуризацией
  const { flower } = props;

  return (
    // используем инлайновые стили в двойных кудрявых скобках
    <div style={{ backgroundColor: flower.color }}>
      <h1>FlowerCard {flower.title}</h1>
      <p>{flower.family}</p>
      <p>Цена: {flower.price} $</p>
    </div>
  );
};

export default FlowerCard;
