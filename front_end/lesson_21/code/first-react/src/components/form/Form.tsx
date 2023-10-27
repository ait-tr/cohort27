import React, { FormEvent, useState } from 'react';
import styles from './form.module.css';

// типизируем ключи объекта
interface FormField {
  name: string;
  label: string;
  type: string;
  value: string;
}

// типизируем пропсы для формы
// поля и функцию, которая возвращает пустоту
interface FormProps {
  fields: FormField[];
  onSubmit: (formData: FormData) => void;
}

// типизация для данных в форме
interface FormData {
  [key: string]: string;
}

// передаем дженериком пропсы в компонент
const Form: React.FC<FormProps> = ({ fields, onSubmit }) => {
  // начальное значение формы
  const initialFormData: FormData = {};

  // для каждого поля мы выстраиваем form value
  fields.forEach((field) => {
    initialFormData[field.name] = field.value || '';
  });

  // хук для хранения данных
  const [formData, setFormData] = useState<FormData>(initialFormData);

  // ручка которая что-то делает с данными на подтверждение
  const handleFormSubmit = (e: FormEvent): void => {
    e.preventDefault();
    onSubmit(formData);
  };

  // изменяет значение input в форме
  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>): void => {
    // берем значения из e.target
    const { name, value } = e.target;
    // кладем в форму
    // забираем старые поля и кладем новые
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  return (
    <form className={styles.form} onSubmit={handleFormSubmit}>
      {fields.map((field) => (
        <div key={field.name} className={styles.formGroup}>
          <label className={styles.label}>{field.label}:</label>
          <input
            type={field.type}
            name={field.name}
            value={formData[field.name]}
            onChange={handleInputChange}
            className={styles.input}
          />
        </div>
      ))}
      <button type="submit" className={styles.submitButton}>
        Submit
      </button>
    </form>
  );
};

export default Form;
