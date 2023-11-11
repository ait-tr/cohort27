import Product from './Product';

export default interface ProductState {
  products: Product[]
  error?: null | string
  isLoading?: boolean
  favorites: number[]
}
