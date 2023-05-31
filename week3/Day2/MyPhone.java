package week3.Day2;

public class MyPhone {

	public static void main(String[] args) {

		IPhone i = new IPhone();
		i.startApp();
		i.increaseVolume();
		i.shutdown();
		
		i.makeCall();
		i.sendSMS();
		

	}

}
