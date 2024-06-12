package comLetsshop;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class UserSuperClass {
	
	@BeforeMethod
	public void usermethod1()
	{
		System.out.println("Before test execution");
	}

	@BeforeClass
	public void userBeforeClass()
	{
		System.out.println("Before class execution");
	}
	@AfterMethod
	public void userafterMethod()
	{
		System.out.println("After test execution");
	}
	@AfterClass
	public void userafterClass()
	{
		System.out.println("After class execution");
	}
}
