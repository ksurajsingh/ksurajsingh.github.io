// const app = require("express")
// NO require("express") returns the express module not the instance
// you need to create the instance by calling it 
const express = require("express")
const app = express()
const blogs = require("./router/blogs")
// links the variable blogs to the router dir's BLOG file - required by the express.Router() in that file
const morgan = require("morgan") // for logging
app.use(morgan("tiny"))
const PORT=8055

app.get("/",(req,res)=>{
  res.send("Hi from the server")
})

app.use(express.static("static"))
app.use("/blogs",blogs) // states that all '/blogs' endpoints should be served from blogs
// The above part is called declaring router 



app.listen(PORT,(e)=>{
  if(e) return console.error(e);
  console.log(`Server start successfully at: http://localhost:${PORT}`)
})
