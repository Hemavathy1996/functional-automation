package Seleniumpractice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
	     Thread.sleep(5000);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     WebElement customerid =driver.findElement(By.xpath("//input[@type='text'][1]"));
	     js.executeScript("arguments[0].scrollIntoView();",customerid);
	     customerid.sendKeys("6555");
	     Thread.sleep(5000);
	     
	     WebElement submitBtn =driver.findElement(By.xpath("//input[@type='submit'][1]"));
	     js.executeScript("arguments[0].scrollIntoView();",submitBtn);
	     submitBtn.click(); 
	     
	    // Alert alert=driver.switchTo().alert();
	    // alert.accept();//ok
	     Alert alert=driver.switchTo().alert();
	     alert.dismiss();//cancel
	     
	     
	     Thread.sleep(5000);
	     driver.quit();
	}
}
