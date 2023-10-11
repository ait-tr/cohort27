const dogImage = document.getElementById("dog-image");

fetch("https://dog.ceo/api/breeds/image/random")
  .then(res => res.json())
  .then(data => {
    console.log(data);
    const { message } = data;
    dogImage.src = message;
  });
