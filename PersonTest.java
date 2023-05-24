package day02;

public class PersonTest {

	public static void main(String[] args) {
		PersonVO hye = new PersonVO();
		
		hye.age = 18;
		hye.gender = "여자";
		hye.height = 153.7;
		hye.name = "김혜영";
		
		System.out.print(hye.name + " ");
		System.out.println("(" + hye.age + ")");
		System.out.println(hye.gender);
		System.out.println(hye.height + "cm");
		

	}

}
