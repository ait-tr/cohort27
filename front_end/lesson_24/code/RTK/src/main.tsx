import React from "react"
import ReactDOM from "react-dom/client"
import { Provider } from "react-redux"
import { store } from "./app/store"
import App from "./App"
import "./index.css"
import { BrowserRouter } from 'react-router-dom'

ReactDOM.createRoot(document.getElementById("root")!).render(
  // обертка provider из redux - в store хранятся наши централизованные данные
  // к которым есть доступ из всех компонентов
  <Provider store={store}>
    {/* эта обертка для роутинга, иначе он не заработает */}
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </Provider>
)
