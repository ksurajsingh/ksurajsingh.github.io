#!/bin/bash

echo -e "
<!DOCTYPE html>\n
<html>\n
<head>\n
  <title>FutureDiary</title>\n
  <link rel=\"stylesheet\" href=diary.css>\n
</head>\n
<body>\n
<div id=\"pre-content\">\n
<h1>Future Diary</h1> \n 
I named this diary as <b>"Future Diary"<b> just in the hope that some day this will turn into an actual one, as happened in the anime <br>\n
In this page/diary I will be adding my blogs that contain different categories like <br> \n 
[ CS ] for computer science related stuff<br>\n 
[ Normal ] for daily life <br>\n 
[ category ] for that category [idk whatever] <br> \n 
Hope you enjoy :) <br> \n 
Have a good time ;) <br> \n " > futurediary.html

for file in *.html; do
    if [[ "$file" !=  "futurediary.html" ]]; then
      Heading=$(sed -n "s:.*<title>\(.*\)</title>.*:\1:p" $file)
      Category=$(sed -n "s:.*<sub id=\"blog-category\">\[\(.*\)\]</sub>.*:\1:p" $file)
      Preview=$(sed -zn "s:.*<p id=\"blog\">\(.*\)</p>.*:\1:p" $file | head -n 2 | sed "s/<br>//g" )
      time=$(python estTime.py $file)
      date=$(echo $file | cut -d"." -f1)

      echo -e " " >> futurediary.html
    fi
done


