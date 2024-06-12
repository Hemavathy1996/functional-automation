package StepDefinition;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.pageobjectmodel.Homepage;
import com.pageobjectmodel.Loginpage;
import comLetsshop.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import productpage.ProductPage;

public class DefinitionClass extends BaseClass {
	
	@Given("URL is loaded")
	public void url_is_loaded() {
		
	 System.out.println("Launching Browser");
	    System.setProperty("WebDriver.chrome.driver", "C:/Users/ELCOT/Downloads/chromedriver-win64/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    driver.get("https://rahulshettyacademy.com/client");	
	}
	@When("user enters the email ID")
	public void user_enters_the_email_id() {
	   Loginpage loginpage= new Loginpage(driver);
	    loginpage.enterEmail("hema08@rahulshetty.com");
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		 Loginpage loginpage= new Loginpage(driver);
	    loginpage.enterPassword("Test@1234");
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		Loginpage loginpage= new Loginpage(driver);
	    loginpage.clickOnLoginButton();
	}

	@Then("verify logged in successfully")
	public void verify_logged_in_successfully() {
	    Homepage homepage = new Homepage(driver);
	    Assert.assertEquals(true, homepage.verfiyHomepageLoaded());
	}
	@When("click on the product zara")
	public void click_on_the_product_zara() {
	    Homepage homepage = new Homepage(driver);
	    homepage.clickToViewZara();
}
	@And("click Add To Cart button")
	public void click_Add_To_cart_button() {
	    ProductPage productpage = new ProductPage(driver);
	    productpage.ClickAddToCart();
}
	
	@When("click on the product iphone")
	public void click_on_the_product_iphone() {
	    Homepage homepage = new Homepage(driver);
	    homepage.clickToViewIphone();
}
}