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
    }
];

console.log(magicians);

const getCharactersByClick = document.getElementById('getCharactersByClick');
const charactersCards = document.getElementById('charactersCards');

function createCard(hero) {
    const card = document.createElement('div');
    card.classList.add('card');

    const name = document.createElement('h2');
    name.textContent = `My name is ${hero.name}`;

    const text = document.createElement('p');
    text.textContent = `I am ${hero.race}`;

    card.append(name);
    card.append(text);

    return card;
}

getCharactersByClick.addEventListener('click', () => {
    magicians.map(el => {
        console.log(el);
        const heroCard = createCard(el);
        charactersCards.appendChild(heroCard);
    })
})














