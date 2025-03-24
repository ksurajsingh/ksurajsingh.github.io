#!/bin/bash 

echo -e "<!DOCTYPE html>\n<html>\n<title>Trash</title>\n<head>TRASH</head>\n<body>\nThese are philosophies/rules that I once thought were good. <br>\n
But no this does not work , philosophies . . rules . . just don't matter. <br>\n
There are no rules , just to make it relate to you , I have kept the following which I thought matters - back when I used to think rules matter/has impact<br><br><br>\n " > trash.html

for file in *; do 
  Heading=$($file | head -n 1 | sed -n "s/^# //p")
  echo "[$Heading]($file)" >> trash.html 
done
