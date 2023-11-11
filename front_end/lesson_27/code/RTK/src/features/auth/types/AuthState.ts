import User from './User'

export default interface AuthState {
  user: User | undefined
  // вариант
  // status: 'success' | 'decline' | 'loading'
  isLoading: boolean
  error: null | string
}
