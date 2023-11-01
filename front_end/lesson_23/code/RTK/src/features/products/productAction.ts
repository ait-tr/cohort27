import { createAsyncThunk } from '@reduxjs/toolkit';
import axios from 'axios';

// createAsyncThunk - метод для работы с асинхронными операциями в redux
export const loadProducts = createAsyncThunk(
  // первый параметр -уникальное название
  'products/loadProducts',
  // второй параметр - асинхронная стрелочная функция
  async (_, thunkAPI) => {
    //try - сработает если придет положительный ответ от Promise - значение Fulfilled
    // доставать данные будем в slice из action.payload
    try {
      const res = await axios.get('https://fakestoreapi.com/products')
      return res.data
      //catch - сработает если придет негативный ответ от Promise - значение Rejected
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message)
    }
  }
)

// прописали асинхронный метод на удаление в который передали id
export const deleteProducts = createAsyncThunk(
  'products/deleteProducts',
  async (id: number, thunkAPI) => {
    try {
      const res = await axios.delete(`https://fakestoreapi.com/products/${id}`)
      //с бека при успехе возвращается удаленный элемент
      return res.data
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message)
    }
  }
)
