// let rand=(Math.random()*10).toFixed(0);
// console.log("rand = %d",rand);
// setTimeout(()=>{
//   console.log("Your coffe is ready ")
// },rand*1000);

// The above code does not solve the question since it is not an async function and does not return a promise 
// `setTimeout` returns a timeoutID and not a promise



async function placeOrder(cof){
let rand=(Math.random()*10).toFixed(0);
await new Promise(resolve=>setTimeout(resolve,rand*1000))
console.log(`your order for ${cof} is now confirmed!`)
}


(async ()=>{
  const msg = await placeOrder("cappachino");
})();
