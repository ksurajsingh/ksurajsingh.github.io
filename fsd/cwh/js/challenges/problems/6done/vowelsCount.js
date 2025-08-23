count=0; // please do not use global variables
function countVowel(word){
  // convert string to array 
  let worda=Array.from(word); // unnecessary - I forgot we could use for-of for strings and for-in for arrays
  for(i=0;i<worda.length;i++){
    ch=worda[i].toLowerCase();
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
      count++;
    }
  }
  // could return count
}

countVowel("bhAhAhA")
console.log("Total count of vowels = %d",count);
