import { FC, useState } from 'react'
// import cn from 'classnames'
import styles from './Login.module.css'
import MyButton from '../../components/myButton/MyButton';
import { useAppDispatch, useAppSelector } from '../../app/hooks';
import { login } from './authAction';
import { Navigate, useNavigate } from 'react-router-dom';
import Form from '../../components/form/Form';
import Loader from '../../components/loader/Loader';
import Credentials from './types/Credentials';

const Login: FC = () => {
  const { user, error, isLoading } = useAppSelector(state => state.auth)
  const [username, setUsername] = useState<string>('');
  const [password, setPassword] = useState<string>('');
  const dispatch = useAppDispatch()

  const navigate = useNavigate()

  async function handleLogin() {
    console.log({ username, password });
    const dispatchResult = await dispatch(
      login({
        username,
        password,
      })
    );
    // мы проверяем пришел ли удачный ответ с бека, или нет
    // и в разных случаях делаем разные действия
    if (login.fulfilled.match(dispatchResult)) {
      navigate("/");
    }
    if (login.rejected.match(dispatchResult)) {
      console.error(dispatchResult.error);
    }
  }

  async function handleLogin2(e: Credentials) {
    const dispatchResult = await dispatch(
      login(e)
    );
    if (login.fulfilled.match(dispatchResult)) {
      navigate("/");
    }
    if (login.rejected.match(dispatchResult)) {
      console.error(dispatchResult.error);
    }
  }

  const fields = [
    {
      name: 'username',
      label: 'login',
      type: 'text',
      value: '',
    },
    {
      name: 'password',
      label: 'password',
      type: 'password',
      value: '',
    }
  ]

  if (user) {
    return <Navigate to='/' />
  }
  return (
    <div>
      {/* <Form fields={fields} onSubmit={(e) => console.log(e)} /> */}
      {isLoading && <Loader />}
      {!isLoading && <>
        <p>username: 'kminchelle'</p>
        <p>password: '0lelplR'</p>
        <Form fields={fields} onSubmit={handleLogin2} />
        {/* <input type="text" placeholder='username' value={username} onChange={(event) => setUsername(event.target.value)} />
        <input type="password" placeholder='password' value={password} onChange={(event) => setPassword(event.target.value)} />
        <MyButton text='войти' onClick={handleLogin} /> */}
      </>}
      {error && <p>{error}</p>}
    </div>
  )
}

export default Login
