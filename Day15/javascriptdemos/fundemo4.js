function doHomework(subject,callback){

    //using back tick dyanamic value
    console.log(`doing my ${subject} homework`)
    //alertFinshed();
    callback();
}

function alertFinshed(){
    console.log("Home work finished")
}
doHomework("Science",alertFinshed)