function fun(...input){
    let sum=0;
    for(let i of input){
        sum+=i;
    }
    return sum;
}
console.log(fun(1,2));
console.log(fun(1,2,6));
console.log(fun(1,2,3,4,5));