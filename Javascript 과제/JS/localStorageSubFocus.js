function saveFocus(){
    const id = Date.now();
    const subFocus = document.querySelector("#saveLocalStorageSubFocus");
    const subFocusInput = document.querySelector("#saveLocalStorageSubFocus input");

    function submitSubFocus() {
        const text = subFocusInput.value;
        var arr = {
            'id' : id,
            'value' : text
        }
        alert(id)
        localStorage.setItem(id, JSON.stringify(arr));
    }

    subFocus.addEventListener("submit", submitSubFocus);

    alert(id);
    if(localStorage.getItem(id) != null){
        document.getElementById("saveLocalStorageSubFocus").innerHTML += text;
    }
}