/*
1. SumDouble
*/
function sumDouble(x, y) {
    let sum = x + y;
    if(x === y) {
        sum *= 2;

    }
    return sum;
}
/*
2. HasTeen
*/

function hasTeen(x,y,z){
   
    if(x >= 13 && x <= 19){
       return true;
    }
    if(y >= 13 && y <= 19){
        return true;
    }
    if(z >= 13 && z <= 19){
        return true;
    }
    else{
        return false;
    }
}