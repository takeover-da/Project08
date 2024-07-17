package override.quiz;

// 핵심 포인트! => 재정의!
public class Quiz1 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();
		
	}

}

// 동물 클래스
class Animal {
	
	public void eat() {
		System.out.println("먹이를 먹는다");
	}
	
	public void sound() {
		System.out.println("짖는다");
	}
	
}

// 고양이 클래스
class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 짖는다");
	}
	
}


// 강아지 클래스
class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("개는 고기를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("개는 멍멍하고 짖는다");
	}

}
