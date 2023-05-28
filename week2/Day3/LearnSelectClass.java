package week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

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
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Select class
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceValue = new Select(source);
		sourceValue.selectByIndex(4);
		
		//WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mcValue=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		mcValue.selectByVisibleText("Automobile");
		
	}

}
