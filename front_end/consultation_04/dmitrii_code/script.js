const magicians = [
  {
    name: "Harry Potter",
    age: 17,
    race: "Wizard",
    magicKeys: ["Expelliarmus", "Patronus Charm", "Invisibility Cloak"],
  },
  {
    name: "Hermione Granger",
    age: 17,
    race: "Wizard",
    magicKeys: ["Lumos", "Alohomora", "Time-Turner"],
  },
  {
    name: "Ron Weasley",
    age: 17,
    race: "Wizard",
    magicKeys: ["Wand", "Deluminator", "Wizard Chess"],
  },
  {
    name: "Albus Dumbledore",
    age: 115,
    race: "Wizard",
    magicKeys: ["Elder Wand", "Fawkes", "Pensieve"],
  },
  {
    name: "Severus Snape",
    age: 38,
    race: "Wizard",
    magicKeys: ["Sectumsempra", "Occlumency", "Wand"],
  },
];
const getHeroesByClick = document.getElementById("getHeroesByClick");
const charactersCards = document.getElementById("charactersCards");
function createCard(hero) {
  const card = document.createElement("div");
  card.classList.add("card");
  const cardName = document.createElement("h2");
  cardName.textContent = `Mein name ist ${hero.name}`;
  const cardText = document.createElement("p");
  cardText.textContent = `I am ${hero.race}`;
  card.append(cardName);
  card.append(cardText);
  return card;
}
getHeroesByClick.addEventListener("click", () => {
  magicians.map((el) => {
    const heroCard = createCard(el);
    charactersCards.appendChild(heroCard);
  });
});
