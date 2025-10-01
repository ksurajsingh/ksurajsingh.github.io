let arr = [5, 4, 0, 9, 0, 1, 4, 4, 7, 8];

// let newarr = arr; doesn't copy just references [ I think this is called deep copy ]
let newarr = [...arr]

console.log("Doubling the value of each element in the array.");
console.log("Only one of the consequtive duplicates, selected randomly");

for (i = 0; i < arr.length; i++) {
  let rand = ((Math.random() % 2) + 1).toFixed(0);
  console.log(rand)
  if (rand == 1) {
    if (arr[i] == arr[i + 1]) {
      continue
    } else {
      arr[i] = arr[i] * 2;
    }
  } else {
    if (arr[i] == arr[i + 1]) {
      arr[i] = arr[i] * 2;
      i++
    } else {
      arr[i] = arr[i] * 2;
    }
  }
}

console.log(arr);
