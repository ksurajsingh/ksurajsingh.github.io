function Doubler(arr){
  return arr.map(num=>{
    return new Promise(resolve=>{
      setTimeout(()=>{
        resolve(num * 2);
        
      },5000)
    })
  })
}


let arr=[2,5,7,8,99,3];
const result=await Promise.all(Doubler(arr)); // avoid async in the top-most level - browsers are't enough capable
console.log(result);
