package screenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.out.println("Launching Browser");
	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/client");
		Thread.sleep(5000);
		
		File filescreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filescreenshot, new File(".//ScreenShot/screen.png"));
	}
		

	}


