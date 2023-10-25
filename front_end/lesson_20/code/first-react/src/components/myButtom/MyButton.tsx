import { FC } from 'react';
import cn from 'classnames';
import styles from './MyButton.module.css';
// импорт библиотеки

// это пропсы (параметры на вход для компонента от родителя)
interface btnProps {
  text: string
  active?: boolean
  onClick?: () => void
}
// мы работаем с пропсами как с параметрами и деструктуризацие достаем
// при передачи в компонент

// btnProps в качестве параметра передаем тип или интерфейс описания наших данных на вход (пропсов)
// active true по умолчанию
const MyButton: FC<btnProps> = ({ text, active = true, onClick }) => (
  <button
    className={cn(styles.button, {
      [styles.active]: active,
      [styles.disabled]: !active
    })}
    onClick={onClick}
  >{text}
  </button>
);

export default MyButton;
