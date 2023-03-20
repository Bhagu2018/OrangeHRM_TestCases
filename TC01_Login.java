package VerifyTestCase;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhageshree/Documents/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		driver.get(baseUrl);
		
		WebElement userName = driver.findElement(By.xpath("//div/input[@name='txtUsername']"));
		userName.sendKeys("Admin");
		  
		WebElement pass = driver.findElement(By.xpath("//div/input[@name='txtPassword']"));
		pass.sendKeys("admin7777");
		
		String expectedMess="Invalid credentials";
		
		WebElement login = driver.findElement(By.xpath("//div/input[@type='submit']"));
		login.click();
		
		WebElement acmessage = driver.findElement(By.xpath("//div[@id='divLoginButton']/span[@id='spanMessage']"));
		String actualMess=acmessage.getText();
		
		if(actualMess.equals(expectedMess))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");		
		}
		
		driver.close();
		

}
}

	