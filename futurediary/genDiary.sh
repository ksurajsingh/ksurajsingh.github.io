#!/bin/bash

echo -e "<!DOCTYPE html>
<html>
<head>
  <title>FutureDiary</title>
  <link rel=\"stylesheet\" href=diary.css>
</head>
<body>
<div id=\"pre-content\">
<h1>Future Diary</h1> \n 
I named this diary as <b>"Future Diary"<b> just in the hope that some day this will turn into an actual one, as happened in the anime <br>\n
In this page/diary I will be adding my blogs that contain different categories like <br> \n 
[ CS ] for computer science related stuff<br>
[ Normal ] for daily life <br>
[ category ] for that category [idk whatever] <br> 
Hope you enjoy :) <br>
Have a good time ;) <br>
</div> \n " > futurediary.html

for file in *.html; do
    if [[ "$file" !=  "futurediary.html" ]]; then
      Heading=$(sed -n "s:.*<title>\(.*\)</title>.*:\1:p" $file)
      Category=$(sed -n "s:.*<sub id=\"blog-category\">\[\(.*\)\]</sub>.*:\1:p" $file)
      Preview=$(sed -zn "s:.*<p id=\"blog\">\(.*\)</p>.*:\1:p" $file | head -n 2 | sed "s/<br>//g" )
      time=$(python estTime.py $file)
      date=$(echo $file | cut -d"." -f1)

      echo -e "<br>
      <a href=\"#\" onclick=\"loadImgAndRedirect('$file')\";return false; \">
      <div class=\"blog-card\"><hr>
      <div class=\"blog-title\">
      $Heading
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
<img id=\"loading-img\" src=\"futurediarymedia/loading.jpg\" alt=\"loading image\" style=\"display: none\"> \n\n 
<script>\n 
function loadImgAndRedirect(uri){
  const img=document.getElementById('loading-img');
  img.style.display=\"block\"; //shows image \n

  set Timeout (()=>{
  window.location.href=uri // refering to our target image 
},2000); // waiting for 2 seconds 
}\n
</script>
</body>
</html>
" >> futurediary.html
