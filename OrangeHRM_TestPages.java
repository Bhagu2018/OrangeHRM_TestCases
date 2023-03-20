package VerifyTestCase;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_TestPages<Assignment2_Pages> {
	@Test

	public void HomePage() throws IOException, InterruptedException, InvalidFormatException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		OrangeHRM_VerifyTestCase Hpage = new  OrangeHRM_VerifyTestCase(driver);
		driver.get("https://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Hpage.TC01_Login();
		Hpage.TC01_Admin();
		Hpage.TC02_Admin();
		Hpage.TC01_NA();
		
	
	}


}
