package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locatorsjava {

	public static void main(String[] args)throws InterruptedException {

	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		
		email.sendKeys("hemavathy1677@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.id("userPassword"));
		
		password.sendKeys("654577677");
		
		Thread.sleep(5000);
		
		WebElement loginbtn=driver.findElement(By.id("login"));
		
		loginbtn.click();
		
		Thread.sleep(5000);

		WebElement password1=driver.findElement(By.id("userPassword"));
				
		password1.sendKeys("654577677");
				
		Thread.sleep(5000);
				
		WebElement confirmpassword=driver.findElement(By.id("confirmPassword"));
		
		confirmpassword.sendKeys("654577677");
				
		WebElement register=driver.findElement(By.linkText("Register"));
		
		register.click();
		
		Thread.sleep(5000);
        WebElement firstname=driver.findElement(By.id("firstName"));
		
		firstname.sendKeys("Hemavathy");
		
		Thread.sleep(5000);
		
        WebElement lastname=driver.findElement(By.id("lastName"));
		
		lastname.sendKeys("G");
		
		Thread.sleep(5000);

	    WebElement email1=driver.findElement(By.id("userEmail"));
			
		email1.sendKeys("hemavathy1677@gmail.com");
			
		Thread.sleep(5000);
        WebElement phonenumber=driver.findElement(By.id("userMobile"));
		
		phonenumber.sendKeys("9356784444");
		
		Thread.sleep(5000);
			
		//WebElement occupationdropdown=driver.findElement(By.xpath("formcontrolname"));
				
		//occupation.selectByIndex("2");
				
		//Thread.sleep(5000);
	}

}


