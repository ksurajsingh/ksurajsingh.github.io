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
Have a good time ;) <br> \n " > futurediary1.html

echo -e "\n\n <ul>\n" >> futurediary1.html
for file in *.md; do
    if [[ "$file" !=  "futurediary.md" ]]; then
        echo "<li> <a href="$file"> ${file%.md}</a></li>" >> futurediary1.html
    fi
done

echo -e "\n </ul>" >> futurediary1.html

