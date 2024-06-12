package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpathpractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/client");
	        Thread.sleep(5000);	
			
		    WebElement email1=driver.findElement(By.xpath("//input[@id='userEmail']"));
			email1.sendKeys("hema08@rahulshetty.com");	
			Thread.sleep(5000);
			
			WebElement password=driver.findElement(By.xpath("//input[@id='userPassword']"));
			password.sendKeys("Test@1234");
			Thread.sleep(5000);
			
			WebElement loginbtn=driver.findElement(By.id("login"));
			loginbtn.click();
			Thread.sleep(5000);
			
			WebElement productname=driver.findElement(By.xpath("//b[contains(text(),'ZARA COAT 3')]"));
			System.out.println(productname.getText());
			Thread.sleep(5000);
		
			WebElement zara=driver.findElement(By.xpath("//b[contains(text(),'ZARA COAT 3')]"));
			zara.click();
			Thread.sleep(5000);
			driver.quit();
	}
}
