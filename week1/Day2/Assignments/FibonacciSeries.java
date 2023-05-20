package week1.Day2.Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.print("The fibonacci series is: "+ num1+" ");
		System.out.print(num2+" ");
		for(int i=1;i<=10;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+" ");
			
		}

	}

}
