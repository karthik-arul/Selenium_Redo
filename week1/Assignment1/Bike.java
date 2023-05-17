package week1.Assignment1;

public class Bike {
	public void driveBike() {
		System.out.println("Drive Bike");
	}
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	public void isPuncture() {
		System.out.println("Is Puncture");
	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.driveBike();
		b.applyBrake();
		b.soundHorn();
		b.isPuncture();
	}
}
