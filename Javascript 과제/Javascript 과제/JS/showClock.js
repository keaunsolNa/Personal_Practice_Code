
function showClock(){
    let currentDate = new Date();
    let msg = "";
    let second = "";
    if(currentDate.getHours() > 12){      
            
        msg += currentDate.getHours()-12 +":";

    }
    
    else if(currentDate.getHours() < 10){

        msg += "0" + currentDate.getHours() + ":";

    } else {

        msg += currentDate.getHours() +":";
        
    }
    

    if(currentDate.getMinutes() < 10){

        msg += "0" + currentDate.getMinutes();

    } else {

        msg += currentDate.getMinutes();

    }

    if(currentDate.getSeconds() < 10){

        second += "0" + currentDate.getSeconds();

    } else {

        second += currentDate.getSeconds();

    }
    
    divClock.innerText = msg;
    divClockSecond.innerText = second;
    const element = document.getElementById('divClockSecond');
    element.style.fontSize = '50px';
    element.style.marginTop = '100px';
    setTimeout(showClock,1000);  
}    
    
