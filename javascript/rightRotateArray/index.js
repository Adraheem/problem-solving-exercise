function rotateArray(arr = []) {
  const lastEl = arr[arr.length - 1];
  return [lastEl, ...arr.slice(0, arr.length - 1)];
}

console.log(rotateArray([1, 2, 3, 4, 5]));
