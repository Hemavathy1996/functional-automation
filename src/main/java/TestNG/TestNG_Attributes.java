package TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestNG_Attributes 
{
      @Test(priority=0, testName ="TC001")
      public void First()
      {
      System.out.println("First Program");
      }
      
      @Test(priority=1, invocationCount = 7, testName ="TC002")
      public void Second()
      {
      System.out.println("Second Program");
      }
      
      @Test(priority=2, enabled = true, testName ="TC003", timeOut =500)
      public void Third()
      {
      System.out.println("Third Program");
      }
      
      @Test(priority=3, dependsOnMethods = {"First"},testName ="TC004")
      public void Fourth()
      {
      System.out.println("Fourth Program");
      }
      
      @Test
      public void loginToLetShop() throws InterruptedException 
   	{
   	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
   		 ChromeDriver driver = new ChromeDriver();
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
   		Thread.sleep(5000);
   		driver.quit(); 	}
  
   		
   	}

   	 

      
        

