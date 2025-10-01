function handleSubmit(){
  event.preventDefault();
  console.log("SUIIIIIIII")
  const form=document.getElementById('myform');
  const formData = new FormData(form);
  const key=formData.get('key');
  const value=formData.get('value');
  if(localStorage.getItem(key)){
    console.log("Already there in the localstorage:\n key:%s\nvalue=%s\n",key,localStorage.getItem(key));
    return;
  }
  else{
  console.log("Given key = %s",key);
  console.log("Given value = %s",value);
  localStorage.setItem(key,value);
    // instead try to make this as an object for ex:
    // const note={key,value}
    // localStorage.setItem(note1,JSON.stringify(note))
  console.log("Localstorage set!")
  }
}
