names=["Zephra","Montelior","Arvyn","Lurelia","Vexandar","Joriven","Thalindra","Brennok","Sylvenia","Kaelthor","Draxil","Myrandae","Zenthira","Calvaren","Vornicel","Eryndor","Quirelith","Halvaron","Nymerion","Tyrendil","Ashrien","Fenloria","Drovenic","Malovar","Iravelle","Nomari","Travenor","Virelios","Zolatheon","Lumiranth","Seradric","Korvalen","Elantris","Xandrenil","Aeloria","Gorthien","Tyvenil","Orvaneth","Brelianthe","Cylvador","Rhavelyn","Thandarel","Omelien","Vexoria","Kaithorne","Ryvellan","Elandros","Zarnivox","Myntheria","Faelorin","IwillAddOneMyself"]
keyword="zep"
function searchCaseSensitive(key){
  console.log("When searching with Cases considering");
  console.log(names.filter(e => new RegExp(key).test(e) ))
}

function searchCaseInsensitive(key){
  console.log("When searching without cases considering");
  console.log(names.filter(e => e.toLowerCase().includes(key.toLowerCase())));
}
console.log(names)
console.log(`Searching for : ${keyword}`)
searchCaseSensitive(keyword)
searchCaseInsensitive(keyword)
