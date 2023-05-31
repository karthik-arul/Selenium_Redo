package week3.Day2;

public class SmartPhone extends AndroidPhone {
	
	public void takeVideo() {
		System.out.println("Take video from Smart Phone");
	}
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.takeVideo();
		AndroidPhone a = new AndroidPhone();
		a.takeVideo();
	}

}
