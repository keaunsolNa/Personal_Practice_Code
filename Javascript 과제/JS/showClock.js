
function showClock(){
    var currentDate = new Date();
    var msg = "";
    if(currentDate.getHours()>12){      
        msg += currentDate.getHours()-12 +":";
    }
    
    else {
        msg += currentDate.getHours() +":";
    }
    
    msg += currentDate.getMinutes() + ":";
    msg += currentDate.getSeconds() ;
    
    divClock.innerText = msg;
    setTimeout(showClock,1000);  
}    
    
