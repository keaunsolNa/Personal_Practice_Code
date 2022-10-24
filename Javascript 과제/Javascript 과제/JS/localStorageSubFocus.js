function saveFocus(){
    const id = Date.now();
    const subFocus = document.querySelector("#saveLocalStorageSubFocus");
    const subFocusInput = document.querySelector("#saveLocalStorageSubFocus input");

    function submitSubFocus() {
        const text = subFocusInput.value;
        let arr =
        [
            {
                key : id, 
                value : text
            }
        ]
            
        var newlang = JSON.parse(localStorage.getItem("subForcus") || "[]");
        newlang.push(arr);
        localStorage.setItem('subForcus', JSON.stringify(newlang));
        
    }

    subFocus.addEventListener('submit', submitSubFocus);

}