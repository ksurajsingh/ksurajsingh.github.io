products={}

function createProduct(name,quant,price){
  products[name]={quant,price}
}


createProduct("lububu",2,200);
createProduct("lububa",6,1200);
createProduct("lububi",5,600);
createProduct("lubube",7,1600);
console.log(products)


function totaller(products){
  let total=0;
  for(let element in products){
    let product=products[element];
    console.log(product.price,product.quant)
    total+=product.price*product.quant; 
  };
  return total;
}

total=totaller(products);
console.log(`Total price: ${total}`)

