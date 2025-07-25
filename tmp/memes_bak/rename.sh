#!bin/sh
count = 1 
for file in * ; do 
  if [ -f "$file" ]; then 
    if [ "$file" != "rename.sh" ] ; then 
      ext="${file##*.}"
      mv -- "$file" "$count.$ext"
      ((count++))
    fi
  fi 
done 
