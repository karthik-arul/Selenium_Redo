package week2.Day1;

public class FindDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,4,2,6,4,2,7,8,10,45,34,7,98,97,67,54,98};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

}
