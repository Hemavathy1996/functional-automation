package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     Thread.sleep(5000);
	     WebElement rc=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
         Actions a=new Actions(driver);
         a.contextClick(rc).perform();
         a.click(rc).perform();
	     Thread.sleep(5000);
	     WebElement dc=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
         a.doubleClick(dc).perform();
	     Thread.sleep(5000);
	     driver.quit();
	}
}
