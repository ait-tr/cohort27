// импорт хука useState
import { useEffect, useState } from 'react';
import MyButton from '../myButtom/MyButton';

const Counter = (): JSX.Element => {
  // если указать переменную без useState()и пробовать ее изменять
  // она будет пересоздаваться при каждом перерендре компонента
  // let count1 = 5;
  console.log('отрендрился каутнер!');
  const [counter, setCounter] = useState(0);
  const [age, setAge] = useState(30);

  function handlePlus(): void {
    setCounter(counter + 1);
    // как ниже не получится
    // count1 += 1;
  }

  function handleMinus(): void {
    setCounter(counter - 1);
  }

  // с пустым массивом срабатывает один раз
  useEffect(() => {
    console.log('1.');
  }, []);

  useEffect(() => {
    console.log('2.');
  });

  useEffect(() => {
    console.log('3. ');
  }, [counter]);

  useEffect(() => {
    console.log('4.');
  }, [age]);

  return (
    <div className="App">
      <h1>Counter</h1>
      <div>
        <MyButton text="Minus" onClick={handleMinus} />
        {/* <button onClick={handleMinus}>Minus</button> */}
        <span>{counter}</span>
        <MyButton text="plus" onClick={handlePlus} />
        {/* <span>{count1}</span> */}
        <span>{age}</span>
        <MyButton text="повзрослеть" onClick={() => setAge(age + 1)} />
        {/* <button onClick={handlePlus}>Plus</button> */}
      </div>

    </div>
  );
};

export default Counter;

// * есть второй вариант написания компонента - используйте тот,
// * который вам больше нравится
// const Counter: FC = () => (
//   <div>
//     <h1>Counter</h1>
//   </div>
// )

// export default Counter
