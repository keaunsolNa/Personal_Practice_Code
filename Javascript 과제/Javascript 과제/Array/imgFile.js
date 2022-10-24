const ImgArray = [

    {
        key : 'image/1.jpg'
    },

    {
        key : 'image/2.jpg'
    },

    {
        key : 'image/3.jpg'
    },

    {
        key : 'image/4.jpg'
    },   

    {
        key : 'image/5.jpg'
    },

    {
        key : 'image/6.jpg'
    },   

    {
        key : `image/7.jpg`
    },   

    {
        key : `image/8.jpg`
    },    

    {
        key : `image/9.jpg`
    },    

    {
        key : `image/10.jpg`
    }

]
function getImg(){

    var url = "url(" + ImgArray[Math.floor(Math.random()*10)].key + ")";
    return url;
}
