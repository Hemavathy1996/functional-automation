package nopcommerce.webautomation;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setConnection() throws InterruptedException
	{
		 System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://rahulshettyacademy.com/client");
			Thread.sleep(5000);	
	}
	

}
