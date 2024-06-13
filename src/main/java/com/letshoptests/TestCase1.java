package com.letshoptests;
import java.io.IOException;
import org.testng.annotations.Test;
import com.pageobjectmodel.Homepage;
import com.pageobjectmodel.Loginpage;
import com.pageobjectmodel.Productpage;
import comLetsshop.BaseClass;
import productpage.ProductPage;
public class TestCase1 extends BaseClass {
     
	@Test
	 public void loginToLetshopApp() throws IOException
	 {
		 Loginpage loginPage= new Loginpage(driver);
		 loginPage.enterEmail("hema08@rahulshetty.com");
		 loginPage.enterPassword("Test@1234");
		 loginPage.clickOnLoginButton(); 
	 }
	
	@Test (dependsOnMethods="loginToLetshopApp")
    public void selectandAppProductZara() throws IOException
     {
		Homepage homepage= new Homepage(driver);
    	
    	ProductPage productpage= new ProductPage(driver);
    	
        homepage.clickToViewZara();
        
        productpage.ClickAddToCart();
		
		captureScreenshot();	 

     }
}
