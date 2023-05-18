const score = prompt("성적을 입력하세요");

const kk = Number(score);

if (Number.isNaN(kk) || kk < 0) {
  console.log("ERROR");
} else if (kk >= 80) {
  console.log("A");
} else if (60 <= kk) {
  console.log("B");
} else if (40 <= kk) {
  console.log("c");
} else {
  console.log("F");
}
