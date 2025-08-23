console.log("Password validator\n\n\n");


function validator(pass){
    const length=pass.length>=8;
    const hasUpper=/[A-Z]/.test(pass);
    const hasLower=/[a-z]/.test(pass);
    const hasDigit=/\d/.test(pass);
   return length && hasUpper && hasLower && hasDigit;
}

function validate(password){
if(validator(password)){
  console.log("Good");
}
else{
  console.log("The password should be atleast 8 characters long and should have atleast one upper and one lower case character");
}
}

validate("test8aaaaaaA");
