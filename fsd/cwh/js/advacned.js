async function sleep() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(45)
    }, 1000)
  })
}

(async function main() {
  let a = await sleep();
  let b = await sleep();
  console.log(a + "\n" + b)
})()


let [x, y] = [1, 2];
console.log(x, y);

[x, y] = [1, 2, 3];
console.log(x, y);

let [aa, bb, ...c] = [1, 2, 3, 4, 5, 6]
console.log(aa, bb, c);

// for objects
let obj = {
  a: 100,
  b: 200,
  c: 3
}
let { a, b } = obj;
console.log(a, b)



if(localStorage.getItem("name")){
console.log(localStorage.getItem("name"));
}else{
  let name = prompt("Enter your name")
  localStorage.setItem("name",name);
  console.log("stored in local as:",name);
}
