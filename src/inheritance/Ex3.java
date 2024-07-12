package inheritance;

public class Ex3 {

	public static void main(String[] args) {

		//
		
	}

}

// 일반회원 클래스
class Customer {
	
	String customerName;	// 회원이름
	String customerGrade;	// 회원등급
	double bonusPoint;		// 보너스포인트
	double bonusRatio;		// 적립률
	
	// 고정값은 생성자에서 초기화
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
}