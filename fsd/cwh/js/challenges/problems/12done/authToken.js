user ={
  name:'',
  curTok:'',
}


expT=10

function genToken(){
  const token=Math.random().toString(36).slice(2);
  return token
}


function assignTokTo(user,tok){
  user.curTok=tok;
  localStorage.setItem("token",JSON.stringify(user));
  return new Promise(resolve=>{
  setTimeout(()=> {
    user.curTok='';
    localStorage.setItem("token",JSON.stringify(user));
    resolve("Token revoked")
  }, expT*1000); // 10 seconds
})
}



tok=genToken()
console.log(`Token : ${tok}`)
let msg=assignTokTo(user,tok)
setInterval(() => {
 console.log(user,msg) 
}, 1000);

