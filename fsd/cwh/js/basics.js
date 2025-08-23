console.log("Hello World!!")
alert("Hello World!")
var a = prompt("give a value: ")
console.log("The number is: " + a)
var isTrue = confirm("Are you sure\n You wanna leave?\n [ check console ]")

if (isTrue) {
  console.log("Your computer is blasting")
}
else {
  console.log("You computer is not blasting")
}

const ghost = {
  face: '👻'
}

const goat = {
  face: '🐐'
}

function hello(){ return this.face };

const result = hello();

console.log(result)

document.title = `hello ${a}`;
