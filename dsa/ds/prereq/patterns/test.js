const fs = require("fs")

const path = require("path")

fs.readdir("./", (e, files) => {
  if (e) return console.error(e)
  names = []
  for (const i of files)
    if (path.extname(i) == ".c" || path.extname(i) == ".java" || path.extname(i)==".py")
      console.log(`<li><a href=\".\/patterns\/${i}\">${i}</a></li>`)
})
