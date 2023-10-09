const interval = setInterval(() => {
  console.log("интервал!");
}, 2000);


setTimeout(()=>{
  clearInterval(interval)
}, 5000)
