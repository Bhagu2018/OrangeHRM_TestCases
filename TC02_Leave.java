package VerifyTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC02_Leave {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhageshree/Documents/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		driver.get(baseUrl);
		
		WebElement userName = driver.findElement(By.xpath("//div/input[@name='txtUsername']"));
		userName.sendKeys("Admin");
		  
		WebElement pass = driver.findElement(By.xpath("//div/input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//div/input[@type='submit']"));
		login.click();
		
		Thread.sleep(3000);
		

		
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		
		WebElement apply = driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(apply).click().perform();
		// to select the leave type
		WebElement leaveType = driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']"));
		Select sel=new Select(leaveType);
		sel.selectByVisibleText("US - Personal");
		Thread.sleep(3000);
		
		WebElement balance = driver.findElement(By.xpath("//div[@id=\'applyleave_leaveBalance\']"));
		String leaves=balance.getText();
		System.out.println(leaves.substring(0,1));
		
		WebElement fromDate = driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
		fromDate.click();
		fromDate.sendKeys("2020-11-26");
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		
		//WebElement toDate= driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
		act2.sendKeys(Keys.TAB).perform();
		//toDate.click();
		//toDate.clear();
		act2.sendKeys("2020-11-27").perform();
		//toDate.sendKeys("2020-11-27");
		act2.sendKeys(Keys.ESCAPE).perform();
		
		
		WebElement leaveComment = driver.findElement(By.xpath("//textarea[@id='applyleave_txtComment']"));
		leaveComment.sendKeys("Please approve leave ASAP");
		
		WebElement applyButton = driver.findElement(By.xpath("//input[@id='applyBtn']"));
		applyButton.click();
		
		Thread.sleep(3000);
		
		
		driver.close();
}

}
	


