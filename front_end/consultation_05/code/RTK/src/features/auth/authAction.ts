import { createAsyncThunk } from '@reduxjs/toolkit';
import Credentials from './types/Credentials';
import User from './types/User';
import axios from 'axios';


export const login = createAsyncThunk(
  'auth/login',
  async ({ username, password }: Credentials) => {
    const res = await axios.post('https://dummyjson.com/auth/login', { username, password })
    return res.data
  }
);

