package Seleniumpractice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	     Thread.sleep(10000);
	     WebElement submitBtn=driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
	     submitBtn.click();
	     Thread.sleep(10000);
	     Alert alert=driver.switchTo().alert();
	     System.out.println(alert.getText());
	     alert.sendKeys("selenium practice");
	     alert.accept();

	     Thread.sleep(10000);
	     driver.quit();
	}
}
