#!/bin/bash 

echo -e "<!DOCTYPE html>\n
<html>\n
<head>
  <title>Trash</title>\n
  <link rel=\"stylesheet\" href=\"trash.css\">
</head>\n
<body>\n
<div id=\"pre-content\">\n
<h1>TRASH</h1><div class=\"center\"><img src=\"trashMedia\/178524.gif\" class=\"gifs\"></div>\n
<br>These are philosophies/rules that I once thought were good/helpful. <br>\n

But no. This DOES NOT work , philosophies . . rules . . just <b>DOESN'T MATTER</b>. <br>\n

<blockquote><b>There are no rules</b></blockquote><br>\n 
Even I once thought that these philosophies and rules / ``way of life`` existed.<br>\n 
So the following are a few ideologies that I came up with back then.<br> \n 
Before you read : <br>\n
Remember as much satisfying or true as they feel | they just ``<b>don't matter</b>``<br>\n 
<em> No USE </em>\n 
<br>\n 
</div>\n" > trash.html

for file in *.html; do 
  if [[ "$file" != "trash.html" ]]; then 
    Heading=$(sed -n "s:.*<title>\(.*\)</title>.*:\1:p" $file)
    Category=$(sed -n "s:.*<sub id=\"blog-category\">\[\(.*\)\]</sub>.*:\1:p" $file)
    Preview=$(sed -zn "s:.*<p id=\"blog\">\(.*\)</p>.*:\1:p" $file | head -n 2 | sed -n "s/<br>//gp" )
    time=$(python estTime.py $file)
    date=$(echo $file | cut -d"." -f1) 
    echo -e "<br><a href=\"#\" onclick=\"playGifAndRedirect('$file'); return false;\"><div class=\"blog-card\"><hr><div class=\"blog-title\">$Heading<span class=\"date\">$date</span></div>\n<span class=\"tag philosophy\">$Category</span><span class=\"time\">$time</span><br><span class=\"blog-preview\">\n$Preview<br></span><hr></div></a>" >> trash.html 
  fi
done


echo -e "
\n\n<br>\n
<img id=\"loading-gif\" src=\"trashMedia/anime-vash.gif\" alt=\"Loading\" style=\"display: none \"> \n\n
<script>\n 
    function playGifAndRedirect(uri){\n
      const gif=document.getElementById('loading-gif');
      gif.style.display=\"block\"; // shows gif 

      setTimeout(()=>{
      window.location.href=uri // refering to our target page 
    },2000); // waiting for 2 seconds 
  }
</script> 
</body>
</html>
" >> trash.html
