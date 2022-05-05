package stepDefinations;

import org.testng.Assert;

import driverFactory.browserUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import utilities.CONSTANTS;

public class loginSteps 
{	
	loginPage login = new loginPage(browserUtility.get_driver());
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   String actualTitle =  login.getTitle();
	   String expectedTitle = CONSTANTS.LOGIN_PAGE_TITLE;
	   Assert.assertTrue(actualTitle.equals(expectedTitle));
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String email) {
	   login.enterEmail(email);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
	    login.enterPassword(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    login.doLoginButtonClick();
	}

	@Then("user should be landed on welcome screen")
	public void user_should_be_landed_on_welcome_screen() {
		String actualTitle =  login.getTitle();
		   String expectedTitle = CONSTANTS.WELCOME_PAGE_TITLE;
		   Assert.assertTrue(actualTitle.equals(expectedTitle));
	}

}
