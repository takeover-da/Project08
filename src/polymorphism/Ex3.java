package polymorphism;

public class Ex3 {

	public static void main(String[] args) {

		moveAnimal(new Human()); //Animal animal = new Human()
		moveAnimal(new Tiger()); //Animal animal = new Tiger()
		moveAnimal(new Eagle()); //Animal animal = new Eagle()
		
	}

	public static void moveAnimal(Animal animal) {
		animal.move();  // 재정의된 메소드가 호출됨.
	}
	
}

