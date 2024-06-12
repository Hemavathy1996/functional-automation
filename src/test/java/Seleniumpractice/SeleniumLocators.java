package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://rahulshettyacademy.com/client");
		
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.id("userEmail"));
		
		email.sendKeys("hemavathy1677@gmail.com");
		
		Thread.sleep(5000);

		WebElement password=driver.findElement(By.id("userPassword"));
		
		password.sendKeys("37788888");
		
		Thread.sleep(5000);
		
		WebElement login=driver.findElement(By.id("login"));
		
		login.sendKeys("click");
		
		Thread.sleep(5000);	
	}
}
