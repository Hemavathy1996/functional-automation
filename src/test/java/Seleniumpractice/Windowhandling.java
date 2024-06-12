package Seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test//upload/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		 driver.manage().window().maximize();
         String tab1=driver.getWindowHandle();

		// driver.switchTo().newWindow(WindowType.WINDOW);
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.manage().window().minimize();
		 
         Dimension d = new Dimension(400, 700);
         driver.manage().window().setSize(d);
		 driver.manage().window().maximize();

       //  driver.switchTo().newWindow(WindowType.TAB);
         
         driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/#");
	     WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']")); 
	     radio2.click();
         Thread.sleep(5000);
         
         String tab2=driver.getWindowHandle();
         System.out.println(tab1+" "+tab2);
         driver.switchTo().window(tab1);

	     WebElement choosebtn=driver.findElement(By.id("uploadfile_0")); 
         Thread.sleep(5000);
	     choosebtn.sendKeys("C:\\Users\\ELCOT\\Documents\\March21.java");
         
         Thread.sleep(5000);
         driver.quit();
	}
}
