package week2.Day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {34,45,98,96,78,87,67,99};
		int length = marks.length;
		System.out.println("Total Number: "+length);
		//print 6th value
		System.out.println(marks[5]);
		//print last 3
		System.out.println(marks[length-3]);
		
		System.out.println("================");
		//sort in Ascending
		Arrays.sort(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("=================");
		System.out.println(marks[3]);
		//System.out.println(marks[10]);
		System.out.println("=================");
		//Print in Descending  order
		for (int i = marks.length-1; i >=0 ; i--) {
			System.out.println(marks[i]);
		}
	}
}
