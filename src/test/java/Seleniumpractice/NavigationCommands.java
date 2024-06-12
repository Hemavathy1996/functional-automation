package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.selenium.dev/");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//path|text()-'Documentation'|")).click();
	
	driver.navigate().back();
	
	Thread.sleep(5000);

	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	driver.quit();
	}

}
