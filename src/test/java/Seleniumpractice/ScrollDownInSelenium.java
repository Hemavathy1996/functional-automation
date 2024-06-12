package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollDownInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	     Thread.sleep(10000);
	     
	    // WebElement restapi=driver.findElement(By.xpath("//a[text()='REST API']"));
	     //restapi.click();
	    // WebElement restapi=driver.findElement(By.xpath("//a[text()='REST API']"));
	     //Actions action =new Actions(driver);
	     //action.moveToElement(restapi).perform();
	     //System.out.println(restapi.getText());
	     
	    // WebElement restapi=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
	     //Actions action =new Actions(driver);
		 //action.moveToElement(restapi).perform();
		 //System.out.println(restapi.getText());
		 
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	    // js.executeScript("window.scrollBy(0,1000);", "");
	     //WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
	     //js.executeScript("arguments[0].scrollIntoView();",ele);
	     //Thread.sleep(10000);
	     
	     WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight);","");
	     js.executeScript("window.scrollBy(0,-350);","");
	     
	     Thread.sleep(10000);
	     driver.quit();
	     
	}
}
