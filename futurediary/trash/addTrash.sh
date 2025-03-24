#!/bin/bash 

echo -e "<!DOCTYPE html>\n
<html>\n
<head>
  <title>Trash</title>\n
  <link rel=\"stylesheet\" href=\"diary.css\">
</head>\n
<body>\n
<h1>TRASH</h1>
<br>These are philosophies/rules that I once thought were good/helpful. <br>\n

But no. This DOES NOT work , philosophies . . rules . . just <b>DOESN'T MATTER</b>. <br>\n

<blockquote>There are no rules</blockquote><br>\n 
Even I once thought that these philosophies and rules / ``way of life`` existed.<br>\n 
So the following are a few ideologies that I came up with back then.<br> \n 
Before you read : <br>\n
Remember as much satisfying or true as they feel | they just ``<b>don't matter</b>``<br>\n 
<em> No USE </em>\n 
<br> " > trash.html

for file in *.html; do 
  if [[ "$file" != "trash.html" ]]; then 
    Heading=$(sed -n "s:.*<title>\(.*\)</title>.*:\1:p" $file)
    Category=$(sed -n "s:.*<sub id=\"blog-category\">\[\(.*\)\]</sub>.*:\1:p" $file)
    Preview=$(sed -zn "s:.*<p id=\"blog\">\(.*\)</p>.*:\1:p" $file | head -n 2 | sed -n "s/<br>//gp" )
    time=$(python estTime.py $file)
    date=$file
    echo -e "<br><div class=\"blog-title\"><a href=\"$file\">$Heading</a><span class=\"date\">$date</span></div><br>\n<span class=\"tag philosophy\">$Category</span><span class=\"time\">$time</span><br>\n$Preview<br><br>" >> trash.html 
  fi
done
