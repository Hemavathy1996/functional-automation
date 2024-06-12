package com.utils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import nopcommerce.webautomation.BaseTest;

public class TestUtils extends BaseTest {
	
	public void takeScreenshot() throws IOException 
	{
		File filescreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filescreenshot, new File("./ScreenShot.png"));
	}

}
