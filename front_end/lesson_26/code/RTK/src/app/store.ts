import { configureStore, ThunkAction, Action } from "@reduxjs/toolkit"
import counterReducer from "../features/counter/counterSlice"
import { productSlice } from '../features/products/productSlice'
import authSlice from '../features/auth/authSlice'

export const store = configureStore({
  reducer: {
    counter: counterReducer,
    //по ключу, который сами выбираем кладем данные в store
    //импортируем productSlice.reducer из productSlice
    products: productSlice.reducer,
    auth: authSlice.reducer
  },
})

export type AppDispatch = typeof store.dispatch
export type RootState = ReturnType<typeof store.getState>
export type AppThunk<ReturnType = void> = ThunkAction<
  ReturnType,
  RootState,
  unknown,
  Action<string>
>
