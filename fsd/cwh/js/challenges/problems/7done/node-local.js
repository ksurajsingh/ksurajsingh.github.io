const {LocalStorage} = require('node-localstorage');
const localStorage = new LocalStorage('./this');

localStorage.setItem('key','value');
localStorage.setItem('StrongestAvenger','IronMan');

console.log(localStorage.getItem('StrongestAvenger'));
