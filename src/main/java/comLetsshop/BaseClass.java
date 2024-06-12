package comLetsshop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
   public static WebDriver driver;
   
   @BeforeTest
   public void loginToLetShop() throws InterruptedException 
	{
	    System.out.println("Launching Browser");
	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    driver.get("https://rahulshettyacademy.com/client");
		Thread.sleep(5000);
	
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("hema08@rahulshetty.com");
		Thread.sleep(5000);

		WebElement password=driver.findElement(By.id("userPassword"));
		password.sendKeys("Test@1234");
		Thread.sleep(5000);
		
		WebElement loginBtn=driver.findElement(By.id("login"));
		loginBtn.click();
		Thread.sleep(3000);
	}
	@Test
	public void SelectProduct()
	{
	    System.out.println("Method to Select Product");
		WebElement product1=driver.findElement(By.xpath("//button[contains(text(),'View')]"));
		product1.click();
	}
	@Test
	public void AddProductToCart() throws InterruptedException 
	{
	    System.out.println("Method to AddToCart");
		WebElement AddToCart=driver.findElement(By.xpath("//button[contains(text(),'Add To Cart')]"));
		AddToCart.click();
	}
	@AfterTest
	public void closeConnection() throws InterruptedException 
	{
	    System.out.println("Closing Connection.....");
		Thread.sleep(5000);	
		driver.quit();
	}
	public static void captureScreenshot() throws IOException
	{
		File files=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files, new File("./WD Screenshot.jpg"));
	}

	//@BeforeMethod
//	public void usermethod1()
	//{
		//System.out.println("Before test execution");
	
	//}
	
	//@BeforeClass
	//public void userBeforeClass()
	//{
		//System.out.println("Before class execution");

	//}
}

    
      
