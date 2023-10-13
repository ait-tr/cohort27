const filmCard = document.getElementById("film-card");
const filmTitle = document.getElementById("film-title");
const filmAwards = document.getElementById("film-awards");
const filmImage = document.getElementById("film-img");

// асинхронная функция
async function getFilm() {
  // await запрос
  const res = await fetch("https://dmitrii-kuvaldin.github.io/film-api/film.json");
  // через await обрабатываем json
  const obj = await res.json();
  const { title, poster, hasOscar, year } = obj;
  filmTitle.textContent = `${title}, ${year} year`;
  filmImage.src = poster;
  filmAwards.textContent = hasOscar ? "This movie won oscar ✨" : "No awards :(";
}

getFilm();
