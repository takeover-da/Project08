package polymorphism.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		runCar(new Bus());		 // Car car = new Bus()
		runCar(new sportsCar()); // Car car = new sportsCar()
	}

	public static void runCar(Car car) {
		car.run();
	}
}

// 자동차 클래스
class Car {
	
	public void run() {
//		System.out.println("자동차가 달린다");
	}
}

// 버스 클래스
class Bus extends Car {

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
}

// 스포츠카 클래스
class sportsCar extends Car {

	@Override
	public void run() {
		System.out.println("스포츠카가 달린다");
	}
}