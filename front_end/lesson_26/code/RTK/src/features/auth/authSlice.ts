import { createSlice } from '@reduxjs/toolkit';
import AuthState from './types/AuthState';
import { login } from './authAction';

const initialState: AuthState = {
  user: undefined,
  isLoading: false,
  error: null,
};

export const authSlice = createSlice({
  name: 'authSlice',
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(login.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(login.fulfilled, (state, action) => {
        state.user = action.payload;
        state.isLoading = false
      })
      .addCase(login.rejected, (state, action) => {
        state.isLoading = false
        state.user = undefined
        state.error = action.payload as string
      })
  },
});

export default authSlice;
