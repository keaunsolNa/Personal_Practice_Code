let liTagCount = 1;

function create_liTag() {
    let index = JSON.parse(localStorage.getItem('subForcus')).length;
    for(let i = 0; i < index; i++){
        let new_text = JSON.parse(localStorage.getItem('subForcus'))[i][0].value;
        let new_key = JSON.parse(localStorage.getItem('subForcus'))[i][0].key;
        document.getElementById("tagArea").innerHTML += `<br><li class="subForcusBar">${new_text} <button id="${new_key}"> Done </button></li><br>`;
    }

    for(let i = 0; i < index; i++){
        let new_key = JSON.parse(localStorage.getItem('subForcus'))[i][0].key;
        document.getElementById(new_key).addEventListener('click', function(){remove(i)});
    }

    function remove(i){
        let oldlang = JSON.parse(localStorage.getItem("subForcus"));
        let newlang = JSON.parse(("[]"));

        for(let j = 0; j < index; j++){
            if(i != j){
                newlang.push(oldlang[j])
            }
        }
        localStorage.setItem('subForcus', JSON.stringify(newlang));
        window.location.reload();
    }

}   