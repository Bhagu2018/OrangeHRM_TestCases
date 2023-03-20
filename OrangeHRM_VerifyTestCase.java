package VerifyTestCase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_VerifyTestCase {
	
	
	WebDriver driver;

	By TC01_Login= By.linkText("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
	By TC01_Admin= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
	By TC02_Admin= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	By TC01_NA= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a");
	
OrangeHRM_VerifyTestCase(WebDriver d) {
		
		driver=d;
	}

	
	public void TC01_Login() {


		driver.findElement(TC01_Login).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				driver.switchTo().alert().accept();
	}

		public void TC01_Admin()
	{
		driver.findElement(TC02_Admin).click();
		       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();           
        Actions actions = new Actions(driver);
            	WebElement UM = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a"));
    	
    	actions.moveToElement(UM).perform();
    	File excelFile = new File ("F:\\Bhageshree\\Software testing\\AssignmentFinal\\TestData.xlsx");

		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(excelFile);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XSSFSheet ws = wb.getSheet("TC02_Admin");
		int rowcount=ws.getLastRowNum();
		int colcount=ws.getRow(1).getLastCellNum();
		System.out.println("Rowcount is: "+rowcount);
		System.out.println("Column Count is "+colcount);

		//System.out.println("RowCount is   :" +rowcount+ "ColumnCount is :" +colcount);)
				
		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow Cdata=ws.getRow(i);

			String UN= Cdata.getCell(0).getStringCellValue();
			String EN= Cdata.getCell(1).getStringCellValue();
			


			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(UN);

			driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys(EN);

driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();           
        Actions actions1 = new Actions(driver);
            	WebElement UR = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]"));
    	
    	actions1.moveToElement(UR).perform();


			driver.findElement( By.cssSelector("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();

			driver.findElement(By.cssSelector("#voomplatform3-e83e7559-32cd-4d21-8fe5-970edce9bc8e")).click();
		}
	}


	public void TC02_Admin ()
	{
		driver.findElement(TC02_Admin).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();  
        Actions actions = new Actions(driver);

            	WebElement UR = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
    	
    	actions.moveToElement(UR).perform();
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/I")).click();  
        Actions actions2 = new Actions(driver);

            	WebElement ST = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
    	
    	actions2.moveToElement(ST).perform();

File excelFile = new File ("F:\\Bhageshree\\Software testing\\AssignmentFinal\\TestData.xlsx");

		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(excelFile);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XSSFSheet ws = wb.getSheet("TC02_Admin");
		int rowcount=ws.getLastRowNum();
		int colcount=ws.getRow(1).getLastCellNum();
		System.out.println("Rowcount is: "+rowcount);
		System.out.println("Column Count is "+colcount);

		//System.out.println("RowCount is   :" +rowcount+ "ColumnCount is :" +colcount);)

		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow Cdata=ws.getRow(i);

			String UN= Cdata.getCell(0).getStringCellValue();
			String EN= Cdata.getCell(1).getStringCellValue();
			String Pass= Cdata.getCell(0).getStringCellValue();
			String ConPass= Cdata.getCell(1).getStringCellValue();
			


			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(UN);

			driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys(EN);

driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input ")).sendKeys(Pass);     
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input ")).sendKeys(ConPass);           
      
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	
	}
	}

public void TC01_NA() 
{
driver.findElement(TC01_NA).click();
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
File excelFile = new File ("F:\\Bhageshree\\Software testing\\AssignmentFinal\\TestData.xlsx");

		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(excelFile);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XSSFSheet ws = wb.getSheet("TC01_NA");
		int rowcount=ws.getLastRowNum();
		int colcount=ws.getRow(1).getLastCellNum();
		System.out.println("Rowcount is: "+rowcount);
		System.out.println("Column Count is "+colcount);

		//System.out.println("RowCount is   :" +rowcount+ "ColumnCount is :" +colcount);)

		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow Cdata=ws.getRow(i);

			String NA= Cdata.getCell(0).getStringCellValue();
			
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/inputl")).sendKeys(NA);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

}
}

}







