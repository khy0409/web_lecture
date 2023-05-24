package day02;

public class Test02_class01 {
	
	//생성자 : new 키워드와 함께 객체의 초기화 담당
	//기본 생성자는 작성하지 않아도 자동으로 작성됨
	//Test02_class01() {}
	
	//this : 객체 자신 가리킴
	//Test02_class01(String company, int speed) {
	//(company = company;)  -->X
	//this.company = company; -->O
	//this.speed = speed;
	//}
	
	//오버로딩 : overloading
	//매개 변수의 순서, 자료형, 개수에 바뀌면 동일한 이름의 함수를 여러번 재정의 할 수 있음
	//Test02_class01(int speed, String model) {
	//this.speed = speed;
	//this.model = model;
	//}
	
	String company = "현대자동차";
	String model;
	
	int speed;
	
	Test02_class02 body;
}
