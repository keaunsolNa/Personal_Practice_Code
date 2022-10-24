function onGeoOk(position) {
    const API_KEY = "0e95f5536a096d6e41ea4ca5a700ff22";
    const latitude = position.coords.latitude;
    const longitude = position.coords.longitude;
    let nowWeather = "";
    let nowTemp = "";
    let nowCity ="";
    fetch(
        `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=${API_KEY}&units=metric`,
        )
        .then(response => response.json())
        .then(data => {
            nowWeather = data.weather[0].main;
            nowTemp = data.main.temp;
            nowCity = data.name;
            document.getElementById('weatherDiv').innerHTML = `City : ${nowCity},  Weather : ${nowWeather}, Temperature : ${nowTemp}`;
            document.getElementById("weatherDiv").style.color="white"
        })
    }
    
    function onGeoError() {
        alert("Can't find you. No weather for you.");   
    }