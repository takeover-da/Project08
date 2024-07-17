package typecasting;

public class Ex1 {

	public static void main(String[] args) {

		VIPCustomer vipCustomer = new VIPCustomer();
		
		
	}

}

//일반회원 클래스
class Customer {
	
	String customerName;	// 회원이름
	String customerGrade;	// 회원등급
	double bonusPoint;		// 보너스포인트
	double bonusRatio;		// 적립률
	
	// 고정값은 생성자에서 초기화
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	// 보너스 포인트 적립하고 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + 
							price + "원을 결제했습니다.");
	}
	
	// 출력 메소드
	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " +
							customerGrade + "이며, 보너스 포인트는 " +
							bonusPoint + "입니다.");
	}
	
}

//VIP회원 클래스
class VIPCustomer extends Customer {  // 상속받기
	
	double saleRatio;  // 할인률
	
	// 고정값은 생성자에서 초기화
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusPoint = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}