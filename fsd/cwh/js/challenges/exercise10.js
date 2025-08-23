i=1
while(i<10){

let ran=Math.random()
const adj={
  1:"Crazy",
  2:"Amazing",
  3:"Fire",
}
const adjn=adj[picker(ran)];



ran=Math.random()
const other={
  1:"Bros",
  2:"Limited",
  3:"Hub"
}
const othern=other[picker(ran)];

ran=Math.random()
const shop={
  1:"Engine",
  2:"Food",
  3:"Garments"
}
const shopn=shop[picker(ran)];

function picker(ran){
  if(ran<0.33){
  return 1;
}else if(ran>0.33 && ran<0.66){
  return 2;
}else{
  return 3;
}
}


  console.log(adjn+" "+shopn+" "+othern)
  i++
}
