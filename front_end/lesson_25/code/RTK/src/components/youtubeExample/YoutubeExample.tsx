import { FC } from 'react'
// import cn from 'classnames'
import styles from './YoutubeExample.module.css'
import { Navigate } from 'react-router-dom';
import { useAppSelector } from '../../app/hooks';

const YoutubeExample: FC = () => {
  const { user } = useAppSelector(state => state.auth)
  console.log('Lets go!');
  if (!user) {
    return <Navigate to='/' />
  }
  return (
    <>
      <div className={styles.videoBox}>
        <iframe style={{ border: '0px' }}
          src="https://www.youtube.com/embed/tgbNymZ7vqY?autoplay=1&loop=1&sidedock=0&controls=0&title=0&mute=1&start=60"
          allow="autoplay; fullscreen; picture-in-picture"
          allowFullScreen
        ></iframe>
      </div >
    </>


  )
}

export default YoutubeExample
