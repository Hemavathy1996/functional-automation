package com.letshoptests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pageobjectmodel.Loginpage;
import com.pageobjectmodel.letshop.LoginPage;
import com.pageobjectmodelletshop.Homepage;

import comLetsshop.BaseClass;
import productpage.ProductPage;
public class TestCase2 extends BaseClass {

		@Test
		 public void logintoApp()
		 {
			 Loginpage loginPage= new Loginpage(driver);
			 loginPage.enterEmail("hema08@rahulshetty.com");
			 loginPage.enterPassword("Test@1234");
			 loginPage.clickOnLoginButton();
		 }
		
		@Test(dependsOnMethods="loginToLetshopApp")
	    public void selectAndAppProductIphone()
	     {
	    	
			Homepage homepage= new Homepage(driver);
	    	
	    	ProductPage productpage= new ProductPage(driver);
	    	
	        homepage.clickToViewIphone();
	        
			ProductPage.ClickAddToCart();
			
			productpage.ClickCartToView();
}
}
