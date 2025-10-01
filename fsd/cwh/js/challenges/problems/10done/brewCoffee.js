
// let rand=(Math.random()*10).toFixed(0);
// console.log("rand = %d",rand);
// setTimeout(()=>{
//   console.log("Your coffe is ready ")
// },rand*1000);

// The above code does not solve the question since it is not an async function and does not return a promise 
// `setTimeout` returns a timeoutID and not a promise



function brewCoffee(cof){
let rand=(Math.random()*10).toFixed(0);
  return new Promise(resolve=>{
    setTimeout(()=>{
      resolve(`Your ${cof} is ready`);
    },rand*1000);
  })
}


async function placeOrder(cof){
let rand=(Math.random()*10).toFixed(0);
await new Promise(resolve=>setTimeout(resolve,rand*1000))
console.log(`your order for ${cof} is now confirmed!`)
return await brewCoffee(cof);
}


(async ()=>{
  const msg = await placeOrder("cappachino");
  console.log(msg);
})();
