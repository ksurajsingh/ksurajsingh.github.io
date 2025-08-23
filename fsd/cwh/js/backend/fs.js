const fs = require("fs");

console.log(fs)

fs.writeFileSync("text.txt","this is a text1")
console.log("written text")
// this will be executed only after writeFileSync
// as that is a blocking code - it says Sync in the name 
 

// fs.write("test2.txt","this is second test") requries a fd instead of a filename 
// instead use 

// fs.writeFile("text2.txt","This is second test");  needs cb [call-back] mandatorily
// or you can avoid cb by awaiting the promise this async `writefile` returns


// fs.writeFile("text2.txt","This is second test",(()=>{}));
// console.log("written to text2.txt")



// loggin can be done in the same functoin
// fs.writeFile("text2.txt","This is second test",(()=>{console.log("written text2")}));



// you don't even have to `cat` our the file to verify

fs.writeFile("text2.txt","This is second test",((e)=>
  {
    console.log("written to text2.txt")
    fs.readFile("text2.txt",(error,data)=>{
      if(error){
        console.log("writing error:\n"+error+"\nmy error written")
      }
      console.log("reading from text2.txt\n"+data.toString());
    });
  }
  )) 

// keep nesting like this and it is called a call back hell 
// instead use `await`


fs.readFile("text2.txt",(e,d)=>{
  if(e) return console.error("Read error: ",e)
  const data=" "+d.toString()
  fs.appendFile("text.txt",data,(e)=>{
    if(e) return console.error("Read error: ",e)
    console.log("Writting text2.txt's content to text.txt\nCheck: \nReading text.txt . . .\n")
      fs.readFile("text.txt",(e,d)=>{
        if(e) return console.error("Return error: ",e);
        console.log(d.toString());
    })
  });
})


// lets learn about Path now

const path = require("path");

console.log("The path is",path.parse("/mnt/KSS/backUps/isos/virtio-win-0.1.271.iso"))

console.log("joining other iso",path.join("/mnt/KSS/backUps/isos","windows_24h2_english.iso"))


// console.log(path.CHECKOTHERS)
// path.dirname()
// path.extname()
// path.normalize()
// path.format()
console.log("The relative path is: ",path.relative("/mnt/KSS/backUps/poco/SAVE_20210504_105008.jpg","/mnt/KSS/backUps/poco/"))

// if you check the above code prints at random events in the terminal .
// This is because the above 2 chunks are async funcs and so they happens in the microtask queue 
