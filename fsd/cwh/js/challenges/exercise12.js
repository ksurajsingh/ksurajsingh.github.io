const rand=()=>Math.floor(Math.random()*256)
const randcol=()=>`rgb(${rand()},${rand()},${rand()})`

for(let i=0;i<50;i++){
setTimeout(()=>{
document.querySelectorAll(".box").forEach((e)=>{
  e.style.backgroundColor=randcol();
  e.style.color=randcol();
  console.log(randcol());
})
},100*(i+1));
}
