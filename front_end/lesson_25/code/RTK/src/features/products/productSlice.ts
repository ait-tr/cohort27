import { createSlice } from '@reduxjs/toolkit';
import ProductState from './types/ProductState';
import { addProducts, deleteProducts, loadProducts } from './productAction';

// создали начальное значение для стейта
const initial: ProductState = {
  products: [],
  error: null,
  isLoading: false,
  favorites: []
}
// написали сам файл slice с разными сценариями для asyncThunk (нашего асинхронного запроса)
export const productSlice = createSlice({
  name: 'products', // уникальное имя
  initialState: initial, // начальное значение
  reducers: {
    toggleFavorites: (state, action) => {
      const productID = action.payload
      // indexOf возвращает значение -1, если элемента нет в массиве
      const index = state.favorites.indexOf(productID)
      if (index === -1) {
        state.favorites.push(productID)
      } else {
        // от заданного индекса один элемент (второй параметр)
        state.favorites.splice(index, 1)
      }
    }
  }, // логика для синхронных операций (здесь их пока нет)
  extraReducers: (builder) => { // логика для асинхронных запросов
    builder
      .addCase(loadProducts.pending, (state) => {
        state.isLoading = true
      })
      .addCase(loadProducts.fulfilled, (state, action) => {
        state.isLoading = false
        state.products = action.payload
      })
      .addCase(loadProducts.rejected, (state, action) => {
        state.isLoading = false
        state.products = []
        state.error = action.payload as string
      })
      .addCase(deleteProducts.fulfilled, (state, action) => {
        state.products = state.products.filter(el => el.id !== action.payload.id)
      })
      .addCase(addProducts.fulfilled, (state, action) => {
        state.products.push(action.payload)
      })
  }
})

// ! не забываем экспортировать синхронный экшн из reducers
export const { toggleFavorites } = productSlice.actions
