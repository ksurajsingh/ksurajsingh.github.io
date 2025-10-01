let e = document.createElement("div");
document.body.appendChild(e);
e.classList.add("ready-element");
e.innerText = "READY";

var num;

async function fun(){

num = new Promise((resolve, reject) => {

setTimeout(() => {

  console.log("Promise function getting executed . . .")

    let rand = Math.random();
    function suc() {
      console.log("above 0.5")
    }
    function rej() {
      console.log("below 0.5")
    }
    if (rand > 0.5) {
      resolve(suc);
    }
    else {
      reject(rej);
    }

},3000)
})
}



async function main(){

  console.log("Inside the main function");

  await num.then(fn => fn()) // for resolved 
  .catch(fn => fn()); // for reject

}

fun();
main();
rand();

var dive;
function rand(){
  console.log("\n\n\n\nLook HERE 👇")
  let rand=Math.random()*10;
  rand=rand.toFixed(0)
  try{
    if(rand>5){
      dive=document.getElementsByClassName("rand-div")[0]
      dive.innerText=`${dive.innerText} ${rand}`;
    }else{
      throw new Error("Value was not greater than 5 instead it was : "+rand)
    }
  }catch(error){
   console.log("This was a custom geenrated error and being used by the catch(error) clause \n The error is : ",error);
  }finally{
    console.log("This was executed by finally clause in order to show the original random number generated - ",rand);
  }
}
