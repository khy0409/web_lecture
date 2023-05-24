package day02;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	Member () {
	}
	
	Member (String name, String id) {
		this(name, id, null, 0);
	}
	
	

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}

	Member (String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
