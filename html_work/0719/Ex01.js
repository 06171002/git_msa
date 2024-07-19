//let 변경가능한 변수
//const 변경불가능한 상수
const aa = document.getElementById("btn-min");
const bb = document.getElementById("btn-max");
const printDiv = document.getElementById("print-div");

const n1 = document.getElementById("num1");
const n2 = document.getElementById("num2");
const n3 = document.getElementById("num3");
const n4 = document.getElementById("num4");
const n5 = document.getElementById("num5");

function min(){
  const arr = [n1.value,n2.value,n3.value,n4.value,n5.value];
  let min = n1.value;
  for (let index = 0; index < arr.length; index++) {
    const element = arr[index];
    if(min>element)
      min = element;
  }
  printDiv.textContent = "최솟값 = " +min;
}
function max(){
  const arr = [n1.value,n2.value,n3.value,n4.value,n5.value];
  let max = arr[0];
  for (const key of arr){
    if(Number(max) < Number(key)){
      max = key;
    }
  }
  printDiv.textContent = "최댓값 = "+ max;
}

aa.addEventListener('click',min);
bb.addEventListener('click',max);

