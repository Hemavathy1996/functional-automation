package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
        Thread.sleep(5000);		
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
		
		WebElement occupationdropdown=driver.findElement(By.cssSelector("body > app-root > app-register > div.banner > section:nth-child(2) > div > div.login-wrapper.my-auto.p-5 > form > div:nth-child(3) > div:nth-child(1) > select"));
        occupationdropdown.click();
		Thread.sleep(5000);
		
		WebElement student=driver.findElement(By.xpath("//option[contains(text(),'Student')]"));
		student.click();
		Thread.sleep(5000);
		
		Select occupation=new Select(driver.findElement(By.xpath("//select[@formcontrolname='occupation']")));
		occupation.selectByIndex(2);
		Thread.sleep(5000);
		occupation.selectByValue("4: Scientist");
	    Thread.sleep(5000);
	    occupation.selectByVisibleText("Doctor");
	    Thread.sleep(5000);
	    
	    WebElement radioBtnFemale = driver.findElement(By.xpath("//input[@value='Female']"));
		boolean temp=radioBtnFemale.isEnabled();
		radioBtnFemale.click();
		System.out.println("Radio button selected:"+temp);
		Thread.sleep(5000);
		WebElement password1=driver.findElement(By.id("userPassword"));
		password1.sendKeys("654577677");
		Thread.sleep(5000);
		WebElement confirmpassword=driver.findElement(By.id("confirmPassword"));
		confirmpassword.sendKeys("654577677");
		Thread.sleep(5000);
	}

}



	  
		
		

