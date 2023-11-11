import { createAsyncThunk } from '@reduxjs/toolkit';
import axios from 'axios';
import Product from './types/Product';

export const loadProducts = createAsyncThunk(
  'products/loadProducts',
  async (_, thunkAPI) => {
    try {
      const res = await axios.get('https://fakestoreapi.com/products')
      return res.data
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message)
    }
  }
)

// прописали асинхронный метод на удаление в который передали id
export const deleteProducts = createAsyncThunk(
  'products/deleteProducts',
  async (id: number | undefined, thunkAPI) => {
    try {
      const res = await axios.delete(`https://fakestoreapi.com/products/${id}`)
      //с бека при успехе возвращается удаленный элемент
      return res.data
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message)
    }
  }
)

export const addProducts = createAsyncThunk(
  'products/addProducts',
  async (product: Product, thunkAPI) => {
    try {
      console.log(product);
      const res = await axios.post(`https://fakestoreapi.com/products`, product)
      //с бека при успехе возвращается удаленный элемент
      return res.data
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message)
    }
  }
)
