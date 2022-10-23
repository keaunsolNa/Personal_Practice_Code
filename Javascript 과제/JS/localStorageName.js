function saveName(){
    const inStorageName = localStorage.getItem("name");
    const name = document.querySelector("#saveLocalStorageName");
    const nameInput = document.querySelector("#saveLocalStorageName input");
    
    if(inStorageName != null){
        document.getElementById("saveLocalStorageName").innerHTML = inStorageName;
    }
    
    function submitName() {
        const text = nameInput.value;
        localStorage.setItem("name", text);
    }
    name.addEventListener("submit", submitName);

}