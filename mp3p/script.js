console.log("JS Loaded 😋");

// test connection to server
async function testConnectionToServer(){
  const dir="http://localhost:8055/.";
  const respraw=await fetch(dir);
  const resp=await respraw.json()
  console.log(resp.message);
}


// fetch songs from server
async function getSongs(){

  // const dir="/mnt/KSS/Media/songs/"
  const dir="http://localhost:8055/songs";
  const respraw=await fetch(dir);
  const resp=await respraw.json();
  console.log(resp.message);
  return resp;

}

// initialise processes for the client
function init(){
testConnectionToServer();
const songsList=getSongs()
}

init();
