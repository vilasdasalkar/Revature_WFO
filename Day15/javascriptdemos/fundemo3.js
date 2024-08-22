function doHomework(subject,callback){
    console.log("doing my "+subject+" homework")
    //alertFinshed();
    callback();
}

function alertFinshed(){
    console.log("Home work finished")
}
doHomework("Science",alertFinshed)