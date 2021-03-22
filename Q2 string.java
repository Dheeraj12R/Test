function binaryReversal(number){

let binaryNum = Number(number).toString(2).split(“”).reverse().join(“”);

return parseInt(binaryNum+”00", 2);

}

binaryReversal(“47”);

console.log(binaryReversal(“47”));
