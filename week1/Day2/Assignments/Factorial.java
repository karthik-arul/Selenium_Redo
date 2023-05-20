package week1.Day2.Assignments;

public class Factorial {

	public static void main(String[] args) {
		int n=6;
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
		}
		System.out.println("The factorial of number "+n+ " is: "+sum);
	}

}
