// import { FC } from 'react'

// импорт специального типа Functional Component или FC

import { FC } from 'react'

// этот компонент - стрелочная функция, которая возвращает теги верстки
// эти теги похожи на HTML, но это xml другой распространенный язык разметки
// но особой разницы вы не заметите, представьте что это HTML внутри типизированного JS

const CityPage: FC = () => (

  //не забудьте что теги в TSX нужно помещать в родителя - иначе будет ошибка
  //есть даже специальный пустой тег для этих целей

  <div className='App'>
    <h1>Berlin</h1>
    <p>Capital of Germany</p>
    <img className='berlinImg' src="https://content.r9cdn.net/rimg/dimg/94/77/3c308be3-lm-1035-172eedc4c70.jpg?width=1366&height=768&xhint=2600&yhint=3239&crop=true" alt="" />

  </div>
)

export default CityPage
