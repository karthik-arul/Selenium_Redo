package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//add implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//open URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA link text
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//close the browser
		//driver.close();
	}

}
