/**
 * @param {number[]} arr
 * @return {boolean}
 */
var validMountainArray = function(arr) {
let length=arr.length;
    let isClimb=true;
    let isUp=false;
    let isDown=false;
    let prev=arr[0];
    for (let i = 1; i <length ; i++) {
        let now=arr[i];
        if(isClimb){
            if(prev<now){
                isUp=true;
                prev=now;
                continue;
            }else if(prev==now){
                return false;
            }else{
                isClimb=false;
                isDown=true;
                prev=now;
                continue;
            }
        }else {
            if(prev>now){
                prev=now;
                continue;
            }else if(prev==now){
                return false;
            }else{
                return false;
            }
        }
    }
    if(isUp && isDown){
        return true;
    }else{
        return false;
    }
};
