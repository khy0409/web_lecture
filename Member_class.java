package day02;

public class Member_class {

	public static void main(String[] args) {
		Member person = new Member();
		
		Member person2 = new Member("김혜영", "cong", "congcong", 18 ) ;
		
		Member person3 = new Member("김혜영", "cong");
		
		System.out.println(person2.toString());
		System.out.println(person3.toString());
//		System.out.println(person3.name);
//		System.out.println(person.id);
		

	}

}
