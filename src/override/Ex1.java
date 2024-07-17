package override;

public class Ex1 {

	public static void main(String[] args) {

		//일반 등급은 정가를 그대로 지불
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000);
		customer.showInfo();

		// VIP 등급은 10% 할인받아서 9000원을 지불
		VIPCustomer vipCustomer = new VIPCustomer("또치");
		vipCustomer.calcPrice(10000);
		vipCustomer.showInfo();
		
	}

}

//일반회원 클래스
class Customer {
	
	String customerName;	// 회원이름
	String customerGrade;	// 회원등급
	double bonusPoint;		// 보너스포인트
	double bonusRatio;		// 적립률
	
	// 고정값은 생성자에서 초기화
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
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
	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusPoint = 0.05;
		saleRatio = 0.1;
		
	}

	
	// 재정의 규칙: 선언부 그대로, 구현부만 변경
	@Override
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio); //할인률을 적용해서 할인가 구하기
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다."); //할인된 가격을 지불
	}
	
}

