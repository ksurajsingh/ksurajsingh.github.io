const fs = require("fs");

console.log(fs)

fs.writeFileSync("text.txt","this is a test")
console.log("written text")
// this will be executed only after writeFileSync
// as that is a blocking code - it says Sync in the name 
 

// fs.write("test2.txt","this is second test") requries a fd instead of a filename 
// instead use 

// fs.writeFile("text2.txt","This is second test");  needs cb [call-back] mandatorily


// fs.writeFile("text2.txt","This is second test",(()=>{}));
// console.log("written to text2.txt")



// loggin can be done in the same functoin
// fs.writeFile("text2.txt","This is second test",(()=>{console.log("written text2")}));



// you don't even have to `cat` our the file to verify
fs.writeFile("text2.txt","This is second test",
  (()=>{
    console.log("written to text2.txt")
    fs.readFile("text2.txt",(error,data)=>{
      console.log(data.toString());
    });
})) 


// keep nesting like this and it is called a call back hell 
// instead use `await`
