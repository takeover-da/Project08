package inheritance;

public class Ex2 {

	public static void main(String[] args) {

		Student student = new Student();
		student.eat();	  // 부모클래스에서 물려받은 기능
		student.sound();  // 부모클래스에서 물려받은 기능
		student.study();  // 자식클래스 기능
		
		Professor professor = new Professor();
		professor.eat();   // 부모클래스에서 물려받은 기능
		professor.sound(); // 부모클래스에서 물려받은 기능
		professor.work();  // 자식클래스 기능
	}

}

// 사람 클래스
class Person {
	
	public void sound() {
		System.out.println("대화를 한다");
	}
	
	public void eat() {
		System.out.println("밥을 먹는다");
	}
}

// 학생 클래스
class Student extends Person {  // 상속 코드 부분!
// 부모클래스안에 내용을 사용하고 싶으면 내용을 따로 추가하지 않고 자식클래스에서 부모클래스를 간단하게 상속하여 사용할 수 있다.	
	public void study() {
		System.out.println("공부를 한다");
	}
}

// 교수 클래스
class Professor extends Person {
	
	public void work() {
		System.out.println("일을 한다");
	}
}