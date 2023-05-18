//:태그에 해당되는 모든 요소 배열로 반화
//const title = document.getElementsByTagName("h1")
//console.log(title);

//:id값 기준으로 가장 먼저 찾은 요소
const title = document.getElementById("title");
console.log(title);

//:class값을 가지고 있는 모든 요소 배열로 반환
const wrapper = document.getElementsByClassName("wrapper");
console.log(title);

//CSS 선택자 방식으로 요소를 가져오는 방식
//태그는 태그이름으로, id는 #id로, class는 .class로 접근
//:해당 선택자 기준으로 가장 먼저 찾은 요소
const t1 = document.querySelector(".wrapper #title");
console.log(t1);

//:여기서 사용가능한 모든 함수 보여줌
console.dir(t1);

//t1(id=title)을 밥먹자로 바꿈
t1.innerHTML = "밥먹자";

//innerHTML=html 문법으로 알아서 바꿔줌
//innerTEXT=텍스트만 바꿈

//t1글자색 블루로 **권장X
//t1.style.color = "blue";

//CSS에 있는 태그 받아옴 **이거 위 대신 이거 사용
t1.classList.add("textBlue");
//t1.style.backgroundColor;
//t1.style[backgroundColor];

//:해당 선택자와 매치되는 모든 요소 배열
//const allH1 = document.querySelectorAll("H1");
//console.log(allH1);

//****************************** */
const click = function () {
  alert("클릭되었습니다");
};
t1.addEventListener("click", click);


