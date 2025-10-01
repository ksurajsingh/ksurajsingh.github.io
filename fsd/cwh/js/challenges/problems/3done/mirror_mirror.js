let string = "cohort"

let mstring = "";  // not good - since this makes the function non-reusable declare this variable inside the function

function mirror(string) {
  for (i = string.length - 1; i >= 0; i--) {
    mstring += string[i];
  }
}
mirror(string)
console.log(string + mstring)
