import { FC, useEffect, useState } from 'react';
import cn from 'classnames';
import MyButton from '../myButtom/MyButton';
import styles from './BtnTest.module.css';

const BtnTest: FC = () => {
  // есть переключатель в useState
  const [active, setActive] = useState(true);

  // есть функция которая его меняет
  const handleToggle = (): void => {
    setActive((active) => !active);
  };
  console.log('отрендрился btnTest');
  useEffect(() => {
    console.log('useEffect из btnTest');
  }, []);

  return (
    <div>
      <div className={cn(styles.container, {
        [styles.containerActive]: active, // если active true - то применится класс .containerActive
        [styles.containerDisabled]: !active // если active false - то применится класс .containerDisabled
      })}
      >
        {/* передаем пропсы в вызванный компонент */}
        <MyButton text={active ? 'active' : 'disable'} active={active} onClick={handleToggle} />
        <h1 className={cn(styles.container, {
          [styles.headingActive]: active,
          [styles.headingDisabled]: !active
        })}
        >Changing element
        </h1>
      </div>
    </div>
  );
};

export default BtnTest;
