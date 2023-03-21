import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_Admin_OR_LO {

	public static void main(String[] args) throws InterruptedException {
		
	 
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
			
			WebElement OR = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span"));
			Actions act2=new Actions(driver);
			act2.moveToElement(OR).click().perform();
			
			WebElement Loc = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a"));
			Actions act3=new Actions(driver);
			act3.moveToElement(Loc).click().perform();
			
			
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

				XSSFSheet ws = wb.getSheet("TC01_LO");
				int rowcount=ws.getLastRowNum();
				int colcount=ws.getRow(1).getLastCellNum();
				System.out.println("Rowcount is: "+rowcount);
				System.out.println("Column Count is "+colcount);

				//System.out.println("RowCount is   :" +rowcount+ "ColumnCount is :" +colcount);)

				for(int i=1; i<=rowcount; i++)
				{
					XSSFRow Cdata=ws.getRow(i);

					String Name= Cdata.getCell(0).getStringCellValue();
					String City= Cdata.getCell(1).getStringCellValue();
					
					driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(Name);

					driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(City);
					
					//driver.findElement(By.cssSelector("#hsForm_e83e7559-32cd-4d21-8fe5-970edce9bc8e > div.hs_submit.hs-submit > div.actions > input")).click();

					WebElement menuItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
					Actions action = new Actions(driver);
					action.moveToElement(menuItem);
					action.perform();
					menuItem.click();
					
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
					
				}

			}
			
			
}
