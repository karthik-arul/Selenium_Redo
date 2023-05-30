package week3.Day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/following::a")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/preceding::input[@name='firstname']")).sendKeys("Shriya");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Karthik");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9884636100");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("newP@ssw0rd123");
		// Step 11: Handle all the three drop downs
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("27");
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Jun");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("2000");
		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();

	}

}
