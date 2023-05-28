package week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassRoom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/login");
	}

}
