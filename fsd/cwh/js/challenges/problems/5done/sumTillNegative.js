sum=0;// do not use global variables for instance problem-solving 
function summation(arr){
  for(i=0;i<arr.length;i++){
    if(arr[i]>=0){
      sum=sum+arr[i];
    }
    else{
      return;
    }
  }
  // always try to return something from the function
}

arr=[2,5,7,-9,4,7,9]

summation(arr)
console.log(sum)
