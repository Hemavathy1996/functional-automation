package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Keyboardaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	     Thread.sleep(10000);
	     WebElement rl=driver.findElement(By.xpath("//input[@value='radio2']"));
	     rl.click();
	     Thread.sleep(10000);
	     Actions a = new Actions(driver);
	     a.sendKeys("selenium")
	     .keyDown(Keys.CONTROL)
	     .keyDown("a")
	     .keyUp("a")
	     .keyDown("c")
	     .keyDown(Keys.CONTROL)
	     .keyDown(Keys.TAB)
	     .keyDown(Keys.TAB)
	     .keyDown(Keys.TAB)
	     .keyDown(Keys.TAB)
	     .keyUp(Keys.TAB)
	     .keyDown(Keys.CONTROL)
	     .keyDown("v")
	     .keyUp("v")
	     .keyUp(Keys.CONTROL)
         .build()
         .perform();
         Thread.sleep(5000);
	}
}
