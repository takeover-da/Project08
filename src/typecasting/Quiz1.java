package typecasting;

public class Quiz1 {

	public static void main(String[] args) {

		Parents pc = new Child("한국", "고", "길동");
		
		Child child = new Child("한국", "고", "길동");
		
	}

}

// 부모 클래스
class Parents {
	
	String nationality;  //국적
	String lastName;     //성
	
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
	
}

// 자식 클래스
class Child extends Parents {
	
	String firstName;   //이름

	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
}