const express = require("express")
const router = express.Router();
// This part is what defines a router
router.get('/',(req,res)=>{
  res.send("Hi from blog's root")
}) // this is not the root of the project but route of this current router - that is supported by express.Router() which is only called when someone gives and endpoint that has the same name as this file 

router.post('/',(req,res)=>{
  res.send("Take blog")
})


module.exports=router
