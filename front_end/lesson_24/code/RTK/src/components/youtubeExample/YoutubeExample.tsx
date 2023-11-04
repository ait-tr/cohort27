import { FC } from 'react'
// import cn from 'classnames'
import styles from './YoutubeExample.module.css'

const YoutubeExample: FC = () => {
  console.log('Lets go!');
  return (
    <>
      <div className={styles.videoBox}>
        <iframe style={{ border: '0px' }}
          src="https://www.youtube.com/embed/tgbNymZ7vqY?autoplay=1&loop=1&sidedock=0&controls=0&title=0&byline=0&portrait=0&mute=1&start=60"
          allow="autoplay; fullscreen; picture-in-picture"
          allowFullScreen
        ></iframe>
      </div >
    </>


  )
}

export default YoutubeExample
