window.onload=()=>{
  var bomb;
  var i=0;
  let blast=new Audio("/mnt/KSS/Media/songs/Jiraiya_yooooooooo_sound_effect_from_Naruto-MP3_160K.mp3")

let cannon=document.getElementsByClassName("cannon")[0]
let target=document.getElementsByClassName("target")[0]

  // alert("Interact with browser [ just clcik somethig] inorder to play audio")


cannon.addEventListener("mouseenter",()=>{

  
function shoot(){
  bomb.classList.add("shoot");
}

function celebrate(){
  setInterval(()=>{
    let snow=document.createElement("div");
    snow.classList.add("celebrate");
    console.log("left pos(snow): ",snow.style.left);
    document.body.appendChild(snow);
    snow.style.left=i*10+"px";
    i++;
  },1000)
}

  cannon.classList.add("cannon-hovered")
  bomb=document.createElement("div")
  bomb.classList.add("bomb");
  shoot();
  document.body.appendChild(bomb);


  setTimeout(()=>{
    target.style.background="black";
    target.style.color="white";
    celebrate();//this will use a setInterval
    blast.play();
  },3000);


})

cannon.addEventListener("mouseleave",()=>{
  cannon.classList.remove("cannon-hovered")
  bomb.remove();
  target.style.background="grey";
  target.style.color="black";
})




}
