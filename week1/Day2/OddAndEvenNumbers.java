package week1.Day2;

public class OddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =37;
		for (int i = 0; i <= n; i++) {
			if(i%2!=0) {
				System.out.println("The Number is Odd: "+i);
			}
		}
		System.out.println("====================================");
		for (int i = 0; i <= n; i++) {
			if(i%2!=1) {
				System.out.println("The Number is Even: "+i);
			}
		}
	}

}
