package week2.Day1;

public class ReverseString {

	public static void main(String[] args) {
		String data="Amazon";
		char[] charArray = data.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
		}
		String rev="";
		for (int i = charArray.length-1; i >=0 ; i--) {
			rev=rev+data.charAt(i);
		}
		System.out.println("\n"+rev);
		//Using StringBuffer
		StringBuffer data1=new StringBuffer(data);
		StringBuffer reverse = data1.reverse();
		System.out.println(reverse);
	}

}
