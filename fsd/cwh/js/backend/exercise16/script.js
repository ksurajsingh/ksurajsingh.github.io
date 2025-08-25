import express from "express"
import generateRandom from "./generate/gen.js"

const app = express()

app.use(express.static("public"))


app.get("/",(req,res)=>{
  res.send("Hello from root")
})


// app.use("/generate",(req,res)=>{
//   // next();
// })
//
app.get("/generate",(req,res)=>{
  generateRandom();
  res.send("one second")
})


app.listen(8056,(req,res)=>{
  console.log("at http//localhost:8056")
})
