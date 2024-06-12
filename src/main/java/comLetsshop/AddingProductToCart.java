package comLetsshop;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AddingProductToCart{
	 public static WebDriver driver;
	 
	   @Test
	   public void loginToLetShop() throws InterruptedException 
		{
		    System.out.println("Method to launch Browser");
		    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://rahulshettyacademy.com/client");
			Thread.sleep(5000);
			
			WebElement email=driver.findElement(By.id("userEmail"));
			email.sendKeys("hema08@rahulshetty.com");
			Thread.sleep(5000);

			WebElement password=driver.findElement(By.id("userPassword"));
			password.sendKeys("Test@1234");
			Thread.sleep(5000);
			
			WebElement login=driver.findElement(By.id("login"));
			login.click();
			Thread.sleep(3000);		
		}

		@Test
		public void SelectProduct()
		{
		    System.out.println("Method to Select 2nd Product");
			WebElement product1=driver.findElement(By.xpath("//*[@id=\"products\"]/div[1]/div[2]/div[3]/div/div/button[1]"));
			product1.click();
		}
		@Test
		public void addProductToCart() throws InterruptedException 
		{
		    System.out.println("Method to Add to Cart");
			WebElement addToCart=driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]"));
			addToCart.click();
			Thread.sleep(3000);
		}
		@Test
		public void closeConnection() throws InterruptedException 
		{
		    System.out.println("Method to close Browser");
			System.out.println("Welcome to TestNg");
			Thread.sleep(5000);
			driver.quit();	
		}
}

 
	      


	    
	      



