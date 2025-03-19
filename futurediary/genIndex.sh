#!/bin/bash

echo -e "<h1> Hello Friend</h1> \n I named this diary as *"Future Diary"* just in the hope that some day this will turn into an actual one, as happened in the anime" > futurediary1.html

echo -e "\n\n <ul>\n" >> futurediary1.html
for file in *.md; do
    if [[ "$file" !=  "futurediary.md" ]]; then
        echo "<li> <a href="$file"> ${file%.md}</a></li>" >> futurediary1.html
    fi
done

echo -e "\n </ul>" >> futurediary1.html

