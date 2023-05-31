package week3.Day2;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("Addition of two numbers: "+ (a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Addition of three numbers: "+ (a+b+c));
	}
	
	public void multiply(double a, double b) {
		System.out.println("Multiplication of two double numbers: "+ (a*b));
	}
	
	public void multiply(float a, float b) {
		System.out.println("Multiplication of two float numbers: " + (a*b));
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(1, 5);
		c.add(4, 5, 9);
		c.multiply(4.5672d, 2.45354d);
		c.multiply(0.4f, -0.4f);
	}
}
