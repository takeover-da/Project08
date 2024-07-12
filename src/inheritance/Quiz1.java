package inheritance;

public class Quiz1 {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		tiger.leg = 4;
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.leg = 2;
		eagle.wing = 2;
		
	}

}

// 동물 클래스(부모)
class Animal {
	int leg; 
}

// 호랑이 클래스(자식)
class Tiger extends Animal {
	int tail; 
}

// 독수리 클래스(자식)
class Eagle extends Animal {
	int wing; 
}