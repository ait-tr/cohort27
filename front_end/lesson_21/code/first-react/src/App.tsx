import { Route, Routes } from 'react-router-dom';
import './App.css';
import RandomActivity from './components/randomActivity/RandomActivity';
import Counter from './components/counter/Counter';
import CityPage from './components/cityPage/CityPage';
import Sandwich from './components/sandwich/Sandwich';
import BtnTest from './components/btnTest/BtnTest';
import Parent from './components/parent/Parent';
import DogCard from './components/dogCard/DogCard';
import Layout from './layouts/Layout';
import Error from './components/error/Error';

// Routes - это элемент родитель в который вы вкладываете все Route с ссылками на элементы
// path - это аттрибут путь до компонента (название придумываете сами)
// element - это сам компонент - вы его импортируете и передаете в роут

const App = (): JSX.Element => (
  <Routes>
    <Route path="/" element={<Layout />}>
      {/* аттрибут индекс указывает на то, что этот Route откроется на домашней странице, path в этом случае указывать не нужно */}
      <Route index element={<RandomActivity />} />
      <Route path="counter" element={<Counter />} />
      <Route path="cityPage" element={<CityPage />} />
      <Route path="sandwich" element={<Sandwich />} />
      <Route path="btnTest" element={<BtnTest />} />
      <Route path="parent" element={<Parent />} />
      <Route path="dogCard" element={<DogCard />} />
      <Route path="*" element={<Error />} />
    </Route>
  </Routes>
);

export default App;
