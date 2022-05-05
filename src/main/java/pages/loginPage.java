package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.elementUtils;

public class loginPage 
{
	private WebDriver driver;
	public elementUtils eUtils;
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
		eUtils = new elementUtils(driver);
	}
	
	private By email = By.xpath("//*[@id='email']");
	private By password = By.xpath("//*[@id='passwd']");
	private By loginButton = By.xpath("//*[@id='SubmitLogin']");
	public String getTitle()
	{
		return eUtils.doGetPageTitle();
	}
	
	public void enterEmail(String email)
	{
		eUtils.doSendKeys(this.email, email);
	}
	
	public void enterPassword(String password)
	{
		eUtils.doSendKeys(this.password, password);
	}
	
	public void doLoginButtonClick()
	{
		eUtils.doClick(loginButton);
	}
	
	public void testMethod()
	{
		System.out.println("this is test method");
	}
}
