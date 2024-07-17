package inheritance.quiz;

public class Quiz3 {

	public static void main(String[] args) {

		// 볼펜
		Bolpen bolpen = new Bolpen();
		bolpen.volt = 2;
		bolpen.amountLeft = 100;
		bolpen.penColor = "blue";
		
		// 만년필
		FountainPen fp = new FountainPen();
		fp.volt = 3;
		fp.amountLeft = 80;
		fp.brand = "MONTBLANC";
		
	}

}

// 펜 클래스
class Pen {
	
	int volt;  			// 펜의 굵기
	double amountLeft;  // 남은 양
}

// 볼펜 클래스
class Bolpen extends Pen {
	
	String penColor;	// 볼펜의 색
}

// 만년필 클래스
class FountainPen extends Pen {
	
	String brand;		// 회사명
}