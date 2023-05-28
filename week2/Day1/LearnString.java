package week2.Day1;

public class LearnString {

	public static void main(String[] args) {
		//Declaration Method 1
		String name="Karthik";
		String name1="Karthik";
		
		//Declaration Method 2
		String data = new String("karthik");
		String data2= new String("Karthik");
		
		int length = name.length();
		System.out.println("Method 1 to find Length: "+length);
		
		//Method 2
		
		if(name.equals(data)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(data==data2) {
			System.out.println("== true");
		}else {
			System.out.println("== false");
		}
		
		//m2 equals
		
		//m3 equals ignore case
		if(name.equalsIgnoreCase(data)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//m4 contains
		boolean contains = name.contains("a");
		System.out.println(contains);
		
		//m5 toCharArray
		String name3="Karthikeyan";
		char[] charArray = name3.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//method 6
		char charAt = name3.charAt(5);
		System.out.println(charAt);
		
		//m7 toUpperCase
		String upperCase = name3.toUpperCase();
		System.out.println(upperCase);
		
		//m8 toLowerCase
		String lowerCase = name3.toLowerCase();
		System.out.println(lowerCase);
		
		//m9 - split
		String ch="Karthik is Learning Selenium";
		String[] split = ch.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
	}

}
