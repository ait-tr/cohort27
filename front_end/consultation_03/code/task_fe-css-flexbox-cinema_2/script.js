console.log('hello!');

const navPlay = document.getElementById('navPlay')
const header = document.getElementById('header')
// console.log(navPlay, nav);

header.addEventListener('click', () => {
  header.style.backgroundImage = 'url(26.jpg)'
})

navPlay.addEventListener('click', (e) => {
  navPlay.style.backgroundColor = 'red'
  //  этим методом вы запрещаете событию дочернего элемента автоматом всплывать к родителю
  e.stopPropagation()
})
