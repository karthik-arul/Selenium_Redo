package week3.Day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Apply implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// open URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the username
		driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("Demosalesmanager"); // Enter password by ID
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		// Click on Login button using Class locator
		driver.findElement(By.xpath("//input[@id='username']/following::input[2]")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//div[@id='button']/div/a")).click();
		// Click on Leads Button
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
		// Click on create Lead Button
		driver.findElement(By.xpath("//a[text()='My Leads']/following::a")).click();
		// Enter CompanyName 
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("Helios");
		// Enter FirstName 
		driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Karthikeyan");
		// Enter LastName 
		driver.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("Arul");

		// Click on create Lead Button
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']/following::input")).click();
		
		//Click Edit
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']/following-sibling::a[2]")).click();
		//Change the company name
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).clear();
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("Helios Blitz");
		//Click Update
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']/following::input")).click();
	}

}
