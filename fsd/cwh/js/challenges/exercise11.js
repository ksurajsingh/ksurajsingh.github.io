// to print the factorial of a given number 

// taking the user input here - 
let n = 65 ;

let arr=[];

for (let i=0;i<n;i++){
  arr[i]=i+1;
}

const red=(a,b)=>{
  return a*b;
}

console.log(arr.reduce(red));

let number = 5 

function fact(number){
  let arr=Array.from(Array(number+1).keys()) // use Arrays(n).keys - to create an array uptil n incrementing including 0
  let c=arr.slice(1,).reduce((a,b)=>a*b) // remove the first element- cuz its 0 +  use the reduce with input a and b and since you aren't using 
  // curly braces just write a*b , a return keyword isn't required
  console.log(c)
}

fact(number)
