import { FC, useEffect, useState } from 'react';
// типы приходят из отдельного файла
import Activity from './types/Activity';
import MyButton from '../myButtom/MyButton';
// import cn from 'classnames'
// import styles from './RandomActivity.module.css'

const RandomActivity: FC = () => {
  const initialValue: Activity = {
    accessibility: 0,
    activity: '',
    key: '',
    link: '',
    participants: 0,
    price: 0,
    type: ''
  };

  const [activity, setActivity] = useState<Activity>(initialValue);

  // асинхронный запрос через try / catch
  async function loadActivity(): Promise<void> {
    const res = await fetch('https://www.boredapi.com/api/activity');
    const data = await res.json();
    setActivity(data);
  }
  // мы вызываем асинхронный запрос в useEffect()
  useEffect(() => {
    loadActivity();
  }, []);
  // кидаем запрос на на гугл, если нет ссылки в ответе API
  // https://www.google.com/search?q=earth
  // условие вывода прописываем тернарным оператором
  return (
    <div>
      <h1>RandomActivity</h1>
      <p>Попробуй: {activity.activity}</p>
      {/* не забывайте указывать знак вопроса, если обращаетесь к объекту с бека (вдруг он undefined) */}
      {/* {activity?.link && <p>Узнать больше: <a target="_blank" href={activity.link} rel="noreferrer"> */}
      {activity?.link ?
        (<p>Узнать больше: <a target="_blank" href={activity.link} rel="noreferrer">{activity.link}</a></p>) :
        (<a target="_blank" href={`https://www.google.com/search?q=${activity.activity}`} rel="noreferrer"><p>Искать в гугле</p></a>)}
      <MyButton onClick={loadActivity} text="Новая активность!" />
    </div>
  );
};

export default RandomActivity;
