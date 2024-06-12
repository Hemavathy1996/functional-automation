package Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(5000);
		
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		System.out.println("Page Source: "+driver.getPageSource());
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}

