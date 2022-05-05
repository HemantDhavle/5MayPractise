package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.browserUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks 
{
	public Properties prop;
	public WebDriver driver;


	@Before
	public void setUp()
	{
		browserUtility browserU = new browserUtility();
		prop = browserU.init_prop();
		driver = browserU.init_driver(prop);
	}
	
	@After(order=1)
	public void takeScreenshot(Scenario scenario)
	{
		byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		String screenshotName = scenario.getName();
		scenario.attach(src, "images/png", screenshotName);
	}
	
	@After(order=0)
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
