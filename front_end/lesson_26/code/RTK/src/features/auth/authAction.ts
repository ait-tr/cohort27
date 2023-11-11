import { createAsyncThunk } from '@reduxjs/toolkit';
import axios from 'axios';
import Credentials from './types/Credentials';

export const login = createAsyncThunk(
  'loginAction',
  async (userData: Credentials, thunkAPI) => {
    try {
      const response = await axios.post('https://dummyjson.com/auth/login', userData);
      return response.data;
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message);
    }
  }
);

