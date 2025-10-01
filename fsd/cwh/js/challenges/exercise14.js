let e=()=>{
  const el=document.createElement("div");
  document.body.appendChild(el);
  el.classList.add("msg")
  return el;
}

async function showDots(element,baseText){
  return new Promise(resolve => {
  let count=0;
  console.log(element,baseText)
  const interval=setInterval(()=>{
    const dots='. '.repeat(count%4);
    element.innerText=`${baseText} ${dots}`
    count++;
  if(count==4){
    clearInterval(interval);
    resolve();
  }
  },3000);
  });
}

const messages=[
  "Initializing Hacking",
  "Reading your files",
  "Password files Detected",
  "Sending all passwords and perosnal files to server",
  "clearning up"
]

const sleep=ms=>new Promise(resolve=>setTimeout(resolve,ms)); 

async function main(){
  for (const msg of messages){
  console.log(rand=((Math.random()*10)%7))
  await sleep(rand*1000);
  await showDots(e(),msg);
}
}

main()
