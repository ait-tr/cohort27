import { createAsyncThunk, createSlice } from '@reduxjs/toolkit';
import AuthState from './types/AuthState';
import { login } from './authAction';

const initialState: AuthState = {
  user: undefined,
  isLoading: false
};


export const authSlice = createSlice({
  name: 'auth',
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(login.fulfilled, (state, action) => {
        state.isLoading = false
        if ('message' in action.payload) {
          state.error = action.payload.message;
        } else {
          state.user = action.payload;
          state.error = '';
        }
        // в случае успешного входа уберем ошибку - если она была
      })
      .addCase(login.pending, (state, action) => {
        state.isLoading = true // случай неудачного входа - добавили ошибку
      })
      .addCase(login.rejected, (state, action) => {
        state.isLoading = false
        state.error = 'Wrong email or password'; // случай неудачного входа - добавили ошибку
      });
  },
});

export default authSlice.reducer;
