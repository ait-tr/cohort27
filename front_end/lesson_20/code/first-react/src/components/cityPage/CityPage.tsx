import { FC, useState } from 'react';
import MyButton from '../myButtom/MyButton';

const CityPage: FC = () => {
  const berlin = {
    name: 'Berlin',
    title: 'Capital of Germany',
    imgUrl: 'https://content.r9cdn.net/rimg/dimg/94/77/3c308be3-lm-1035-172eedc4c70.jpg?width=1366&height=768&xhint=2600&yhint=3239&crop=true'
  };
  const paris = {
    name: 'Paris',
    title: 'Capital of France',
    imgUrl: 'https://imageio.forbes.com/specials-images/imageserve/6468ea7be5b5bee9d12e9948/eiffel-tour-and-Paris-cityscape/0x0.jpg?format=jpg&height=1835&width=2767'
  };
  // сделали переключатель булевого значения
  const [isBerlin, setIsBerlin] = useState(true);
  const [cityData, setCityData] = useState(berlin);

  // переключает булевое значение
  const toggleCity = (): void => {
    // setIsBerlin берет предыдущее значение isBerlin как параметр на вход (потому что это функция) - и возвращает его, но противоположное
    // и кладет в isBerlin это противоположное значение
    setIsBerlin((isBerlin) => {
      if (!isBerlin) {
        setCityData(berlin);
      } else {
        setCityData(paris);
      }
      return !isBerlin;
    });
    // setIsBerlin(isBerlin => !isBerlin) короткая запись (без return)
  };

  // наши данные в переменной, которые зависят от того что лежит в setIsBerlin
  // const cityData = isBerlin ? {
  //   name: 'Berlin',
  //   title: 'Capital of Germany',
  //   imgUrl: "https://content.r9cdn.net/rimg/dimg/94/77/3c308be3-lm-1035-172eedc4c70.jpg?width=1366&height=768&xhint=2600&yhint=3239&crop=true"
  // }
  // - можно было бы указать через тернарный оператор данные в одной переменной

  return (
    // когда мы работаем с версткой в react мы вставляем переменные через '{}'
    // на всякий случай при обращении к ключам рекомендую использовать безопасный синтаксис с '?' который убережет от ошибки при обращении к ключу от undefined (когда будете работать с сервером)
    <div className="App">
      <h1>{cityData?.name}</h1>
      <p>{cityData?.title}</p>
      <div className="imgWrapper">
        <img className="berlinImg" src={cityData?.imgUrl} alt="" />
      </div>
      {/* функцию toggleCity заводим на onClick */}

      <MyButton onClick={toggleCity} text={isBerlin ? 'switch to Paris' : 'back to Berlin'} />
    </div>
  );
};

export default CityPage;
