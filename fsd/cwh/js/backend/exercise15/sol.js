const fs = require("fs/promises");
const path = require("path")

// READ FILES
const files=["name.jpg","name.png","this.pdf","that.zip","dog.zip","cat.jpg"]

// CREATE FILES
// files.forEach(element => {
//   fs.writeFile(element,"");
// });

async function getFiles(){
  const test= await fs.readdir(".")  
  console.log(test)
  return test 
}

// MAKE DIRECTORIES
// (async()=>{
//   const mine=await getFiles()
//   mine.forEach(element => {
//     dirName=path.extname(element).split('.')[1]
//     fs.mkdir(dirName)
//   });
// })()

// MOVE FILES
(async()=>{
  files.forEach(element => {
    const ext=path.extname(element).split('.')[1]
    fs.rename(element,`${ext}/${element}`)
  });
})()
