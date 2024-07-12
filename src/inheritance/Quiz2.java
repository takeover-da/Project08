package inheritance;

public class Quiz2 {

	public static void main(String[] args) {

		BasicTV basicTV = new BasicTV();
		basicTV.power = true;
		basicTV.channel = 7;
		basicTV.volume = 20;
		
		SmartTV smartTV = new SmartTV();
		smartTV.power = true;
		smartTV.channel = 11;
		smartTV.volume = 30;
		smartTV.ip = "192.168.0.111";
		
	}

}

// 베이직티비 클래스
class BasicTV {
	boolean power;
	int channel;
	int volume;
}

// 스마트티비 클래스
class SmartTV extends BasicTV {
	String ip;
}