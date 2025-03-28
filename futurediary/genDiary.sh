#!/bin/bash

echo -e "<!DOCTYPE html>
<html>
<head>
  <title>FutureDiary</title>
  <link rel=\"stylesheet\" href=diary.css>
</head>
<body>
<div id=\"pre-content\">
<div id=\"title-content\">
<span id=\"main-heading\">
<h1>Future Diary</h1> </span>
<span id=\"main-image\">
<img src="futurediarymedia/yukki.gif" alt="futureDiaryGIF"></span>
</div>
I named this diary as <b>"Future Diary"</b> just in the hope that some day this will turn into an actual one, as happened in the anime <br>\n
In this page/diary I will be adding my blogs that contain different categories like <br> \n 
[ CS ] for computer science related stuff<br>
[ Normal ] for daily life <br>
[ category ] for that category [idk whatever] <br> 
Hope you enjoy :) <br>
Have a good time ;) <br>
<label for=\"category-select\">Select Category</label>
<select id=\"category-select\" onclick=\"filterblogs()\">
<option value=\"all\">All</option>
<option value=\"CS\">CS</option>
<option value=\"Normal\">Normal</option>
</select>
</div> \n " > futurediary.html

as=$(ls *.html | grep -v "futurediary.html" | sort -rt"-" -k4,4rn -k2,2rM -k3,3rn) # -rn reverse number order , M - months 
for file in $as; do
    if [[ "$file" !=  "futurediary.html" ]]; then
      Heading=$(sed -n "s:.*<title>\(.*\)</title>.*:\1:p" $file)
      Category=$(sed -n "s:.*<sub id=\"blog-category\">\[\(.*\)\]</sub>.*:\1:p" $file)
      Preview=$(sed -zn "s:.*<p id=\"blog\">\(.*\)</p>.*:\1:p" $file | head -n 2 | sed "s/<br>//g" )
      time=$(python estTime.py $file)
      date=$(echo $file | cut -d"." -f1)

      echo -e "<br>
      <a href=\"#\" onclick=\"loadImgAndRedirect('$file');return false;\">
      <div class=\"blog-card\"><hr>
      <div class=\"blog-title\">
      <b>$Heading</b>
      <span class=\"date\">$date</span>
      </div>\n<span class=\"tag $Category\">$Category</span>
      <span class=\"time\">$time</span>
      <br>
      <span class=\"blog-preview\">$Preview<br></span>
      <hr>
      </div>
      </a>
      " >> futurediary.html
    fi
done

echo -e "
<a href="trash/trash.html">trash</a>
\n\n<br>\n 
<img id=\"loading-img\" src=\"futurediarymedia/death-note.gif\" alt=\"loading image\" style=\"display: none; width:100vw;height:100vh;position:fixed;  top:0vh;\"> \n\n 
<script>\n 
function loadImgAndRedirect(uri){
  const img=document.getElementById('loading-img');
  img.style.display=\"block\"; //shows image \n

  setTimeout (()=>{
  window.location.href=uri // refering to our target page 
},1000); // waiting for 2 seconds 
}\n
function filterblogs(){
  const category=document.getElementById(\"category-select\").value; 
  console.log(category);
}
</script>
</body>
</html>
" >> futurediary.html
