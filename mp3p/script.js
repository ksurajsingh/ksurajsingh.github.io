console.log("JS Loaded 😋");

// to get a random integer for a custom range 
function getRandomInt(min,max){

  return Math.floor(Math.random()*(max-min+1)+min);

}

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
  return resp.songs;

}

function test(songsList){

  console.log("tested!")
  // selectedSong=songsList[getRandomInt(0,songsList.length)]
  // console.log(selectedSong);
 
}

function selectSong(songsList){

  return songsList[getRandomInt(0,songsList.length)];

}

// initialise processes for the client
async function init(){

  // test connection
  await testConnectionToServer();

  // fetch songs
  const songsList= await getSongs()

  // select a song 
  const selectedSong= selectSong(songsList);

  // just a test function
  // test(songsList);


  console.log(selectedSong);

}

init();
