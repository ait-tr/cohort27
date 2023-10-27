import { FC } from 'react';

interface flower {
  color?: string
  title?: string
  family?: string
  price?: number
}

interface author {
  name?: string
  job: string
  age?: number
}

interface FlowerProps {
  flower: flower
  author?: author
  howManyAuthors?: number
}

const FlowerCard: FC<FlowerProps> = ({ flower, author, howManyAuthors }) => (
  <div style={{ backgroundColor: flower.color }}>
    <h1>{flower.title}</h1>
    {flower?.family ? <p>{flower.family}</p> : <p>Семейства нет!</p>}
    {/* {!flower?.family && <p>Семейства нет!</p>} */}
    {flower?.price && <p>Цена: {flower.price} $</p>}
    <p>Автор цветка: {author?.name}.
      {howManyAuthors && <>I am {howManyAuthors}. </>}
      {author?.age && <> Age: {author?.age} </>}
    </p>

  </div>
);

export default FlowerCard;
