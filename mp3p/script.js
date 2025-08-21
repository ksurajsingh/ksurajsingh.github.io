console.log("JS Loaded 😋");
// const dir="/mnt/KSS/Media/songs/"
const dir="http://localhost:8055/."
const rawSongs=fetch(dir);
console.log("fetched huh");
console.log(rawSongs);
