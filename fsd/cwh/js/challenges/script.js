ran=Math.random();

alert(`rand: ${ran}`)

var a=prompt("Enter 1st operand");
var b=prompt("Enter 2nd operand");
var op=prompt("Enter operation");


const faltse={
  '+':'-',
  '*':'+',
  '-':'/',
  '/':'**'
}

if(ran>0.1){
  calc();
}
else{
  fal_calc();
}


function calc(){
  console.log(`The result is: ${eval(`${a} ${op} ${b}`)}`);
  alert(`The result is ${eval(`${a} ${op} ${b}`)}`);
  // sum(a,b);
  // sub(a,b);
  // mul(a,b);
  // div(a,b);
}

function fal_calc(){
  op=faltse[op]
  console.log(`The result is: ${eval(`${a} ${op} ${b}`)}`);
  alert(`The result is ${eval(`${a} ${op} ${b}`)}`);
  // fsum(a,b);
  // fsub(a,b);
  // fmul(a,b);
  // fdiv(a,b);
}

function sum(a,b){
  console.log(`The sum of ${a} and ${b} is :${a+b}`);
}
function sub(a,b){
  console.log(`The diff of ${a} and ${b} is :${a-b}`);
}
function mul(a,b){
  console.log(`The product of ${a} and ${b} is :${a*b}`);
}
function div(a,b){
  console.log(`The quotient of ${a} and ${b} is :${a/b}`);
}


function fsum(a,b){
  console.log(`The sum of ${a} and ${b} is :${a-b}`);
}
function fsub(a,b){
  console.log(`The diff of ${a} and ${b} is :${a+b}`);
}
function fmul(a,b){
  console.log(`The product of ${a} and ${b} is :${a/b}`);
}
function fdiv(a,b){
  console.log(`The quotient of ${a} and ${b} is :${a*b}`);
}


