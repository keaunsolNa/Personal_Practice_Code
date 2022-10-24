function saveMainFocus(){
    const inStoragFocus = localStorage.getItem("focus");
    const focus = document.querySelector("#saveLocalStorageMainFocus");
    const focusInput = document.querySelector("#saveLocalStorageMainFocus input");
    
    if(inStoragFocus != null){
        document.getElementById("saveLocalStorageMainFocus").innerHTML = inStoragFocus;
    }

    function submitFocus() {
        const text = focusInput.value;
        localStorage.setItem("focus", text);
    }
    focus.addEventListener("submit", submitFocus);
 

}