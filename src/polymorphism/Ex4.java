package polymorphism;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		// 일반회원과 VIP회원 추가
		Customer customer1 = new Customer("둘리"); //일반 회원 생성
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜"); //VIP 회원 생성
		Customer customer5 = new VIPCustomer("고길동");

		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
		
		// 회원등급에 따라 할인율과 보너스 포인트 계산
		for (Customer customer : list) {  //변수 : 리스트(람다식)
			customer.calcPrice(10000);
		}
		
		for (Customer customer : list) {
			customer.showInfo();  //고객정보 출력
		}
		
	}

}

