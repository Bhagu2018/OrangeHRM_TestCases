import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04_NA_Edit {
	
	public static void main(String[] args) throws InterruptedException {
		checkBoxes1();
	}
	public static void checkBoxes1() throws InterruptedException
	{ 
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:/Users/Bhageshree/Documents/selenium/chromedriver.exe");
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
			
			WebElement admin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
			Actions act1=new Actions(driver);
			act1.moveToElement(admin).click().perform();
			
			WebElement NA = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a"));
			Actions act2=new Actions(driver);
			act2.moveToElement(NA).click().perform();
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i"));
			
			Edit.getText();
						
			WebElement SavBtt = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			Actions act4=new Actions(driver);
			act4.moveToElement(SavBtt).click().perform();
			
			driver.close();
			
			driver.quit();
				

}
}