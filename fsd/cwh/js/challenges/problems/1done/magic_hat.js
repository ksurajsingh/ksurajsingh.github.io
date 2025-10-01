houses=["Gyffindor","Hufflepuff","Ravenclaw","Slytherin"]
names=["Zephra","Montelior","Arvyn","Lurelia","Vexandar","Joriven","Thalindra","Brennok","Sylvenia","Kaelthor","Draxil","Myrandae","Zenthira","Calvaren","Vornicel","Eryndor","Quirelith","Halvaron","Nymerion","Tyrendil","Ashrien","Fenloria","Drovenic","Malovar","Iravelle","Nomari","Travenor","Virelios","Zolatheon","Lumiranth","Seradric","Korvalen","Elantris","Xandrenil","Aeloria","Gorthien","Tyvenil","Orvaneth","Brelianthe","Cylvador","Rhavelyn","Thandarel","Omelien","Vexoria","Kaithorne","Ryvellan","Elandros","Zarnivox","Myntheria","Faelorin","IwillAddOneMyself"]

let map={
  gryffindor:[],
  hufflepuff:[],
  ravenclaw:[],
  syltherin:[],
}
function sort(names){
  console.log(names);
  names.forEach(element => {
    console.log(element.length)
    if(element.length<6){  // better to assign the limit to a variable already instead of hardcoding. Like - gryffindorlen=6
      map.gryffindor.push(element);
    }else if(element.length<8){
      map.hufflepuff.push(element);
    }else if(element.length<12){
      map.ravenclaw.push(element);
    }else{
      map.syltherin.push(element);
    }
  });
}

sort(names)
console.log(map);
