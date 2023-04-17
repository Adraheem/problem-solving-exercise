function findListOfProducts(arr = []) {
  let nArr = [];
  for (let i = 0; i < arr.length; i++) {
    const product = arr.reduce((a, b, idx) => a * (idx === i ? 1 : b), 1);
    nArr.push(product);
  }
  return nArr;
}

const arr = [1, 2, 3, 4];
const arr2 = [4, 2, 1, 5, 0];
console.log(findListOfProducts(arr));
console.log(findListOfProducts(arr2));
