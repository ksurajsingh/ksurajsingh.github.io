let uname = [ "hsbc","bitgo","auxia" ]
let salary = [ 2000000,3000000,4000000]
let language = [ "C","python","Java" ]
let city = ["NYC","Carlifornia","Bengaluru"]
let isManager =  ["true","false"]


function rand(i){
  return Math.floor((Math.random()*i)+1)
}


export default function generateRandom(){
  for(let i=0;i<1;i++){
   console.log(uname[rand(2)])
   console.log(salary[rand(2)])
   console.log(language[rand(2)])
   console.log(city[rand(2)])
   console.log(isManager[Math.floor(Math.random()+0.5)])
  }
}


