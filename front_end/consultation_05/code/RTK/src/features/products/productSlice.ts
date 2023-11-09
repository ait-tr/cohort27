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
      const productId = action.payload;
      const index = state.favorites.indexOf(productId);
      if (index === -1) {
        // Если продукта нет в избранном, добавляем его
        state.favorites.push(productId);
      } else {
        // Если продукт уже в избранном, удаляем его
        state.favorites.splice(index, 1);
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

export const { toggleFavorites } = productSlice.actions
