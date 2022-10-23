const aphorism = [

    {
        text : "When I let go of what I am, I become what I might be.",
        author : "- Lao Tzu -", 
    },

    {
        text : "삶이 있는 한 희망은 있다",
        author : "- 키케로 -", 
    },

    {
        text : "산다는것 그것은 치열한 전투이다.",
        author : "로망로랑", 
    },

    {
        text : "진정으로 웃으려면 고통을 참아야하며 , 나아가 고통을 즐길 줄 알아야 해 ",
        author : "- 찰리 채플린 -", 
    },   

    {
        text : "피할수 없으면 즐겨라 ",
        author : "- 로버트 엘리엇 -", 
    },

    {
        text : "먼저 자신을 비웃어라. 다른 사람이 당신을 비웃기 전에",
        author : "- 엘사 맥스웰 -", 
    },   

    {
        text : "절대 어제를 후회하지 마라 . 인생은 오늘의 나 안에 있고 내일은 스스로 만드는 것이다",
        author : "- L.론허바드", 
    },   

    {
        text : "내일은 내일의 태양이 뜬다",
        author : "- None - ", 
    },    

    {
        text : "1퍼센트의 가능성, 그것이 나의 길이다. ",
        author : "- 나폴레옹 - ", 
    },    

    {
        text : "꿈을 계속 간직하고 있으면 반드시 실현할 때가 온다.",
        author : "- 괴테 -", 
    }

]

function getAphorism(){
    document.getElementById("aphorismDiv").innerHTML = 
    aphorism[Math.floor(Math.random()*10)].text + " " + aphorism[Math.floor(Math.random()*10)].author;
    document.getElementById("aphorismDiv").style.color="white"
}


