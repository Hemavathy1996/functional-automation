package productpage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    By addToCartBtn=By.xpath("//button[contains(text(),'Add to Cart')]");
    
    @FindBy(xpath="//button[contains(text(),'Cart')]/i")
    WebElement cartBtn;
    
    
    @FindBy(xpath="//div[@class='cartsection']/h3")
    WebElement productHeader;
    
    
    @FindBy(xpath="//button[contains(text(),'checkout')]")
    WebElement checkoutBtn;
        
    public void ClickAddToCart()
    {
    	driver.findElement(addToCartBtn).click();
    }
    public void ClickCartToView()
    {
    	cartBtn.click();
    }
    public String getProductName()
    {
    	return productHeader.getText();
    }
    public void clickCheckoutButton()
    {
    	JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();", checkoutBtn);
    	checkoutBtn.click();		
    }
}
