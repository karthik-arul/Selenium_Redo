package week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClassroom {

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
		
		//driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Select class
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceValue = new Select(source);
		sourceValue.selectByIndex(4);
		
		//WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mcValue=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		mcValue.selectByVisibleText("Automobile");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryValue = new Select(industry);
		industryValue.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipValue = new Select(ownership);
		ownershipValue.selectByIndex(3);
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateValue = new Select(state);
		stateValue.selectByVisibleText("California");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9884636100");
		
		
	}

}
