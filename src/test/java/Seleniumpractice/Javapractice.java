package Seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javapractice {
	public static void main(String[] args) throws InterruptedException {
			 System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		     Thread.sleep(5000);
		     
		     WebElement cauliflower =driver.findElement(By.xpath("//h4[contains(text(),'Cauliflower')]/../div[3]/button"));
		     cauliflower.click();
		     Thread.sleep(5000);
		     
		     WebElement cartIcon =driver.findElement(By.xpath("//a[@class='cart-icon']"));
             cartIcon.click();
             
		     WebElement proceed =driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
             proceed.click();
             
             WebElement input=driver.findElement(By.xpath("//input[@class='promoCode']"));
             input.sendKeys("rahulshettyacademy");
             
             WebElement applyBtn =driver.findElement(By.xpath("//button[@class='promoBtn']"));
             applyBtn.click();
             
             WebElement result =driver.findElement(By.xpath("//span[@class='promoInfo']"));
             System.out.println(result.getText()); 
             WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
             System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
            
             Thread.sleep(5000); 
             driver.quit(); 
	}        
}
