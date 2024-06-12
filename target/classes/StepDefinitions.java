import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import comLetsshop.BaseClass;

public class StepDefinitions {

    System.out.println("Launching Browser");
    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    driver.get("https://rahulshettyacademy.com/client");
	
	
	@Given("URL is loaded")
	public void url_is_loaded() {
	    
	   baseClass.openingURL();
	}

	@When("user enters the email ID")
	public void user_enters_the_email_id() {
	   
	    loginPage.enterEmail("hema08@rahulshetty.com");
	}

	@When("user enter the password")
	public void user_enter_the_password() {
	    loginPage.enterPassword("Test@1234");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickOnLoginButton();
	}

	@Then("verify logged in successfully")
	public void verify_logged_in_successfully() {
	    Assert.assertEquals(true,  homePage.pageHeader());
	    baseclass.closeConnection();
	}


}
