import "./App.css"
import { Route, Routes } from 'react-router-dom';
import Layout from './layouts/Layout';
import Products from './features/products/Products';
import ProductItem from './components/productItem/ProductItem';
import Error from './components/error/Error';
import YoutubeExample from './components/youtubeExample/YoutubeExample';
import Login from './features/auth/Login';

function App() {
  console.log('app!');
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route index element={<Products />} />
        <Route path="login" element={<Login />} />
        <Route path="youtube" element={<YoutubeExample />} />
        <Route path="/:id" element={<ProductItem />} />
        <Route path="*" element={<Error />} />
      </Route>
    </Routes>
  )
}

export default App
